package com.urang.dockerplay.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    // 메서드 수식자 - 메서드 반환값 - 패키지.클래스 또는 인터페이스 메서드명(인수형) - throw - 예외
    // - 는 공백 의미
    // ..은 모두 포함
    @AfterReturning("execution(* com.urang.dockerplay..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint){
        System.out.println("=========================");
        System.out.println("Completed: " + joinPoint);
        System.out.println("=========================");
    }

    @Around("execution(* com.urang.dockerplay..*Service.*(..))")
    public String logSleep(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("=========================");
        System.out.println("Before Around");
        String sleep = (String) pjp.proceed();
        System.out.println("After Around");
        System.out.println("=========================");
        return sleep;
    }
}

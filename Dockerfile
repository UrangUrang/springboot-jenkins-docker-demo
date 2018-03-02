FROM urang/dockerplay:aspect

COPY ./target/dockerplay-0.0.1-SNAPSHOT.jar /
CMD ["java", "-jar", "dockerplay-0.0.1-SNAPSHOT.jar"]
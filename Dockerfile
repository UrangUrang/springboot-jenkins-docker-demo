FROM jenkins/jenkins:lts

# Plugins 
COPY plugins.txt /usr/share/jenkins/ref/
RUN /usr/local/bin/install-plugins.sh $(cat /usr/share/jenkins/ref/plugins.txt)

# Maven
RUN mkdir -p /var/jenkins_home/.m2
# desc : COPY [--chown=<user>:<group>] <src>... <dest>
# desc : The --chown feature is only supported on Dockerfiles used to build Linux containers,
# COPY --chown=jenkins: settings.xml /var/jenkins_home/.m2/settings.xml

USER root
RUN wget http://ftp.jaist.ac.jp/pub/apache/maven/maven-3/3.0.5/binaries/apache-maven-3.0.5-bin.tar.gz
RUN tar xvzf apache-maven-3.0.5-bin.tar.gz
RUN mv apache-maven-3.0.5 /usr/local/maven

USER jenkins

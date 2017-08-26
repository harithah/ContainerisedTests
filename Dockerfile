FROM maven:3.2-jdk-8

#WORKDIR /home
COPY . /usr/src/app
#ADD ./pom.xml /home
WORKDIR /usr/src/app
RUN mvn clean install -DskipTests

#ADD . /usr/harithah/Selenium-DockerCompose/src
#COPY pom.xml /tmp/pom.xml
#RUN mvn -B -f /tmp/pom.xml -s /usr/share/maven/ref/settings-docker.xml dependency:resolve

#RUN cd home/Selenium-DockerCompose
#RUN mvn clean install -Dskiptests=true
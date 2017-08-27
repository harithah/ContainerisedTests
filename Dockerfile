FROM maven:3.2-jdk-8

COPY . /usr/src/app
WORKDIR /usr/src/app
RUN mvn clean install -DskipTests


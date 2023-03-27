FROM amazoncorretto:8-alpine-jdk
MAINTAINER ErikWagner
COPY target/ErikWagner-0.0.1-SNAPSHOT.jar ErikWagner-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ErikWagner-0.0.1-SNAPSHOT.jar"]
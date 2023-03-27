FROM amazoncorretto:8-alpine-jdk
MAINTAINER ErikWagner
COPY target/ErikWagner.jar ErikWagner.jar
ENTRYPOINT ["java","-jar","/ErikWagner.jar"]
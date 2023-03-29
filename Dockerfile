FROM amazoncorretto:11-alpine-jdk
MAINTAINER ErikWagner
COPY target/ErikWagner.jar Ew.jar
ENTRYPOINT ["java","-jar","/Ew.jar"]
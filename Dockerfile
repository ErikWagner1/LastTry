FROM amazoncorretto:11-alpine-jdk
MAINTAINER ErikWagner
COPY target/ErikWagner.jar Ew.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/Ew.jar"]
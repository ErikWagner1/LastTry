FROM amazoncorretto:11-alpine-jdk
MAINTAINER ErikWagner
COPY out/artifacts/ErikWagner_jar/ErikWagner.jar ErikWagner.jar
ENTRYPOINT ["java","-jar","/ErikWagner.jar"]
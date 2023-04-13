FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY build/libs/test-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8000-8089
ENTRYPOINT ["java","-jar","/app.jar"]
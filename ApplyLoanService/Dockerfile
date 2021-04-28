FROM openjdk:8-jdk-alpine
EXPOSE 9091
ADD target/loan-service.jar loan-service.jar
ENTRYPOINT  ["java", "-jar", "/loan-service.jar"]
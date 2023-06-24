FROM alpine:latest
COPY /target/*.jar first-business-service.jar
RUN apk add --no-cache openjdk17-jre
ENTRYPOINT ["java", "-jar", "first-business-service.jar"]
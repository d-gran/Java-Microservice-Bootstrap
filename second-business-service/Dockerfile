FROM alpine:latest
COPY /target/*.jar second-business-service.jar
RUN apk add --no-cache openjdk17-jre
ENTRYPOINT ["java", "-jar", "second-business-service.jar"]
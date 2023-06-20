FROM alpine:latest
COPY /target/*.jar api-gateway.jar
RUN apk add --no-cache openjdk17-jre
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]
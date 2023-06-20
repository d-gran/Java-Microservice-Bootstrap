FROM alpine:latest
COPY /target/*.jar service-discovery.jar
RUN apk add --no-cache openjdk17-jre
ENTRYPOINT ["java", "-jar", "service-discovery.jar"]
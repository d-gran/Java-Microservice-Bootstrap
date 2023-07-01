# Microservice Bootstrap Project

This is a basic template for a microservice project which is a good starting point for me to kickoff different projects.
It provides a starting point for building a microservice application. Of course - it can be further extended and customized.
Template is based on Eureka service discovery. Services are placed behind Spring Cloud Gateway reverse proxy.
Test are written in Groovy with Spock framework. Tracing is provided by Micrometer & Zipkin integration.

Nothing fancy but it serves as a good start!

## Getting Started

Follow the steps below to get started with the project:

### Prerequisites

Make sure you have the following software installed on your system:

- Java Development Kit (JDK) version 17 or later
- Maven build tool version 3.8.1 or later

### Usage

You can use this project as a starting point for developing your microservice application. The project structure follows best (known to me) practices for organizing a microservice architecture.

- You can modify the existing code or add new functionality as per your requirements.
- Configure the necessary dependencies and properties in the `pom.xml` file.
- Define your service endpoints and business logic in the appropriate packages.

### Installation

Using Maven, please run:
`mvn clean install`

### Deployment

Having Docker daemon up, in a `docker` catalog this example can be launched by:
`docker-compose up -d --build --scale first-business-service=3 --scale second-business-service=3`
3 replicas per service serve only as an example.

### Contributing

This project is currently in its initial state, and any contributions are welcome. If you find a bug or have an enhancement suggestion, please create an issue in the project repository.

### In progress

- Some infrastructural stuff (maybe Kubernetes);

## License

This project is licensed under the [MIT License](LICENSE.md).
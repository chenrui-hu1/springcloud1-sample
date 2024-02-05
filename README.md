# Spring Cloud Sample Project

## Introduction

This project is a sample Spring Cloud application that implements a microservices architecture with services like product and order management, and an API gateway for service routing.

## Prerequisites

- Java JDK 1.8
- Maven
- MySQL Server
- Nacos Service Discovery
- Alibaba Sentinel
- Jmeter

Ensure Java and Maven are installed on your system and the `JAVA_HOME` environment variable is set.

## Setup

1. Clone the repository to your local machine.
2. Create MySQL databases `shop_product` and `shop_order`.
3. Start the Nacos Service Discovery and Configuration server.
4.Start the Alibaba sentinel  and Jemeter to pull Http request.

## Services

The project includes the following microservices:

- **shop-product-api**: The API definition for the product service.
- **shop-product-server**: Implementation of the product service.
- **shop-order-api**: The API definition for the order service.
- **shop-order-server**: Implementation of the order service.
- **api-gateway**: The gateway service that routes API requests to the appropriate microservice.\

## Configuration

Each service has its own `application.yml` or `application.properties` file in the `src/main/resources` directory where you can set up the datasource, server port, and other configurations.

### Common Properties

- `server.port`: The port on which the service will run.
- `spring.application.name`: The name of the application in the service registry.
- `spring.datasource`: The datasource configuration.
- `spring.jpa`: The JPA/Hibernate configuration.
- `spring.cloud.nacos.discovery.server-addr`: The address of the Nacos server.

## Starting Services

Each microservice can be started with the Spring Boot Maven plugin. Below are the commands to start each service:

### API Gateway

```bash
cd api-gateway
mvn spring-boot:run
```


## Product Service

### API

To start the `shop-product-api`, run the following command:

```bash
cd shop-product-api
mvn spring-boot:run

```
### Server
To start the shop-product-server, use this command:

```bash
cd shop-product-server
mvn spring-boot:run
```
## Order  Service

### API

Start the shop-order-api with:
```bash
cd shop-order-api
mvn spring-boot:run

```
### Server
To launch the shop-order-server, execute:

```bash
cd shop-order-server
mvn spring-boot:run
```


## Nacos Setup

### Linux/Mac

```bash
sh startup.sh -m standalone

```

### Windows
```bash
startup.cmd -m standalone

```

##  Starting the Alibaba Sentinel Dashboard

Alibaba Sentinel provides a dashboard for monitoring and managing rules in a graphical interface.

To start the Sentinel dashboard, execute the following command in the directory where Sentinel is located

```bash
java -Dserver.port=8080 -jar sentinel-dashboard-1.8.0.jar

```
## Using JMeter for Performance Testing

Apache JMeter is an open-source load testing tool. You can use it to test the performance and stability of your services under different load conditions.

### Setting Up JMeter

- Download and install [Apache JMeter](https://jmeter.apache.org/download_jmeter.cgi).
- Open JMeter GUI by running the `jmeter` command in the `bin` directory of JMeter.
- Configure your test plan by adding Thread Groups, HTTP Request samplers, listeners, etc.

### Running a Simple Test

1. In JMeter, create a new Test Plan.
2. Add a Thread Group to define the number of users and ramp-up period.
3. Add an HTTP Request sampler to set up requests to your services.
4. Add a Listener (e.g., View Results in Table) to view the results.
5. Start the test by clicking the 'Start' button (green play icon).

### Integrating JMeter with Sentinel

To integrate JMeter with Sentinel, you need to:

1. Add the Sentinel dependency to your project's `pom.xml`.
2. Configure Sentinel resource rules in your application.
3. Run your JMeter tests and observe the results on the Sentinel dashboard.

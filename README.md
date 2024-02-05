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

## Services

The project includes the following microservices:

- **shop-product-api**: The API definition for the product service.
- **shop-product-server**: Implementation of the product service.
- **shop-order-api**: The API definition for the order service.
- **shop-order-server**: Implementation of the order service.
- **api-gateway**: The gateway service that routes API requests to the appropriate microservice.

## Starting Services

Each microservice can be started with the Spring Boot Maven plugin. Below are the commands to start each service:

### API Gateway

```bash
cd api-gateway
mvn spring-boot:run


### Product Service

### API

To start the `shop-product-api`, run the following command:

```bash
cd shop-product-api
mvn spring-boot:run


# SCHEDULE-API

[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

Spring Boot Back-end
Visão geral
Estas são APIs que o Spring Boot App exportará:

BASEURL: localhost:8080/
Database postgres: scheduledb


Methods	  | Urls	             | Actions
----------|--------------------|---------
POST	    |  /api/contacts	   |create new contacts
GET	      |  /api/contacts	   |retrieve all contacts
GET	      |  /api/contacts/:id |retrieve a contacts by :id
PUT	      |  /api/contacts/:id |update a contacts by :id
DELETE	  |  /api/contacts/:id |delete a contacts by :id

## Copyright

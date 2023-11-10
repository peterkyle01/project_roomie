# Project Roomie

This is the backend of the roomie01 react app which is a booking service software.

# Getting Started

### Techstack Used

- [Java 21](https://jdk.java.net/21/)
- [Apache Maven](https://maven.apache.org/guides/index.html)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#using.devtools)

# How to run the app

1. Open the app in the IDE of your choice

2. Open the terminal and git clone the master branch

3. Make sure you have [docker](https://www.docker.com/) and [docker-compose](https://docs.docker.com/compose/) installed.

4. Run `docker-compose up` in the terminal. This will create mysql database and phpMyAdmin.

5. While still in the terminal , run `./mvnw spring-boot:run`

6. The server will start on `http://localhost:8080` on your browser

7. Hit `http://localhost:8080/api/v1/room` to get all rooms.

8. See the Controllers for the other api endpoints.

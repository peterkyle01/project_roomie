FROM amazoncorretto:21-al2023-jdk

ENV SPRING_DATASOURCE_DRIVER_CLASS="com.mysql.cj.jdbc.Driver"
ENV SPRING_JPA_GENETATE_DDL="true"
ENV SPRING_JPA_SHOW_SQL="true"
ENV SPRING_JPA_PROPERTIES_HIBERNATE_FORMAT_SQL="true"
ENV SERVER_SSL_KEY_ALIAS="roomie01SSL"
ENV SERVER_SSL_KEY_STORE="classpath:peterkyle01.jks"
ENV SERVER_SSL_KEY_STORE_TYPE="JKS"
ENV SERVER_SSL_KEY_PASSWORD="roomie01PWD"
ENV SERVER_PORT=8443

WORKDIR /app

COPY /target/project_roomie-0.0.1-SNAPSHOT.jar /app/project_roomie.jar
COPY /src/main/resources/peterkyle01.jks /app/peterkyle01.jks

EXPOSE 8443

CMD ["java" ,"-jar", "project_roomie.jar"]


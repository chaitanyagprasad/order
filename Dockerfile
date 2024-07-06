FROM openjdk:21
MAINTAINER CHAITANYAGP
COPY target/order-0.0.1-SNAPSHOT.jar order-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/order-0.0.1-SNAPSHOT.jar"]
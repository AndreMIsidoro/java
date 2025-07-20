FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build
COPY . /build
WORKDIR /build/book-service
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
RUN apk add --no-cache curl
COPY --from=build /build/book-service/target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]

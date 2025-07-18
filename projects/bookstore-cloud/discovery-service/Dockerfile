FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build
COPY ../ /build
WORKDIR /build/discovery-service
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "app.jar"]

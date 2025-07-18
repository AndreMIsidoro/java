# --- Build stage ---
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /build
COPY ../ /build
WORKDIR /build/config-service
RUN mvn clean package -DskipTests

# --- Run stage ---
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "app.jar"]

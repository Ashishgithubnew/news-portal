# Stage 1: Build the application
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /build
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Run the application
# FIX: Replaced deprecated openjdk:17-jdk-slim with official Eclipse Temurin JDK 17
FROM eclipse-temurin:17-jre-jammy

# Set the working directory
WORKDIR /app

# FIX: Corrected compilation source path (removed the leading root slash from /target)
COPY --from=build /build/target/news-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]

# FROM maven:3.8.5-openjdk-17 AS build
# COPY . .
# RUN mvn clean package -DskipTests

# # Use a base image with JDK
# FROM openjdk:17-jdk-slim

# # Set the working directory
# WORKDIR /app

# # Copy the jar file into the container
# COPY --from=build /target/news-0.0.1-SNAPSHOT.jar app.jar

# # Expose the port your app runs on
# EXPOSE 8080

# # Run the application
# CMD ["java", "-jar", "app.jar"]

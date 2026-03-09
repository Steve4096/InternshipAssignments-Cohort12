# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-slim

# Set working directory inside the container created
WORKDIR /app

# Copy the built jar from the pipeline's built/ folder
COPY built/ app

# Expose the port your Spring Boot app runs on (default 8080)
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
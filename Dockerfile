# Use a valid OpenJDK 17 image
FROM openjdk:17-slim

# Set working directory inside the container
WORKDIR /app

# Copy the built jar from the pipeline's built/ folder
COPY built/app.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
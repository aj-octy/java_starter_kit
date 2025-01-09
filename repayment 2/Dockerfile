# Use the official OpenJDK 23 image as the base
FROM openjdk:23-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/repayment-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application listens on
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

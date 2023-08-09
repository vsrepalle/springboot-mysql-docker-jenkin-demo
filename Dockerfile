# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the target directory into the container
COPY target/grocery-mysql-docker-0.0.1-SNAPSHOT.jar app.jar

# Run the application when the container starts
CMD ["java", "-jar", "app.jar"]

# Use an official OpenJDK image as a base
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the Maven project files
COPY . .

# Build the application
RUN ./mvnw package -DskipTests

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/ecommerce-0.0.1-SNAPSHOT.jar"]

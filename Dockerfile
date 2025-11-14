# Step 1: Use a base image with Java
FROM openjdk:17-jdk-slim

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy your jar file from target folder
COPY target/springboot_demo-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Run the jar
ENTRYPOINT ["java","-jar","app.jar"]

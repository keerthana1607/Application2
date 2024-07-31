FROM openjdk:18
WORKDIR /app
COPY ./target/EmpPayroll-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "EmpPayroll-0.0.1-SNAPSHOT.jar"]

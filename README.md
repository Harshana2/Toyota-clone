Frontend - HTML , CSS , JavaScript
Backend - Springboot (Java)
Database - MySQL 

How to Run
Setting Up the Backend
Clone the repository to your local machine
Ensure you have Java JDK and Maven installed.

Update the database configuration in src/main/resources/application.properties:

```
spring.application.name=backend
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/Toyota?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true
Navigate to the backend directory and run the backend application:
```

The backend will be running on http://localhost:8080.

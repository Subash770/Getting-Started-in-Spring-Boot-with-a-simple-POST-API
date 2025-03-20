# Product Management API - Spring Boot

This is a simple Spring Boot application for managing products with MySQL integration. The application performs basic POST operations to add product data into a MySQL database.

## Features
- POST operation to add product data (name, price).
- MySQL database integration to store product data.

## Getting Started

### Prerequisites
- JDK 11 or higher
- MySQL 8.0
- Spring Boot

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/Subash770/Getting-Started-in-Spring-Boot-with-a-simple-POST-API
   ```

2. Create a MySQL database schema (e.g., `productdb`).

3. Update `application.properties` to configure your MySQL connection:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/productdb
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Postman API Endpoints
- **POST** `/products`: Add a product to the database.

## Documentation
For detailed project documentation, refer to the [Notion Documentation](https://stream-television-1a8.notion.site/Getting-Started-in-Spring-Boot-with-a-simple-POST-API-20-03-25-1bc476b2b1588002b746d46229eb3aa1).

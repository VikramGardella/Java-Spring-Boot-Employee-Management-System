# Java Spring Boot Employee and Vehicle Management System

## Author
Vikram Gardella

## Date
10-29-2018

## Overview
This project is a Java-based Spring Boot application that manages a company's employees and vehicle fleet's data.. It includes an Employee Management System with database connectivity and a Vehicle System utilizing dependency injection.

## Features
- **Employee Management System**
  - Add new employees
  - Retrieve employee details by ID
  - Uses `JdbcTemplate` for database interactions
- **Vehicle System**
  - Implements a `Motor` interface
  - Supports an `ElectricMotor` class
  - Allows `Car` objects to start and drive

## Technologies Used
- Java
- Spring Framework (Spring Boot, Spring JDBC, Spring MVC)
- XML-based and Annotation-based Configuration
- JDBC (for database operations)

## Project Structure
```
project-root/
│── src/main/java/hr/          # Employee Management Classes
│   ├── Driver.java             # Main class for employee operations
│   ├── Employee.java           # Employee entity class
│   ├── EmployeeService.java    # Service layer for employee operations
│   ├── EmployeeRowMapper.java  # Maps database records to Employee objects
│   ├── myController.java       # Controller for handling web requests
│
│── src/main/java/vehicle/      # Vehicle System Classes
│   ├── Car.java                # Car entity class
│   ├── Motor.java              # Motor interface
│   ├── ElectricMotor.java      # Implementation of Motor
│   ├── Driver.java             # Main class for vehicle operations
│
│── src/main/resources/
│   ├── application-context.xml # Spring XML configuration file
│
│── README.md                   # Project Documentation
```

## Setup & Installation
### Prerequisites
- Java JDK 11+
- Maven
- A database (e.g., MySQL, PostgreSQL)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/VikramGardella/Java-Spring-Boot-Employee-Management-System.git
   cd Java-Spring-Boot-Employee-Management-System
   ```
2. Configure your database in `application-context.xml`.
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Usage
- **Employee Management**
  - The `Driver` class initializes the Spring context and interacts with `EmployeeService` to add employees.
  - Use the `findByEmployeeId(int empID)` method to retrieve employees.

- **Vehicle System**
  - The `Driver` class initializes the Spring context and retrieves a `Car` bean.
  - Call `car.start()` to start the vehicle and `car.drive()` to set state to driving.

## License
This project is licensed under the MIT License.

# JDBC Student Database Project

## About

This is a Java JDBC project that connects a Java application with a MySQL database.

The project demonstrates basic database operations using JDBC.

## Technologies Used

- Java
- JDBC
- MySQL
- MySQL Connector/J
- VS Code

## Database

Database Name:

college

Table Name:

student

### Table Structure

| Column | Data Type | Description |
|---|---|---|
| id | INT | Student ID |
| name | VARCHAR(30) | Student Name |
| branch | VARCHAR(20) | Student Branch |

## JDBC Operations

This project demonstrates:

- MySQL database connection
- INSERT
- SELECT
- UPDATE
- DELETE
- PreparedStatement
- Statement
- ResultSet

## Project Structure

```text
JdbcProject
│
├── lib
│   └── mysql-connector-j-26.7.0.jar
│
├── src
│   └── JdbcDemo.java
│
└── README.md

# Student-Info-Lookup-Using-Java-and-HTML
# Student Info Lookup Web App

## 🔸 Description
This web app allows users to enter a Student ID and retrieve corresponding details from a MySQL database using a Java backend.

## 🔸 Technologies Used
- HTML
- Java Servlet
- JDBC
- Apache Tomcat
- MySQL

## 🔸 How It Works
1. User enters Student ID in `index.html`
2. Servlet (`StudentServlet`) receives request
3. Calls logic class `StudentData.java` to fetch data from MySQL
4. Displays student info in browser

## 🔸 MySQL Setup
```sql
CREATE DATABASE studentdb;
CREATE TABLE student (id INT, name VARCHAR(100), email VARCHAR(100), department VARCHAR(50));

# Student Attendance Web App 📝

A simple Java Servlet-based web application to mark and view student attendance using MySQL.

## 📁 Project Structure
StudentAttendance/
├── src/com/example/attendance/
│ ├── AttendanceServlet.java
│ └── AttendanceListServlet.java
├── WebContent/
│ ├── index.html
│ ├── success.jsp
│ └── css/style.css
│ └── WEB-INF/web.xml

## ⚙️ Technologies Used

- Java Servlets
- JSP
- HTML/CSS
- MySQL
- Apache Tomcat
- Eclipse IDE

## 📦 Features

- Mark attendance by entering a name
- View all students who marked attendance
- Stored securely in MySQL database

## 🧪 Setup Instructions

1. Clone this repository:
    ```bash
    git clone https://github.com/GeethaThallapelli/StudentAttendance
    ```
2. Import into Eclipse as a **Dynamic Web Project**
3. Set up MySQL database:
    ```sql
    CREATE DATABASE attendance_db;
    CREATE TABLE students (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(100) NOT NULL
    );
    ```
4. Deploy on Apache Tomcat
5. Visit: `http://localhost:8080/StudentAttendance`

## 🙋‍♀️ Author

Geetha Thallapelli




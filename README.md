# Student Management System

## Project Overview
The **Student Management System** is a console-based Java application that interacts with a MySQL database to perform **CRUD (Create, Read, Update, Delete) operations** on student records. This project demonstrates the integration of Java and SQL using JDBC and focuses on proper resource handling, code readability, and modular design.

---

## Features
- **Add Student**: Insert new student records into the database.
- **View Students**: Display all students in a tabular format.
- **Update Student**: Modify existing student records using their ID.
- **Delete Student**: Remove student records from the database.
- **Console Menu**: Simple text-based interface for user interaction.
- 
- **JDBC Best Practices**: Uses `PreparedStatement` to prevent SQL injection, handles exceptions, and closes resources properly.

  ## Project Structure
src/
└── studentdb/
├── DBConnection.java   # Handles database connection
├── Student.java        # Model class for student entity
├── StudentDAO.java     # Contains CRUD operations
└── Main.java           # User interface and menu-driven program


---

## Technical Requirements
- **Java Version**: Java 8 or later
- **Database System**: MySQL
- **IDE**: IntelliJ IDEA (recommended)
- **JDBC Driver**: MySQL Connector/J

How to Use
	1.	Add Student
	•	Enter Name, Age, and Email when prompted.
	2.	View Students
	•	Displays all students in the database with their ID, Name, Age, and Email.
	3.	Update Student
	•	Provide the student ID, then enter updated Name, Age, and Email.
	4.	Delete Student
	•	Provide the student ID to delete the corresponding record.
	5.	Exit
	•	Close the application safely.

⸻

Assumptions
	•	Emails are unique for each student.
	•	Users will provide valid input types (integer for age, string for name/email).
	•	MySQL server is running on localhost with default port 3306.
	•	No concurrent modifications are expected (single-user console application).

⸻



---

## Database Setup

1. Start your MySQL server.
2. Open MySQL Workbench or terminal and run the following SQL commands:

```sql
-- Create database
CREATE DATABASE IF NOT EXISTS studentdb;

-- Use the database
USE studentdb;

-- Create students table
CREATE TABLE IF NOT EXISTS students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL
);



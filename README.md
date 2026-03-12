🚀 Internship Portal - backend

This repository contains the backend implementation of the Internship Portal Web Application built using Spring Boot and MySQL.
It provides REST APIs to manage internships and internship applications.

---

🛠 Technologies Used

•Java 21
•	Spring Boot
•	Spring Data JPA
•	MySQL
•	Maven
•	REST API

---

✨ Features

•	View available internships
•	Add new internships
•	Update internship details
•	Delete internships
•	Apply for internships
•	Store internship applications in MySQL database
•	View all submitted applications
•	Perform CRUD operations for internships and applications

---

📂 Project Structure

src/main/java 
controller
service
repository
model

src/main/resources
application.properties

---

⚙ API Endpoints

Internship APIs

•	GET /api/internships
•	POST /api/internships
•	PUT /api/internships/{id}
•	DELETE /api/internships/{id}

---

Application APIs

•	POST /api/applications
•	GET /api/applications
•	PUT /api/applications/{id}
•	DELETE /api/applications/{id}

---

▶ How to Run the Project

1. Clone the repository

git clone https://github.com/YOUR_USERNAME/internship-portal-backend.git

2. Open the project in Spring Tool Suite / IntelliJ / VS Code

3. Create a MySQL database

internship_portal

4. Update database configuration in

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/internship_portal
spring.datasource.username=your_username
spring.datasource.password=your_password

5. Run the Spring Boot application

Server will start at

http://localhost:8080

---

🔗 Frontend Repository

Frontend code available at

https://github.com/abinaya098/internship-portal-frontend

---

👩💻 Developed by Abinaya Y

Update applications.properties

# Student Management System

A full-stack **Student Management System** built with **Spring Boot** for the backend and a **frontend client** for the user interface.

The application allows managing students: creating, reading, updating, and deleting student records.

---

## Project Structure

```
STUDENT-MANAGEMENT-SYSTEM
│
├── backend
│   ├── src/main/java/com/asmae/student
│   │   └── StudentsManagementSystemApplication.java
│   ├── src/main/resources
│   ├── pom.xml
│   └── mvnw
│
└── frontend
```

### Backend

Built with **Spring Boot**.

Responsibilities:

* REST API
* Business logic
* Database interaction

Main technologies:

* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok
* Spring boot devtools
* Maven

### Frontend

Client application that communicates with the backend API.

Possible technologies:

* React
* HTML / CSS / JavaScript

---

## Features

* Add new students
* View student list
* Update student information
* Delete students
* REST API architecture

---

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system
```

### 2. Run the backend

```bash
cd backend
./mvnw spring-boot:run
```

The server will start on:

```
http://localhost:8080
```

### 3. Run the frontend

```bash
cd frontend
npm install
npm start
```

---

## API Example

Example endpoint:

```
GET /api/students
```

Returns the list of students.


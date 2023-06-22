# Hostbooks-WebApp-Assignment
Hostbooks Web-App Test

**# Hostbooks-WebApp-Assignment**
Hostbooks Web-App Test
---

**# Table of Contents**

1. Getting Started
2. Prerequisites
3. Installation
4. Usage
5. API Endpoints
6. Deployment
8. Authors
9. Sample Demo - Video Link

---

**# Getting Started**

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

---

**# Prerequisites**

1. Java Development Kit (JDK): Install the latest JDK on your machine. Spring Boot requires Java to run.

2. Node.js and npm: Install Node.js and npm (Node Package Manager) on your machine. Angular is built on top of Node.js, and npm is used to manage Angular dependencies.

3. Angular CLI: Install the Angular CLI globally on your machine. The Angular CLI is a command-line tool that helps in creating and managing Angular projects. You can install it using npm:

`npm install -g @angular/cli`

4. Integrated Development Environment (IDE): Choose an IDE for development. Some popular options for Java and Angular development are IntelliJ IDEA, Eclipse, and Visual Studio Code. Install and set up your preferred IDE.


---

**# Installation**

### For Backend Springboot-Angular :
1) Clone this repository to local machine and open file location (HostbooksWeb-app)
2) Load Maven Propery in order to run springboot appplication 
3) Change Database properties in `application.properties`
4) Run applicationFile 

### For Frontend-Angular
1. open file location `cd hostbooks-webapp-angular`
2. run using command `ng serve`

Note : Run Springboot application and then angular application in your preffered IDE
---

**# Usage**

### Frontend -Angular
1. To install angular globally(cli.angular.io)
   ```npm install -g @angular/cli```
2.To Create Project 
    `ng new hostbook-employee-webapp`(Routing : Yes && Style : CSS)
3.to Create Component in angular application
    `ng g c <component_name>`
4.To Run Angular Application 
    `ng serve`

### MySql Database
1.To Create Database 
    `Create Database <database_name>`
2.Use Database
    `use <database_name>

### Backend_Springboot 
1.To Create Sprigboot project
    `https://start.spring.io/`
2.Add valid artifact Id and Details
3.Add dependencies
    Spring Web
    Spring Data JPA
    Spring Dev Tool 
    Lombok
    MYSQL Driver
    Validation

---

**# API Endpoints**

### Endpoints for the Employee Management application.

- Create Employee POST(`http://localhost:8081/hostbooks-app/v1/employee/addEmployee`)
    Sample Data :
        ```{
            "firstName": "ABC",
            "lastName": "XYZ",
            "email": "abcxyz@email.com"
        }```
- List Employee GET(`http://localhost:8081/hostbooks-app/v1/employee/all`)
- Update Employee PUT(`http://localhost:8081/hostbooks-app/v1/employee/updateEmployee`)
- Delete Employee DELETE(`http://localhost:8081/hostbooks-app/v1/employee/deleteEmployee/${id}`)
- View Employee GET(`http://localhost:8081/hostbooks-app/v1/employee/getEmployee/${id}`)


---

**# Deployment**

Add additional notes about how to deploy this on a live system.

---

**# Authors**

- **Kiran Kumar Sahoo** - **[kieransahoo](https://github.com/kieransahoo)**

---
**# Sample Video**

```
markdownCopy code
[![Demo Video](http://img.youtube.com/vi/VIDEO_ID/0.jpg)](http://www.youtube.com/watch?v=VIDEO_ID "Demo Video")

```

Just replace **`VIDEO_ID`** with the ID of your YouTube video.



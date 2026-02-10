Endterm Course API

Project Overvie
This project is a RESTful API developed using Spring Boot and PostgreSQL.
It provides CRUD operations for managing books and users and demonstrates clean architecture, design patterns, SOLID principles, and component-based management principles.

The application was created as part of a final project to demonstrate backend development skills using Java and Spring.


Architecture
The project follows a layered architecture:
Controller → Service → Repository → Database

Each layer performs a single function and interacts only with adjacent layers.


Technologies Used
Java 17+
Spring Boot
Spring Data JPA
PostgreSQL
Maven
Postman


Database
Database: PostgreSQL
Tables: books, users
Book Entity
Field	Type
id	Integer (PK)
name	String
author	String
book_type	EBOOK / PRINTED



API Endpoints

Books
Method	Endpoint	Description
GET	/api/books	Get all books
GET	/api/books/{id}	Get book by ID
POST	/api/books	Create new book
PUT	/api/books/{id}	Update book
DELETE	/api/books/{id}	Delete book



Users
Method	Endpoint	Description
GET	/api/users	Get all users
POST	/api/users	Create user
DELETE	/api/users/{id}	Delete user




Singleton
Used for application configuration to ensure a single shared instance.

Factory
Used to create different book types (EBook, PrintedBook) while returning the base Book type.

Builder
Used to construct Book objects with readable and flexible object creation.



Component Principles

REP (Reuse/Release Equivalence):
Reusable modules like design patterns are separated into their own package.

CCP (Common Closure Principle):
Classes that change together are grouped together (controller, service, repository).

CRP (Common Reuse Principle):
Components depend only on what they use. No unnecessary dependencies.


SOLID Principles

S — Single Responsibility: each class has one responsibility

O — Open/Closed: new book types can be added without modifying existing code

L — Liskov Substitution: subclasses (EBook, PrintedBook) replace base class safely

I — Interface Segregation: service interfaces are small and focused

D — Dependency Inversion: controllers depend on service interfaces


Global Exception Handling
The project uses @ControllerAdvice for centralized exception handling.
Example error response:
{
  "status": 404,
  "message": "Book with id 10 not found",
  "timestamp": "2026-02-09T19:40:12"
}



How to Run the Project
1.Create PostgreSQL database: CREATE DATABASE endterm_db;
2.Configure application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/endterm_db
spring.datasource.username=postgres
spring.datasource.password=postgres
spring.jpa.hibernate.ddl-auto=update


Testing
CRUD operations for both Books and Users work correctly.


Conclusion

This project demonstrates:

REST API development

Clean architecture

Design patterns

SOLID principles

Component principles

Database integration

The application is scalable, maintainable, and follows best practices.


Author
Student: Orazbai Bakytzhan
Course: Object Oriented Project
Year: 2026

# Simple JWT Project

A simple Java project demonstrating **JWT (JSON Web Token) authentication** without Spring Security.  
This project includes JWT generation and validation using a custom filter.

---

## Features

- Generate JWT tokens for authentication
- Validate JWT tokens for protected endpoints
- Simple Java implementation using **Servlet Filter**
- No Spring Security integration

---

## Project Structure
```
src/main/java
├── com.example.Jwt_project
│ ├── config
│ │ └── JwtFilter.java
│ ├── controller
│ | └── AuthController.java
| | └── WelcomeController.java
│ ├── util
│   └── JwtUtil.java
```

- **JwtUtil.java**: Contains methods to generate and validate JWT tokens.
- **JwtFilter.java**: Servlet filter that checks Authorization header and validates the JWT.
- **Main.java / Controller**: (Optional) Your endpoint to test login and token validation.

---

## Dependencies
This project uses **Maven** to manage dependencies. Main dependencies include:

```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-api</artifactId>
			<version>0.11.5</version>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-impl</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt-jackson</artifactId>
			<version>0.11.5</version>
			<scope>runtime</scope>
		</dependency>

	</dependencies>
```  

## How to Run
Clone the repository:
- git clone https://github.com/username/simple-jwt-project.git

## Test endpoints:
- Login endpoint: /login → Returns JWT token
- Protected endpoint: Any other URL → Must pass JWT token in Authorization: Bearer <token> header

## Notes
- This is a simple JWT project for learning purposes.
- It is not integrated with Spring Security or any framework.

## Resource
- Link: https://docs.google.com/document/d/1TZ9N8M1iNgrOrkK1-DPq9tb9J8ab0fAOHblbw0507rA/edit?usp=sharing

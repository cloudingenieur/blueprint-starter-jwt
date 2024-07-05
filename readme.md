# Blueprint Starter JWT 

### Features
- User Registration and Login with JWT Authentication
- Refresh Token stored in db
- Email and Password Validators
- Role-Based Authorization with authorities
- Customized Access Denied Handling
- OpenAPI Documentation Integration (Swagger)
- Ready for any spring boot project

# Technologies

- Spring Boot 3.3.1
- Spring Security 6.3.1
- Spring Data JPA
- Spring Boot custom Validation
- JSON Web Tokens(JWT)
- BCrypt
- Maven
- OpenAPI(SpringDoc Impl)
- Lombok

# TODO
- Implement Rate Limiter to register endpoint (new Repo)
- Implement captcha to login and register endpoint (new Repo)

# Getting Started
To get started with this project, you will need to have the following installed on your local machine:
- JDK 22
- Maven 3.9.2
## Configure Spring Datasource, JPA, App properties
1. Clone the repository
2. Open src/main/resources/application.yml
```
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/bookme
    username: postgres
    password: postgres
```
## Build and run the Project
- Build the project: `mvn clean install`
- Run the project: `mvn spring-boot:run`

The application will be available at http://localhost:8086.

# Test project
### Bruno 
There is a Bruno folder, you can import the files and test the api.

### Swagger
For detailed documentation and testing of the APIs, access the Swagger UI by visiting:
```
http://localhost:9091/swagger-ui.html
```

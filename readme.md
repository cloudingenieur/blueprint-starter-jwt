# JWT Implementation with Spring Boot 3.3.1 and Spring Security 6.3.1

This repository showcases a project that demonstrates the implementation of JSON Web Tokens (JWT) with Spring Boot 3.3.1 and Spring Security 6.3.1. The project includes the following functionalities:

- User Registration and Login with JWT Authentication
- Refresh Token stored in db
- Role-Based Authorization with authorities
- Customized Access Denied Handling
- OpenAPI Documentation Integration (Swagger)

# Technologies

- Spring Boot 3.3.1
- Spring Security
- Spring Data JPA
- Spring Boot custom Validation
- JSON Web Tokens(JWT)
- BCrypt
- Maven
- OpenAPI(SpringDoc Impl)
- Lombok

# TODO
- Implement Rate Limiter to register endpoint
- Implement Recapcha to login and register endpoint

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
  jpa:
    hibernate:
      ddl-auto: create
    show-sql: true
    properties:
      hibernate:
        format_sql: true
    database: postgresql
    database-platform: org.hibernate.dialect.PostgreSQLDialect
server:
  port: 9091
application:
  security:
    jwt:
      secret-key: 586B633834416E396D7436753879382F423F4428482B4C6250655367566B5970
      expiration: 86400000 # a day
      refresh-token:
        expiration: 604800000 # 7 days
```
## Build and run the Project
- Build the project: `mvn clean install`
- Run the project: `mvn spring-boot:run`

The application will be available at http://localhost:8086.

# Test project
### Bruno 
There is a Bruno folder, you can import the files and test the api.

### User registration endpoint
`POST http://localhost:9091/api/v1/auth/register`


For detailed documentation and testing of the APIs, access the Swagger UI by visiting:
```
http://localhost:9091/swagger-ui.html
```

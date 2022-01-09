## General info
These are the instructions for compiling and running the challenge project.

## Prerequisites
* Docker installed
* Docker-compose installed

## Setup
To run this project, install it locally using commands:

```
$ git clone https://github.com/marcoslozina/tenpo.git
$ cd tenpo
$ mvnw clean package
$ docker-compose up --build
```
## Services
Project endpoints services:
* Documentation API:GET http://localhost:8081/api/v1/swagger-ui.html
* Signup:POST http://localhost:8081/api/v1/signup
* Login:POST http://localhost:8081/api/v1/login
* Sum:GET http://localhost:8081/api/v1/sum?value1=8&value2=5
* Traces:GET http://localhost:8081/api/v1/traces?pageNumber=0&pageSize=10
	

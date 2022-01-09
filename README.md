## General info
These are the instructions for compiling and running the challenge project.

## Requerimientos:
1. Debes desarrollar una API REST en Spring Boot con las siguientes funcionalidades:
a. Sign up usuarios.
b. Login usuarios.
c. Sumar dos números. Este endpoint debe retornar el resultado de la suma y puede ser consumido solo por usuarios logueados.
d. Historial de todos los llamados a todos los endpoint. Responder en Json, con data paginada.
e. Logout usuarios.
f. El historial y la información de los usuarios se debe almacenar en una database PostgreSQL.
g. Incluir errores http. Mensajes y descripciones para la serie 4XX.
2. Esta API debe ser desplegada en un docker container. Este docker puede estar en un dockerhub público. La base de datos también debe correr en un contenedor docker. Recomendación usar docker compose.
3. Debes agregar un Postman Collection o Swagger para que probemos tu API.
4. Tu código debe estar disponible en un repositorio público, junto con las instrucciones de cómo desplegar el servicio y cómo utilizarlo.



## Prerequisites
* Git installed
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

## Additional Information
* The collections to import to postman are in the directory: /src/main/resources/
* Explanatory video of the resolution of the challenge: https://www.youtube.com/watch?v=nIH92WRmIy8

	

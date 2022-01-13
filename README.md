## Información General
Este archivo contiene información general para poder descargar, compilar y ejecutar el proyecto del desafío.

## Requerimientos:
* Debes desarrollar una API REST en Spring Boot con las siguientes funcionalidades:
* Sign up usuarios.
* Login usuarios.
* Sumar dos números. Este endpoint debe retornar el resultado de la suma y puede ser consumido solo por usuarios logueados.
* Historial de todos los llamados a todos los endpoint. Responder en Json, con data paginada.
* Logout usuarios.
* El historial y la información de los usuarios se debe almacenar en una database PostgreSQL.
* Incluir errores http. Mensajes y descripciones para la serie 4XX.
* Esta API debe ser desplegada en un docker container. Este docker puede estar en un dockerhub público. La base de datos también debe correr en un contenedor docker.    Recomendación usar docker compose.
* Debes agregar un Postman Collection o Swagger para que probemos tu API.
* Tu código debe estar disponible en un repositorio público, junto con las instrucciones de cómo desplegar el servicio y cómo utilizarlo.

## Prerrequisitos
* Tener instalado Git
* Tener instalado Docker 
* Temer instalado Docker-compose

## Servicios expuestos
* Documentation API:GET http://localhost:8081/api/v1/swagger-ui.html
* Signup:POST http://localhost:8081/api/v1/signup
* Login:POST http://localhost:8081/api/v1/login
* Sum:GET http://localhost:8081/api/v1/sum?value1=8&value2=5
* Traces:GET http://localhost:8081/api/v1/traces?pageNumber=0&pageSize=10


	

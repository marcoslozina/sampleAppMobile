# tenpo
Challenge project



git clone https://github.com/marcoslozina/tenpo.git
git clone https://github.com/marcoslozina/tenpo.git
cd tenpo
mvnw clean package
docker-compose up --build

Documentacion de la API
GET http://localhost:8081/api/v1/swagger-ui.html

signup
POST http://localhost:8081/api/v1/signup

login
POST http://localhost:8081/api/v1/login

sum
GET http://localhost:8081/api/v1/sum?value1=8&value2=5

traces
GET http://localhost:8081/api/v1/traces?pageNumber=0&pageSize=10

# trial-spring-data-mongoDB
familiarize with spring-data-mongodb to store data in document based NoSQL DB

#start application as boot application 
mvn spring-boot:run
CommandLineRunner run override saves the names to the local mongo 
use all kind of CURD operaitons with Mongorepository template.
use the api as http://localhost:8080/api/customers/getall  to fetch all data from the DB (findAll())

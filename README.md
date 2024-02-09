## Spring EurekaClient LoadBalancer

Sysot link:

    https://sysout.ru/mikroservisy-eureka-i-client-side-load-balancing/
    https://github.com/myluckagain/sysout/tree/master/cloud1

GitHub links:

    https://github.com/AnatolSalau/SpringEurekaClientBalance

### ZOO microservice
Client(User) get any animal
port:

    8081

entrypoint:

    localhost:8081/animals/any

### Random animal microservice
Zoo microservice get random animals

ports:

    8082
    8083

entrypoints:

    localhost:8082/random
    localhost:8083/random

###Eureka
Server
default entrypoint:

    http://localhost:8080/

    
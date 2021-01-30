# keycloak-springboot-microservice

Simple integration with keycloak for bom-destino 

PUC capstone. 

# Setting up 

You can run keycloak with docker with this simple command: 
**docker run -p 8080:8080 -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin quay.io/keycloak/keycloak:12.0.2**

You can access the admin panel using this url: **http://localhost:8080/auth/admin/master/console/**

After doing this, go to import (in the keycloak's admin panel) and import the keycloak-realm.json. 

**Now you can run the application. Have fun.** 

# This API has a front end!! 
Access this url to run Bom-Destino front-end pages 
**https://github.com/MrKalb/bom-destino-vue**

# Spring Keycloak Client

This app demonstrates user authentication with Spring Boot using Keycloak.

The app consists of a homepage with a link to a greeting page only accessible to
logged-in users. Upon clicking on the link the user will be redirected to the Keycloak
login page. After a successful login the user will be directed to the secured greetings
page.

Out of the box the Keycloak server needs to run on http://localhost:8081. The location
of the server can be adjusted in the *application.properties*.
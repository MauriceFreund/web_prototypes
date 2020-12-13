# React Keycloak Client

This app demonstrates user authentication in React using Keycloak.

The app consists of two pages, one of which is only accessible to logged in users. Upon clicking the link to the
secured page the user will be redirected to login page of Keycloak. After a successful login the user will be redirected
to the secured page.

Out ouf the box the Keycloak server needs to be running on http://localhost:8081. The location of the server
can be altered in *public/keycloak.json*.

Code is taken from this [tutorial](https://scalac.io/user-authentication-keycloak-1/).
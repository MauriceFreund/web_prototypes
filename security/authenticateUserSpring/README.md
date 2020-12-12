# Authenticate User Spring

A small web app demonstrating user authentication based on Springs security component.

The code is taken from the [Baeldung tutorial](https://spring.io/guides/gs/securing-web/) on this topic.

## Structure

The app contains three HTML-Pages defined with Thymeleaf templates:
* *home* - Provides a link to *hello*. Unauthorized users are redirected to *login*.
* *hello* - Displays a greeting message to the entire world.
* *login* - Allows the user to enter credentials through a form and performs the login process.

Internally two config components define the behavior of the app:
* *MvcConfig* - Defines which endpoints point to which of the template pages.
* *WebSecurityConfig* - Determines which pages can be accessed by authorized users only. Also provides a credential 
                        provider with a dummy user.
  
## Security drawbacks

This app only handles the authentication process, i.e. authenticating users and determining which pages are available
to a user. The user credentials are sent as plain text over HTTP introducing vulnerability to "man-in-the-middle" attacks.
Also, the storage of the credentials is neither secured nor permanent. After the app is restarted, all information is lost.
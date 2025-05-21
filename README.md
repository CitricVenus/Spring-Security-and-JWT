Run project:  
Use `mvn spring-boot:run` to run the project

Use `/register` to create a user with **ADMIN** or **USER** role.  
### Example of create new user:  
` {
"username" : "admin3",
"password" : "admin3",
"role" : "ADMIN"
}`

Just all Users can acces to `/register` and `/login` enpoint.   
If use `/login` with **Admin** credentials, you will have a token, this token you can put in Postam to use  **Admin** endpoints, otherwise you will have a `401 Response`  
Exmaple of `/login`  

` {
"username" : "admin3",
"password" : "admin3",
}`

**Admin Users** have acces to root `/api/admin`:  
- `/getusers`
- `/adduser`
- `/delete/{id}`
- `/getuser/{id}`
    
  Rsponse will give you the object.

  

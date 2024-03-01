A Spring Rest APi Security project that generates a json web token.

You can register users using the http://localhost:8080/api/auth/register request:
</br>

<img src="https://i.postimg.cc/j2MBzZV1/register.png" alt="register">

</br>

if you try to register a user who already exists in the Mysql javax generated database the 
restrictions will not allow it.

</br>

 <img src="https://i.postimg.cc/MTnvVrjc/taken.png" alt="taken">

</br>

and you can generate the jwt with the http://localhost:8080/api/auth/login request:

</br>

<img src="https://i.postimg.cc/q7ZPhmTZ/login.png" alt="login">

</br>

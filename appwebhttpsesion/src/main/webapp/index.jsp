<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplos httpSession</h1>
        <form action = "/appwebhttpsesion/ServletSalida" method="post">
        <label for="txtUsuario">Usuario:</label>
        <input type="text" id="txtUsuario" name="txtUsuario">
        <input type="submit" value="Iniciar Sesion">
        </form>
    </body>
</html>

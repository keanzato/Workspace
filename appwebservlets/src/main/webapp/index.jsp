<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h2><%=request.getAttribute("variableInicio") %></h2>
       <form action="/appwebservlets/ServletRespuesta" method="post">
	       <label for="txtUsuario">Nombre usuario: </label>
	       <input type="text" id="txtUsuario" name="txtUsuario">
	        <label for="txtPassword">Password: </label>
	       <input type="password" id="txtPassword" name="txtPassword">
	       <input type="submit" value="Enviar datos">
       </form>
    </body>
</html>

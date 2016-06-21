<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Estoy en index.jsp</h1>
        <form action="/appwebfilter/ServletIndex" method="post">
        	<input type="text" id="txtNombre" name="txtNombre">
        	<input type="submit" value="Enviar">
        </form>
        <a href="/appwebfilter/ServletSalida">ir a salida</a>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<h1>Datos de la persona</h1>
    	<form action="/appwebean/ServletSalida" method="post">
    	<label for="txtNombre">Nombre</label>
    	<input type="text" id="txtNombre" name="txtNombre">
    	<br>
    	<label for="txtApellidoPaterno">Apellido paterno</label>
    	<input type="text" id="txtApellidoPaterno" name="txtApellidoPaterno">
    	<br>
    	<label for="txtApellidoMaterno">Apellido Materno</label>
    	<input type="text" id="txtApellidoMaterno" name="txtApellidoMaterno">
    	<br>
    	<label for="txtRut">Rut</label>
    	<input type="text" id="txtRut" name="txtRut">
    	<br>
    	<input type="submit" value="Enviar datos">
    	</form>
    </body>
</html>

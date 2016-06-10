<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<jsp:useBean id="beanPersona" class="cl.keanzato.app.bean.BeanPersona" scope="request"></jsp:useBean>
        <h1>Datos recibidos</h1>
        <b>Nombre: </b><%=beanPersona.getNombre() %>
        <br>
        <b>Apellido Paterno: </b><jsp:getProperty property="apellidoPaterno" name="beanPersona"/>
        <br>
        <b>Apellido Materno: </b><jsp:getProperty property="apellidoMaterno" name="beanPersona"/>
        <br>
        <b>Rut: </b><jsp:getProperty property="rut" name="beanPersona"/>
        <br>
    </body>
</html>

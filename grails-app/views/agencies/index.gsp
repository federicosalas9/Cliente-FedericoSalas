<%--
  Created by IntelliJ IDEA.
  User: fsalas
  Date: 2019-04-26
  Time: 08:58
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <head>
        <title>Formulario</title>
    </head>
</head>

<body>
<g:form controller="agencies" action="enviar">
    <label>ID del Sitio: </label>
    <g:textField name="site_id" required="true"/><br/>
    <label>Metodo de pago: </label>
    <g:textField name="payment_method_id" required="true"/><br/>
    <label>Latitud: </label>
    <g:textField name="latitud" required="true"/><br/>
    <label>Longitud: </label>
    <g:textField name="longitud" required="true"/><br/>
    <label>Radio: </label>
    <g:textField name="radio" required="true"/><br/>
    <label>Limit: </label>
    <g:textField name="limit" required="true"/><br/>
    <label>Offset: </label>
    <g:textField name="offset" required="true"/><br/>
    <label>Criterio: </label>
    <g:textField name="criterio" required="true"/><br/>
    <g:actionSubmit value="Enviar" required="true"/>
</g:form>
</body>
</html>
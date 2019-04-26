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
    <g:textField name="site_id"/><br/>
    <label>Metodo de pago: </label>
    <g:textField name="payment_method_id"/><br/>
    <label>Latitud: </label>
    <g:textField name="latitud"/><br/>
    <label>Longitud: </label>
    <g:textField name="longitud"/><br/>
    <label>Radio: </label>
    <g:textField name="radio"/><br/>
    <label>Limit: </label>
    <g:textField name="limit"/><br/>
    <label>Offset: </label>
    <g:textField name="offset"/><br/>
    <label>Criterio: </label>
    <g:textField name="criterio"/><br/>
    <g:actionSubmit value="Enviar"/>
</g:form>
</body>
</html>
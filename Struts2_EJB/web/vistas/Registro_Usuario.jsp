<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>CR-Autos CUC</title>
    </head>
    <body>
           
        <s:div cssClass="container">
            <s:div cssClass="row" >
                <h4>Ingrese Datos del Usuario</h4> <br>
                
                <s:form method="post" action="Registrar_Usuario" cssClass="form-inline col-md-6">
                    <s:label>Nombre Usuario</s:label>
                    <s:textfield name="Nombre" label="" cssClass="form-control"/><br>
                    <s:label>Apellido Usuario</s:label>
                    <s:textfield name="Apellido" label="" cssClass="form-control"/><br>
                    <s:label>Correo Usuario</s:label>
                    <s:textfield name="Correo" label="" cssClass="form-control"/><br>
                    <s:label>Telefono Usuario</s:label>
                    <s:textfield name="Telefono" label="" cssClass="form-control"/><br>
                    <s:label>Direccion Usuario</s:label>
                    <s:textfield name="Direccion" label="" cssClass="form-control"/><br>
                    <s:label>Apodo Usuario</s:label>
                    <s:textfield name="Apodo" label="" cssClass="form-control"/><br>
                    <s:label>Contraseña Usuario</s:label>
                    <s:textfield name="Pass" label="" cssClass="form-control"/><br><br>
                    
                    <s:submit value="Registrar"/>                       
                </s:form>
            </s:div>
            
        </s:div>
        
    </body>
</html>

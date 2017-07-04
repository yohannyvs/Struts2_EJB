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
            <s:div cssClass="row">
                <s:form action="listar_autos" cssClass="form-inline col-md-12">
                    <h3>Inicie Sesión</h3>
                    <s:label>Usuario:</s:label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <s:textfield name="Apodo" cssClass="form-control"/><br><br>
                    <s:label>Contraseña:</s:label>
                    <s:textfield name="Pass" cssClass="form-control"/><br><br>
                    <s:submit value="Entrar"/>  <br><br>                  
                </s:form>
                
                <s:form action="Registrar_Usuario" >
                    
                    <s:submit value="Registrar" />
                </s:form>
                
            </s:div>
        </s:div>
    </body>
</html>

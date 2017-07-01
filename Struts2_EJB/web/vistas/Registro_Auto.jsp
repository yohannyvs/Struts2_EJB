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
        <s:div cssClass="container" >
            <s:div cssClass="row">
                <h4>Ingrese Datos del Auto</h4> <br>
                <s:div cssClass="col-md-12">
                    <s:form method="post" action="Registrar_Auto" cssClass="form-inline col-md-6">
                        <s:label> Placa del Auto</s:label>
                        <s:textfield name="Placa" cssClass="form-control"/><br>
                        <s:label>Modelo del Auto</s:label>
                        <s:textfield name="Modelo"  cssClass="form-control"/><br> 
                        <s:label>Tipo de Combustible</s:label>
                        <s:textfield name="Combustible" label="" cssClass="form-control"/><br>
                        <s:label>Tipo de Transmición</s:label>
                        <s:textfield name="Transmicion" label="" cssClass="form-control"/><br>
                        <s:label>Estado del Auto</s:label>
                        <s:textfield name="Estado" label="" cssClass="form-control"/><br>
                        <s:label>Kilometraje</s:label>
                        <s:textfield name="Kilometraje" label="" cssClass="form-control"/><br>
                        <s:label>Cantidad de Puertas</s:label>
                        <s:textfield name="N_puertas" label="" cssClass="form-control"/><br>
                        <s:label>Color del Auto</s:label>
                        <s:textfield name="Color" label="" cssClass="form-control"/><br>
                        <s:label>Precio del Auto</s:label>
                        <s:textfield name="Precio" label="" cssClass="form-control"/><br>
                        <s:label>Año</s:label>
                        <s:textfield name="Anio" label="" cssClass="form-control"/><br>
                        <s:label>Dirección</s:label>
                        <s:textfield name="Provincia" label="" cssClass="form-control"/><br>
                        <br>
                        <s:submit value="Registrar"/>                       
                    </s:form>
                </s:div>
            </s:div> 
        </s:div>
    </body>
</html>

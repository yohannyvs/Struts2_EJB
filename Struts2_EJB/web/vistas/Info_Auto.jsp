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
                <h3>Datos Completos del Auto</h3> <br>
             
                <s:label>Placa: </s:label>
                <s:textfield name="Placa" readonly="true" value="%{autos.Placa}"/> 
                <br>
                <s:label>Modelo: </s:label>
                <s:textfield name="Modelo" readonly="true" value="%{autos.Modelo}"/> 
                <br>
                <s:label>Estado: </s:label>
                <s:textfield name="Estado" readonly="true" value="%{autos.Estado}"/>
                <br>
                <s:label>Precio: </s:label>
                <s:textfield name="Precio" readonly="true" value="%{autos.Precio}"/>
                <br>
                <s:label>Año: </s:label>
                <s:textfield name="Anio" readonly="true" value="%{autos.Anio}"/>
                <br>     
                <s:label>Combustible: </s:label>
                <s:textfield name="Combustible" readonly="true" value="%{autos.Combustible}"/>
                <br>
                <s:label>Transmición: </s:label>
                <s:textfield name="Transmicion" readonly="true" value="%{autos.Transmicion}"/>  
                <br>
                <s:label>Kilometraje: </s:label>
                <s:textfield name="Kilometraje" readonly="true" value="%{autos.Kilometraje}"/>
                <br>
                <s:label>N° Puertas: </s:label>
                <s:textfield name="N_puertas" readonly="true" value="%{autos.N_puertas}"/>
                <br>
                <s:label>Color: </s:label>
                <s:textfield name="Color" readonly="true" value="%{autos.Color}"/>
                <br>
                <s:label>Dirección: </s:label>
                <s:textfield name="Direccion" readonly="true" value="%{autos.Provincia}"/>
                <br>

            </s:div>
        </s:div>   
    </body>
</html>

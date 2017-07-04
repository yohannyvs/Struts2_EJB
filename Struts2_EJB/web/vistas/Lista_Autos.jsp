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
                <h3>Lista de Autos Disponibles</h3>
                <table >
                    <s:iterator value="lista" >
                        <tr>
                            <td>
                                <s:property value="Modelo"/> 
                                &nbsp;
                                <s:property value="Estado"/> 
                                &nbsp;
                                <s:property value="Precio"/>
                                &nbsp;
                                <s:property value="Anio"/>
                                &nbsp;

                                <s:url id="url" action="Mostrar_autos">
                                <s:param name="id"><s:property value="Id"/></s:param>
                                </s:url>

                                <s:a href="%{url}">Ver</s:a>
                                &nbsp;
                            </td>                       
                        </tr>
                    </s:iterator>
                </table>   
            </s:div>
        </s:div>
    </body>
</html>

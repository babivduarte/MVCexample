<%-- 
    Document   : buscaTime
    Created on : Nov 30, 2020, 11:11:49 AM
    Author     : barbara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar</title>
        <link rel="stylesheet" href="estilo.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="center">
            <div id="formulario">
                <h2 class="center">Página de Busca</h2>
                <h4 class="center">Insira o NOME do time a ser procurado.</h4>
                
                <!--o servlet(Controller) timeController é chamado através do action;-->
                <form action="timeController" method="post">
                    <input name="nome"><br/><br/>
                                        
                    <!--o parâmetro flag vai receber o valor buscar;-->
                    <input type="hidden" name="flag" value="buscar">
                    <input type="submit" name="btbuscar" value="buscar">
                </form>
            </div>
        </div>
    </body>
</html>

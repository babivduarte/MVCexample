<%-- 
    Document   : deletarTime
    Created on : Dec 6, 2020, 3:57:46 PM
    Author     : barbara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remover</title>
        <link rel="stylesheet" href="estilo.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="center">
            <div id="formulario">
                <h2 class="center">Remove Time</h2>
                <h4 class="center">Insira o ID do time a ser removido.</h4>
                
                <!--o servlet(Controller) timeController é chamado através do action;-->
                <form action="timeController" method="post">
                    <input name="id"><br/><br/>
                                        
                    <!--o parâmetro flag vai receber o valor deletar;-->
                    <input type="hidden" name="flag" value="deletar">
                    <input type="submit" name="btdeletar" value="deletar">
                </form>
            </div>
        </div>
    </body>
</html>

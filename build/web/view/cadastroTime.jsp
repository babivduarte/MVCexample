<%-- 
    Document   : cadastroTime
    Created on : Nov 29, 2020, 8:54:41 PM
    Author     : barbara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar</title>
        <link rel="stylesheet" href="estilo.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="center">
            <div id="formulario">
                <h2 class="center">Cadastro de Times de Futebol</h2>
                
                <!--o servlet(Controller) timeController é chamado através do action;-->
                <form action="timeController" method="post">
                    <label>ID</label>
                    <input name="id"><br/><br/>
                    <label>Nome do time</label>
                    <input name="nome"><br/><br/>
                    <label>Cidade do time</label>
                    <input name="cidade"><br/><br/>
                    <label>Estado</label>
                    <input name="estado"><br/><br/>
                    <label>País</label>
                    <input name="pais"><br/><br/>
                    
                    <!--o parâmetro flag vai receber o valor cadastrar;-->
                    <input type="hidden" name="flag" value="cadastrar">
                    <input type="submit" name="btcadastrar" value="cadastrar">
                </form>
            </div>
        </div>
    </body>
</html>

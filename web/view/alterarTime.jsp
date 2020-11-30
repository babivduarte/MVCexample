<%-- 
    Document   : alterarTime
    Created on : Nov 30, 2020, 10:33:04 AM
    Author     : barbara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar</title>
        <link rel="stylesheet" href="estilo.css">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="center">
            <div id="formulario">
                <h2 class="center">Alteração dos times de futebol</h2>
                <h4 class="center">Insira o ID do time (não pode ser alterado) e todos os novos dados.</h4>
                
                <!--o servlet(Controller) timeController é chamado através do action;-->
                <form action="timeController" method="post">
                    <label>ID</label>
                    <input name="id"><br/><br/>
                    <label>Novo nome do time</label>
                    <input name="nome"><br/><br/>
                    <label>Nova cidade do time</label>
                    <input name="cidade"><br/><br/>
                    <label>Novo estado</label>
                    <input name="estado"><br/><br/>
                    <label>Novo país</label>
                    <input name="pais"><br/><br/>
                    
                    <!--o parâmetro flag vai receber o valor alterar;-->
                    <input type="hidden" name="flag" value="alterar">
                    <input type="submit" name="btalterar" value="alterar">
                </form>
            </div>
        </div>
    </body>
</html>

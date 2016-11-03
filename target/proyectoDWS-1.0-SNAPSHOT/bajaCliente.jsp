<%-- 
    Document   : bajaCliente
    Created on : 03-nov-2016, 18:37:54
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Baja Clientes</title>
    </head>
    <body>
        Introduce el DNI del Cliente a eliminar<br>
        <form name="formBajaCliente" action="ClienteServlet"  method="POST" >
            <input type="hidden" name="consulta" value="baja">
            <input type="text" name="dniElim" >
            <input type="submit" value="Enviar" >&nbsp<input type="reset" value="Restablecer" >
        </form>    
    </body>
</html>

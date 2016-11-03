<%-- 
    Document   : inscripcion
    Created on : 05-oct-2016, 9:40:47
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Clientes</title>
        <link rel="stylesheet" type="text/css" href="css/reset.css">
        <link rel="stylesheet" type="text/css" href="css/mantenimientoCliente.css">
    </head>
    
    <body>
        <form name="formAltaCliente" action="ClienteServlet"  method="POST" >
            Alta Clientes
            <input type="hidden" name="consulta" value="alta">
            <table>
                <tr><th colspan="2">Datos del Cliente</th></tr>
                <tr>
                    <td>Nombre:</td>
                    <td><input type="text" name="nombre" value="" size="20" ></td>
                </tr>
                <tr>
                    <td>Apellidos:</td>
                    <td><input type="text" name="apellidos" value="" size="50" ></td>
                </tr>
                <tr>
                    <td>DNI:</td>
                    <td><input type="text" name="dni" value="" size="50" ></td>
                </tr>
                <tr>
                    <td>Dirección:</td>
                    <td><input type="text" name="direccion" value="" size="50" ></td>
                </tr>
                <tr>
                    <td>Código Postal:</td>
                    <td><input type="text" name="cp" value="" size="5" ></td>
                </tr>
                <tr>
                    <td>Ciudad:</td>
                    <td><input type="text" name="ciudad" value="" size="20" ></td>
                </tr>
                <tr>
                    <td>Provincia:</td>
                    <td><input type="text" name="provincia" value="" size="20" ></td>
                </tr>
                <tr>
                    <td>Teléfono:</td>
                    <td><input type="text" name="telefono" value="" size="20" ></td>
                </tr>
                <tr>
                    <td>Correo electrónico:</td>
                    <td><input type="text" name="email" value="" size="20" ></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Enviar Consulta" >&nbsp<input type="reset" value="Restablecer" >
                    </td>
                </tr>
            </table>
        </form>    
    </body>
</html>

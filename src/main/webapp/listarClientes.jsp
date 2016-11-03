<%-- 
    Document   : listarClientes
    Created on : 03-nov-2016, 19:02:07
    Author     : Vicente
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="datosClientes.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Clientes</title>
        <link rel="stylesheet" type="text/css" href="css/reset.css">
        <link rel="stylesheet" type="text/css" href="css/mantenimientoCliente.css">
    </head>
    <body>
        <% ArrayList<Cliente> listaClientes = (ArrayList<Cliente>) request.getAttribute("listaClientes"); %>
        <% String lista= (String) request.getAttribute("lista"); %>
        <form name="formListarCliente" action="ClienteServlet"  method="POST" >
            <input type="hidden" name="consulta" value="lista">
            <input type="submit" value="Listar">
        </form>
        <%--<% if(lista!=null){%>
            <h3><%=lista%></h3>
            <h3><%=listaClientes.size()%></h3>
        <%} %>--%>
        
        <% if(listaClientes!=null){
                if(listaClientes.size()>0){
                for(int i=0;i<listaClientes.size();i++){
                %>
                <div>
                    Nombre:<%=listaClientes.get(i).getNombre()%>&nbsp<%=listaClientes.get(i).getApellidos()%><br>
                    DNI:<%=listaClientes.get(i).getDni()%><br>
                    Telefono:<%=listaClientes.get(i).getTelefono()%><br>
                </div>
        <%} } }%>
        <a href="/proyectoDWS/mantenimientoCliente.jsp" class="boton">Volver a Página de Mantenimiento</a><br>
    </body>
</html>

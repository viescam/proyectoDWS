/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import datosClientes.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vicente
 */
public class ClienteServlet extends HttpServlet {

    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String consulta = request.getParameter("consulta");
        
        switch (consulta){
            case "alta": alta(request);break;
            case "baja": baja(request);break;
            case "modif": modificar(request);break;
        }       
    }
    
    public void alta(HttpServletRequest request) {
        String nombre, apellidos, dni, direccion, ciudad, provincia, cp, telefono, email;
        
        nombre=request.getParameter("nombre");
        apellidos=request.getParameter("apellidos");
        direccion=request.getParameter("direccion");
        dni=request.getParameter("dni");
        ciudad=request.getParameter("ciudad");
        provincia=request.getParameter("provincia");
        cp=request.getParameter("cp");
        telefono=request.getParameter("telefono");
        email=request.getParameter("email");
        
        Cliente client = new Cliente(nombre,apellidos,dni,direccion,ciudad,provincia,cp,telefono,email);
        
        clientes.add(client);
        
    }
    
    public void baja(HttpServletRequest request) {
        String dniElim = request.getParameter("dniElim");
        Cliente clienteElim;
        clienteElim = buscar(dniElim);
        if(clienteElim!=null){
            request.setAttribute("clienteAEliminar", clienteElim);
        }
    }
    
    public void modificar(HttpServletRequest request) {
        String dniModif = request.getParameter("dniModif");
        Cliente clienteModif;
        clienteModif = buscar(dniModif);
        if(clienteModif!=null){
            request.setAttribute("clienteAEliminar", clienteModif);
        }
    }
    
    public Cliente buscar(String dni){
        Cliente clienteBuscado = null;
        int i=0;
        while(i<=clientes.size() && clienteBuscado == null){
            if(clientes.get(i).getDni().equals(dni)){
                clienteBuscado = clientes.get(i);
            }
        }
        
        return clienteBuscado;
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}

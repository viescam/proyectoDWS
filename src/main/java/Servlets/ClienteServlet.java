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
import javax.servlet.RequestDispatcher;
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
            case "lista":listar(request,response);break;
        }
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/mantenimientoCliente.jsp");
        rd.forward(request, response);
        
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
        int posClienteElim;
        posClienteElim = buscar(dniElim);
        if(posClienteElim!=-1){
            clientes.remove(posClienteElim);
        }
    }
    
    public void modificar(HttpServletRequest request) {
        String dniModif = request.getParameter("dniModif");
        int posClientModif;
        posClientModif = buscar(dniModif);
        if(posClientModif!=-1){
            //falta añadir codigo
        }
    }
    
    public void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lista="hola";
        request.setAttribute("listaClientes",clientes);
        request.setAttribute("lista", lista);
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/listarClientes.jsp");
        rd.forward(request, response);
    }
    
        
    public int buscar(String dni){
        int posClienteBuscado=-1;
        int i=0;
        while(i<=clientes.size() && posClienteBuscado==-1){
            if(clientes.get(i).getDni().equals(dni)){
                posClienteBuscado=i;
            }
        }
        return posClienteBuscado;
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

    private void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

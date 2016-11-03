/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosClientes;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String cp;
    private String ciudad;
    private String provincia;
    private String telefono;
    private String email;
       
    public Cliente(String nombre, String apellidos, String dni,String direccion, String cp, String ciudad, 
            String provincia, String telefono, String email){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.direccion=direccion;
        this.cp=cp;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.telefono=telefono;
        this.email=email;
                    
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the direccion to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }

    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}



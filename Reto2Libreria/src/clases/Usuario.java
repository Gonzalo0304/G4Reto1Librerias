/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;

/**
 *
 * @author Iñigo
 */
public class Usuario {

    //Variables
    private String id;
    private String nombre;
    private String email;
    private String pass;
    private String direccion;
    private int telefono;
    private int codigoPostal;
    private Permisos permiso;
    private LocalDate creacion;
    private String empresa;

    //Constructores
    public Usuario() {
    }

    public Usuario(String id, String nombre, String email, String pass, String direccion, int telefono, int codigoPostal, Permisos permiso, LocalDate creacion, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.permiso = permiso;
        this.creacion = creacion;
        this.empresa = empresa;
    }

    //Getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Permisos getPermiso() {
        return permiso;
    }

    public void setPermiso(Permisos permiso) {
        this.permiso = permiso;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    

}

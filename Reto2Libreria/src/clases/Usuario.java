/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * La clase Usuario representa a un usuario en la aplicación. Contiene información como el identificador (id), nombre, email,
 * contraseña, dirección, número de teléfono, código postal, permisos, fecha de creación y nombre de la empresa a la que pertenece.
 *
 *
 * @author Iñigo,Gonzalo
 */
public class Usuario implements Serializable{

    //Variables
    private String id;
    private String nombre;
    private String email;
    private String pass;
    private String direccion;
    private int telefono;
    private int codigoPostal;
    private LocalDate creacion;
    private String empresa;

    //Constructores
    public Usuario() {
    }

    public Usuario(String id, String nombre, String email, String pass, String direccion, int telefono, int codigoPostal, LocalDate creacion, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
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

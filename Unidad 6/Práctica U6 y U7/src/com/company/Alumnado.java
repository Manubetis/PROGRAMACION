package com.company;

import java.io.Serializable;

public class Alumnado implements Serializable {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String dni;
    private String email;
    private String curso;
    private String cursaDual;

    public Alumnado(String nombre, String apellidos,
                    String direccion, String dni, String email, String curso, String cursaDual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.email = email;
        this.curso = curso;
        this.cursaDual = cursaDual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String isCursaDual() {
        return cursaDual;
    }

    public void setCursaDual(String cursaDual) {
        this.cursaDual = cursaDual;
    }

    @Override
    public String toString() {
        return "Alumnado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", cursaDual='" + cursaDual + '\''+
                '}'+'\n';
    }
}

package com.company;

import java.util.Objects;

public class Personas {
    private String nif;
    private String nombreApellidos;
    private int id;
    private static int contador=0;

    public Personas(String nif, String nombreApellidos, int id) {
        this.nif = nif;
        this.nombreApellidos = nombreApellidos;
        this.id =contador;
        contador++;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Personas.contador = contador;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nif='" + nif + '\'' +
                ", nombreApellidos='" + nombreApellidos + '\'' +
                ", id=" + id +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return id == personas.id && nif.equals(personas.nif) && Objects.equals(nombreApellidos, personas.nombreApellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombreApellidos, id);
    }
}

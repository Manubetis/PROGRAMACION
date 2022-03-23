package Examen;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Agrupacion implements Comparable<Agrupacion>{
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetras;
    private String tipo;
    private int puntosObtenidos;
    private int numTotalAgrupaciones=0;

    public Agrupacion(String nombre,
                      String autor, String autorMusica, String autorLetras, int puntosObtenidos, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetras = autorLetras;
        this.puntosObtenidos = puntosObtenidos;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumTotalAgrupaciones() {
        return numTotalAgrupaciones;
    }

    public void setNumTotalAgrupaciones(int numTotalAgrupaciones) {
        this.numTotalAgrupaciones = numTotalAgrupaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetras() {
        return autorLetras;
    }

    public void setAutorLetras(String autorLetras) {
        this.autorLetras = autorLetras;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }


    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo=" + tipo +
                ", puntosObtenidos=" + puntosObtenidos +
                ", numTotalAgrupaciones=" + numTotalAgrupaciones +
                '}';
    }
}

package Examen;

import java.util.Arrays;
import java.util.Objects;

public class Comparsa extends AgrupacionOficial {
    private String empresaAtrezzo;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetras,
                    int puntosObtenidos, String tipo, boolean sePresentan, String empresaAtrezzo) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo, sePresentan);
        this.empresaAtrezzo = empresaAtrezzo;
    }

    public String getEmpresaAtrezzo() {
        return empresaAtrezzo;
    }

    public void setEmpresaAtrezzo(String empresaAtrezzo) {
        this.empresaAtrezzo = empresaAtrezzo;
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empresaAtrezzo='" + empresaAtrezzo +'\n'+
                super.toString()+
                '}';
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Comparsa con nombre "+getNombre());
    }

    public void hacer_tipo() {
        System.out.println("La Comparsa "+getNombre()+" va de "+getTipo());
    }

    @Override
    public int compareTo(Agrupacion o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}

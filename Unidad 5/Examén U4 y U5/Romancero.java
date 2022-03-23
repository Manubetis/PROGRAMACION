package Examen;

import java.util.Arrays;
import java.util.Objects;

public class Romancero extends Agrupacion implements Callejera{
    private String tematica;

    public Romancero(String nombre, String autor, String autorMusica,
                     String autorLetras, int puntosObtenidos, String tipo, String tematica) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematica='" + tematica + '\'' +'\n'+
                super.toString()+
                '}';
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Romancero con nombre "+getNombre());
    }

    public void hacer_tipo() {
        System.out.println("El Romancero "+getNombre()+" va de "+getTipo());
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+getNombre());
    }

    @Override
    public int compareTo(Agrupacion o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}

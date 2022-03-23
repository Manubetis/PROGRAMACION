package Examen;

import java.util.Objects;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private int numMiembros;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras,
                    int puntosObtenidos, String tipo, boolean sePresentan, int numMiembros) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo, sePresentan);
        this.numMiembros = numMiembros;
    }

    public int getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(int numMiembros) {
        this.numMiembros = numMiembros;
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numMiembros=" + numMiembros +'\n'+
                super.toString()+
                '}';
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Cuarteto con nombre "+getNombre());
    }

    public void hacer_tipo() {
        System.out.println("El Cuarteto "+getNombre()+" va de "+getTipo());
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

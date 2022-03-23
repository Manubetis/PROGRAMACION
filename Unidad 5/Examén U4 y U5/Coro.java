package Examen;

import java.util.Objects;
import java.util.PrimitiveIterator;

public class Coro extends AgrupacionOficial {
    private int numGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetras,
                int puntosObtenidos, String tipo, boolean sePresentan, int numGuitarras) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo, sePresentan);
        this.numGuitarras = numGuitarras;
    }

    public int getNumGuitarras() {
        return numGuitarras;
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numGuitarras=" + numGuitarras +'\n'+
                super.toString()+
                '}';
    }

    public void setNumGuitarras(int numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación del Coro con nombre "+getNombre());
    }

    public void hacer_tipo() {
        System.out.println("El Coro "+getNombre()+" va de "+getTipo());
    }

    @Override
    public int compareTo(Agrupacion o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}

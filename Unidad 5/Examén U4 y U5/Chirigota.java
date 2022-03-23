package Examen;

import java.util.Arrays;
import java.util.Objects;

public class Chirigota extends AgrupacionOficial implements Callejera{
    private int numCuples;

    public Chirigota(String nombre, String autor, String autorMusica, String autorLetras,
                     int puntosObtenidos, String tipo, boolean sePresentan, int numCuples) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo, sePresentan);
        this.numCuples = numCuples;
    }

    public int getNumCuples() {
        return numCuples;
    }

    public void setNumCuples(int numCuples) {
        this.numCuples = numCuples;
    }

    @Override
    public String toString() {
        return "Chirigota{" +
                "numCumples=" + numCuples +'\n'+
                super.toString()+
                '}';
    }

    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentación de la Chirigota con nombre "+getNombre());
    }

    public void hacer_tipo() {
        System.out.println("La Chirigota "+getNombre()+" va de "+getTipo());
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

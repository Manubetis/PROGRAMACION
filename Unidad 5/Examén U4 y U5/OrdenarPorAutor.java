package Examen;

import java.util.Comparator;

public class OrdenarPorAutor implements Comparator<Agrupacion> {
    @Override
    public int compare(Agrupacion o1, Agrupacion o2) {
        return o1.getAutor().compareTo(o2.getAutor());
    }
}

package Examen;

import java.util.Comparator;

public class OrdenarPorPuntos implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
        int result=o1.getPuntosObtenidos()- o2.getPuntosObtenidos();

        if (result>0){
            return 1;
        }else if (result<0){
            return -1;
        }else {
            return 0;
        }
    }
}

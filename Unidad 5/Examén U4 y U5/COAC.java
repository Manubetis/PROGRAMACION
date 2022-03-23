package Examen;

import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Comparator;

public class COAC {

    private AgrupacionOficial[] listaAgrupacionesOficiales;

    public COAC() {
        this.listaAgrupacionesOficiales = new AgrupacionOficial[0];
    }

    public void inscribir_agrupacion(AgrupacionOficial agrupacion){
        AgrupacionOficial[] result= Arrays.copyOf(listaAgrupacionesOficiales,
                listaAgrupacionesOficiales.length+1);
        result[result.length-1]=agrupacion;
    }

    public boolean estaAgrupacion(AgrupacionOficial i){
        for (int j = 0; j <listaAgrupacionesOficiales.length; j++) {
            if (listaAgrupacionesOficiales[j].equals(i)){
                return true;
            }
        }
        return false;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        if (estaAgrupacion(agrupacion)){
            AgrupacionOficial[] result=new AgrupacionOficial[0];

            for (int j = 0; j <listaAgrupacionesOficiales.length; j++) {
                if (!listaAgrupacionesOficiales[j].equals(agrupacion)){
                    result=Arrays.copyOf(result, result.length+1);
                    result[result.length-1]=listaAgrupacionesOficiales[j];
                }
            }
            listaAgrupacionesOficiales=result;
            return true;
        }
        return false;
    }

    public void ordenar_por_puntos(){
        Arrays.sort(listaAgrupacionesOficiales, new Comparator<AgrupacionOficial>() {
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
        });
    }

    public void ordenar_por_nombre(){
        Arrays.sort(listaAgrupacionesOficiales, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
    }

    public void ordenar_por_autor(){
        Arrays.sort(listaAgrupacionesOficiales, new Comparator<AgrupacionOficial>() {
            @Override
            public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
                return o1.getAutor().compareTo(o2.getAutor());
            }
        });
    }
}

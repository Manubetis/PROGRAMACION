package Examen;

import java.net.PortUnreachableException;
import java.util.Arrays;
import java.util.Objects;

public abstract class AgrupacionOficial extends Agrupacion{
    private boolean sePresentan;
    private Integrante[]listaIntegrantes;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras,
                             int puntosObtenidos, String tipo, boolean sePresentan) {
        super(nombre, autor, autorMusica, autorLetras, puntosObtenidos, tipo);
        this.sePresentan = sePresentan;
        this.listaIntegrantes = new Integrante[0];
    }

    public boolean isSePresentan() {
        return sePresentan;
    }

    public void setSePresentan(boolean sePresentan) {
        this.sePresentan = sePresentan;
    }

    public Integrante[] getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(Integrante[] listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }

    public void insertar_integrante (Integrante i){
        Integrante[] result=Arrays.copyOf(listaIntegrantes, listaIntegrantes.length+1);
        result[result.length-1]=i;
        listaIntegrantes=result;
    }

    public boolean estaIntegrante(Integrante i){
        for (int j = 0; j <listaIntegrantes.length; j++) {
            if (listaIntegrantes[j].equals(i)){
                return true;
            }
        }
        return false;
    }

    public boolean eliminar_integrante (Integrante i){
        if (estaIntegrante(i)){
            Integrante[] result=new Integrante[0];

            for (int j = 0; j <listaIntegrantes.length; j++) {
                if (!listaIntegrantes[j].equals(i)){
                    result=Arrays.copyOf(result, result.length+1);
                    result[result.length-1]=listaIntegrantes[j];
                }
            }
            listaIntegrantes=result;
            return true;
        }
        return false;
    }


    public void caminito_del_falla(){
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                "sePresentan=" + sePresentan +
                ", listaIntegrantes=" + Arrays.toString(listaIntegrantes) +
                '}';
    }
}

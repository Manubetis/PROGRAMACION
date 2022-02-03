package Ejercicio_1;

import java.util.Arrays;
import java.util.Objects;

public class Preguntas {
    private String enunciado;
    private final int capacidad=3;
    private Opciones[] opciones;

    public Preguntas(String enunciado) {
        this.enunciado = enunciado;
        opciones=new Opciones[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Opciones[] getOpciones() {
        return opciones;
    }

    public void setOpciones(Opciones[] opciones) {
        this.opciones = opciones;
    }
    public boolean addOpciones(Opciones opc){
        if (!esta(opc) && opciones.length<capacidad){
            Opciones[]result= Arrays.copyOf(opciones, opciones.length+1);
            result[opciones.length-1]=opc;
            opciones=result;
            return true;
        }
        return false;
    }
    public boolean esta(Opciones opc){
        for (int i = 0; i <opciones.length; i++) {
            if (opciones[i].equals(opc)){
                return true;
            }
        }
        return false;
    }

    public boolean eliminarOpciones(Opciones opc){
        Opciones[]result=new Opciones[0];
        Integer longitud=opciones.length;

        for (int i = 0; i <opciones.length; i++) {
            if (!opciones[i].equals(opc)){
                result=Arrays.copyOf(result, result.length+1);
                result[result.length-1]=opciones[i];
            }
        }
        opciones=result;
        if (longitud==result.length){
            return false;
        }
        return true;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "enunciado='" + enunciado + '\'' +
                ", capacidad=" + capacidad +
                ", opciones=" + Arrays.toString(opciones) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preguntas preguntas = (Preguntas) o;
        return capacidad == preguntas.capacidad && enunciado.equals(preguntas.enunciado) && Arrays.equals(opciones, preguntas.opciones);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(enunciado, capacidad);
        result = 31 * result + Arrays.hashCode(opciones);
        return result;
    }
}

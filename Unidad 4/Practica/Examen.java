package Ejercicio_1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;

public class Examen {
    private Calendar fecha;
    private String Consejeria;
    private String enlace;
    private Preguntas[] preguntas;
    private Sedes[] sedes;
    private final int capacidad=100;

    public Examen(Calendar fecha, String consejeria, String enlace) {
        this.fecha = fecha;
        Consejeria = consejeria;
        this.enlace = enlace;
        preguntas = new Preguntas[0];
        sedes=new Sedes[0];

    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConsejeria() {
        return Consejeria;
    }

    public void setConsejeria(String consejeria) {
        Consejeria = consejeria;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }
    public boolean addSedes(Sedes sede){
            Sedes[]result= Arrays.copyOf(sedes, sedes.length+1);
            result[sedes.length-1]=sede;
            sedes=result;
            return true;
    }

    public boolean eliminarSede(Sedes sede){
        Sedes[]result=new Sedes[0];
        Integer longitud=sedes.length;

        for (int i = 0; i <sedes.length; i++) {
            if (!sedes[i].equals(sede)){
                result=Arrays.copyOf(result, result.length+1);
                result[result.length-1]=sedes[i];
            }
        }
        sedes=result;
        if (longitud==result.length){
            return false;
        }
        return true;
    }

    public boolean addPreg(Preguntas preg) {
        if (preguntas.length<capacidad){
            Preguntas[] result = Arrays.copyOf(preguntas, preguntas.length + 1);
            result[preguntas.length - 1] = preg;
            preguntas = result;
            return true;
        }
        return false;
    }

    public boolean eliminarPreg(Preguntas preg) {
        Preguntas[] result = new Preguntas[0];
        Integer longitud = preguntas.length;

        for (int i = 0; i < preguntas.length; i++) {
            if (!preguntas[i].equals(preg)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = preguntas[i];
            }
        }
        preguntas = result;
        if (longitud == result.length) {
            return false;
        }
        return true;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Examen{" +
                "fecha=" + fecha +
                ", Consejeria='" + Consejeria + '\'' +
                ", enlace='" + enlace + '\'' +
                ", preguntas=" + Arrays.toString(preguntas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examen examen = (Examen) o;
        return fecha.equals(examen.fecha) && Consejeria.equals(examen.Consejeria) && enlace.equals(examen.enlace) && Arrays.equals(preguntas, examen.preguntas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(fecha, Consejeria, enlace);
        result = 31 * result + Arrays.hashCode(preguntas);
        return result;
    }
}

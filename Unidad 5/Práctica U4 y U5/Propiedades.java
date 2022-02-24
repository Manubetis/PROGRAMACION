package com.company;

import java.util.Calendar;
import java.util.Objects;

public abstract class Propiedades implements Comparable<Propiedades> {
    private int añoConstruccion;
    private String direccion;
    private int numMetros;

    public Propiedades(int añoConstruccion, String direccion, int numMetros) {
        this.añoConstruccion = añoConstruccion;
        this.direccion = direccion;
        this.numMetros = numMetros;
    }

    public int getAñoConstruccion() {
        return añoConstruccion;
    }

    public void setAñoConstruccion(int añoConstruccion) {
        this.añoConstruccion = añoConstruccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumMetros() {
        return numMetros;
    }

    public void setNumMetros(int numMetros) {
        this.numMetros = numMetros;
    }

    void mostrarPropiedad(){
        System.out.println(toString());
    }

    @Override
    public int compareTo(Propiedades o) {
        int result=this.getNumMetros()-o.getNumMetros();

        if (result>0){
            return 1;
        }else if (result<0){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Propiedades{" +
                "añoConstruccion='" + añoConstruccion + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numMetros=" + numMetros +
                ", clase"+ getClass()+
                ", fecha" + Calendar.getInstance()+
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedades that = (Propiedades) o;
        return añoConstruccion == that.añoConstruccion && numMetros == that.numMetros && direccion.equals(that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(añoConstruccion, direccion, numMetros);
    }
}

package com.company;

import java.util.Arrays;

public class Vivienda extends Propiedades implements MostrarPrecio {
    private int numBaños;
    private int numHabitacion;
    private int capacidad;
    private int precio;
    private Personas[] persona;

    public Vivienda(int añoConstruccion, String direccion, int numMetros, int numBaños, int numHabitacion, int capacidad, int precio) {
        super(añoConstruccion, direccion, numMetros);
        this.numBaños = numBaños;
        this.numHabitacion = numHabitacion;
        this.capacidad = capacidad;
        this.precio = precio;
        this.persona = new Personas[0];
    }


    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Personas[] getPersona() {
        return persona;
    }

    public void setPersona(Personas[] persona) {
        this.persona = persona;
    }

    public boolean addPerson (Personas pers){
        if (persona.length<capacidad && !esta(pers)){
            Personas[] result= Arrays.copyOf(persona, persona.length+1);
            result[result.length-1]=pers;
            persona=result;
            return true;
        }
        return false;
    }

    public boolean esta(Personas pers){
        for (int i = 0; i <persona.length; i++) {
            if (persona[i].equals(pers)){
                return true;
            }
        }
        return false;
    }

    public boolean elimPerson (Personas pers){
        if (persona.length>0){
            Personas[] result=new Personas[0];

            for (int i = 0; i < persona.length; i++) {
                if (!persona[i].equals(pers)){
                    result= Arrays.copyOf(result, result.length+1);
                    result[result.length-1]=persona[i];
                }
            }
            persona=result;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "numBaños=" + numBaños +
                ", numHabitacion=" + numHabitacion +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", persona=" + Arrays.toString(persona) +
                super.toString()+
                '}'+"\n";
    }

    @Override
    public void precio() {
        System.out.println("Soy una viviendad con una capacidad de "+capacidad+" y valgo "+precio);
    }
}

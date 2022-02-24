package com.company;

import java.util.Arrays;

public class Registro {
    private Propiedades[] propiedades;

    public Registro() {
        propiedades = new Propiedades[0];
    }

    public Propiedades[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedades[] propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registro registro = (Registro) o;
        return Arrays.equals(propiedades, registro.propiedades);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(propiedades);
    }

    public void addPropiedad (Propiedades propiedad){
            Propiedades[] result= Arrays.copyOf(propiedades, propiedades.length+1);
            result[result.length-1]=propiedad;
            propiedades=result;
    }

    public boolean elimPropiedad(Propiedades propiedad){
        if (propiedades.length>0){
            Propiedades[] result=new Propiedades[0];

            for (int i = 0; i <propiedades.length; i++) {
                if (!propiedades[i].equals(propiedad)){
                    result= Arrays.copyOf(propiedades, propiedades.length+1);
                    result[result.length-1]=propiedades[i];
                }
                propiedades=result;
                return true;
            }
        }
        return false;
    }

    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(toString());
    }

    public void informeAntiguedad(){
        Arrays.sort(propiedades, new OrdenarAntiguedad());
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}'+"\n";
    }
}

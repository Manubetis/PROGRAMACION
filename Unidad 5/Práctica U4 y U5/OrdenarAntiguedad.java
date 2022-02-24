package com.company;

import java.util.Comparator;

public class OrdenarAntiguedad implements Comparator<Propiedades> {
    @Override
    public int compare(Propiedades o1, Propiedades o2) {
        if (o2.getAñoConstruccion()==o1.getAñoConstruccion()){
            return o1.getNumMetros()-o2.getNumMetros();
        }
        return o2.getAñoConstruccion()-o1.getAñoConstruccion();
    }
}

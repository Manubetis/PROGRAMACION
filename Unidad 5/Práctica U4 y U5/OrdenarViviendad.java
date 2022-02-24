package com.company;

import java.util.Comparator;

public class OrdenarViviendad implements Comparator<Vivienda> {
    @Override
    public int compare(Vivienda o1, Vivienda o2) {
        return o1.getNumHabitacion()-o2.getNumHabitacion();
    }
}

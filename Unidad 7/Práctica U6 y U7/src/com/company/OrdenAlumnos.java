package com.company;

import java.util.Comparator;

public class OrdenAlumnos implements Comparator<Alumnado> {

    @Override
    public int compare(Alumnado alumnado, Alumnado t1) {
        if (alumnado.getApellidos().equalsIgnoreCase(t1.getApellidos())){
            return alumnado.getNombre().compareTo(t1.getNombre());
        }
        return alumnado.getApellidos().compareTo(t1.getApellidos());
    }
}

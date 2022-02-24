package com.company;

import java.util.PrimitiveIterator;

public class EquipamientoServicio extends Propiedades{

    private TipoEquipamiento tipo;

    public EquipamientoServicio(int añoConstruccion, String direccion, int numMetros, TipoEquipamiento tipo) {
        super(añoConstruccion, direccion, numMetros);
        this.tipo=tipo;
    }

    public TipoEquipamiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamiento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipo=" + tipo +
                super.toString()+
                '}';
    }
}

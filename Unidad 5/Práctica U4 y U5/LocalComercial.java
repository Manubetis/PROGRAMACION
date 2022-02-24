package com.company;

public class LocalComercial extends Local implements MostrarPrecio{

    private  String descripcion;

    public LocalComercial(int añoConstruccion, String direccion, int numMetros, String propietario, int precio, String descripcion) {
        super(añoConstruccion, direccion, numMetros, propietario, precio);
        this.descripcion=descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                "descripcion='" + descripcion + '\'' +
                super.toString()+
                '}'+"\n";
    }

    @Override
    public void precio() {
        System.out.println("Soy una LocalComercial que me dedico a "+descripcion+" y valgo "+getPrecio());
    }
}

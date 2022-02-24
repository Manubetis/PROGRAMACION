package com.company;

public class Local extends Propiedades{

    private String propietario;
    private int precio;

    public Local(int añoConstruccion, String direccion, int numMetros, String propietario, int precio) {
        super(añoConstruccion, direccion, numMetros);
        this.precio=precio;
        this.propietario=propietario;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{" +
                "propietario='" + propietario + '\'' +
                ", precio=" + precio +
                super.toString()+
                '}'+"\n";
    }
}

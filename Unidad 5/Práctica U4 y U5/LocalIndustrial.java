package com.company;

public class LocalIndustrial extends Local implements MostrarPrecio{

    private String consumoEnerg;

    public LocalIndustrial(int añoConstruccion, String direccion, int numMetros, String propietario, int precio, String consumoEnerg) {
        super(añoConstruccion, direccion, numMetros, propietario, precio);
        this.consumoEnerg=consumoEnerg;
    }

    public String getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(String consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }


    @Override
    public String toString() {
        return "LocalIndustrial{" +
                "consumoEnerg='" + consumoEnerg + '\'' +
                super.toString()+
                '}'+"\n";
    }

    @Override
    public void precio() {
        System.out.println("Soy una LocalIndustrial con un consumo máximo de "+consumoEnerg+" y valgo "+getPrecio());
    }
}

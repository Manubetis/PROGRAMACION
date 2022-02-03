package Ejercicio_1;

public class Opciones {
    private String texto;
    private boolean verdadera;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isVerdadera() {
        return verdadera;
    }

    public void setVerdadera(boolean verdadera) {
        this.verdadera = verdadera;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "texto='" + texto + '\'' +
                ", verdadera=" + verdadera +
                '}';
    }
}

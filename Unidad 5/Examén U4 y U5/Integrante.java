package Examen;

public class Integrante {
    private int numParticipantes;
    private String nombre;
    private int edad;
    private String localidad;

    public Integrante(int numParticipantes, String nombre, int edad, String localidad) {
        this.numParticipantes = numParticipantes;
        this.nombre = nombre;
        this.edad = edad;
        this.localidad = localidad;
    }

    public int getNumParticipantes() {
        return numParticipantes;
    }

    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String toString() {
        return "Integrante{" +
                "numParticipantes=" + numParticipantes +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", localidad='" + localidad + '\'' +
                '}';
    }
}

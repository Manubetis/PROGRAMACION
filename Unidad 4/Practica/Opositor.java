package Ejercicio_1;

import org.codehaus.groovy.runtime.StringGroovyMethods;

import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer anioNacimiento;
    private boolean adaptacion;
    private String descripcion;
    private static int totalOpositores=0;
    private static int totalNecesitanAdaptacion=0;

    public Opositor(String nombre, String apellidos, Integer anioNacimiento, boolean adaptacion, String descripcion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.anioNacimiento = anioNacimiento;
        if (adaptacion){
            this.adaptacion = adaptacion;
            this.descripcion = descripcion;
            totalNecesitanAdaptacion++;
        }
        totalOpositores++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static int getTotalOpositores() {
        return totalOpositores;
    }

    public static void setTotalOpositores(int totalOpositores) {
        Opositor.totalOpositores = totalOpositores;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", anioNacimiento=" + anioNacimiento +
                ", adaptacion=" + adaptacion +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return adaptacion == opositor.adaptacion && nombre.equals(opositor.nombre) && apellidos.equals(opositor.apellidos) && anioNacimiento.equals(opositor.anioNacimiento) && descripcion.equals(opositor.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, anioNacimiento, adaptacion, descripcion);
    }
}

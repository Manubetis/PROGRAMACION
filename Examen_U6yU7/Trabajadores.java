import java.io.Serializable;
import java.util.Objects;

public class Trabajadores implements Serializable,Comparable<Trabajadores> {
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formcionAcademica;

    public Trabajadores(String dni, String nombre, String apellidos, int edad, String formcionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formcionAcademica = formcionAcademica;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormcionAcademica() {
        return formcionAcademica;
    }

    public void setFormcionAcademica(String formcionAcademica) {
        this.formcionAcademica = formcionAcademica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajadores that = (Trabajadores) o;
        return edad == that.edad && dni.equals(that.dni) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(formcionAcademica, that.formcionAcademica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, edad, formcionAcademica);
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formcionAcademica='" + formcionAcademica + '\'' +
                '}';
    }

    @Override
    public int compareTo(Trabajadores o) {
        if (this.getApellidos().equalsIgnoreCase(o.getApellidos())){
            return this.getNombre().compareTo(o.getNombre());
        }else{
            return this.getApellidos().compareTo(o.getApellidos());
        }
    }
}

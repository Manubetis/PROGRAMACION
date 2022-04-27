import java.io.Serializable;
import java.util.*;

public class Ofertas implements Serializable {
    private Integer codigo;
    private String descripcion;
    private Set<Trabajadores> trabajadores;
    private boolean cubierta;

    public Ofertas(Integer codigo, String descripcion, boolean cubierta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.trabajadores = new TreeSet<>();
        this.cubierta = cubierta;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Trabajadores> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(Set<Trabajadores> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ofertas ofertas = (Ofertas) o;
        return cubierta == ofertas.cubierta && codigo.equals(ofertas.codigo) && Objects.equals(descripcion, ofertas.descripcion) && Objects.equals(trabajadores, ofertas.trabajadores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, descripcion, trabajadores, cubierta);
    }

    @Override
    public String toString() {
        return "Ofertas{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", trabajadores=" + trabajadores +
                ", cubierta=" + cubierta +
                '}';
    }
}

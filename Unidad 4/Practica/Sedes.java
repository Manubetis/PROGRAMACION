package Ejercicio_1;

import java.util.Arrays;
import java.util.Objects;

public class Sedes {
    private String codigo;
    Capitales capital;
    private Opositor[] opositores;

    public Sedes(String codigo, Capitales capital) {
        this.codigo = codigo;
        this.capital = capital;
        opositores=new Opositor[0];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Capitales getCapital() {
        return capital;
    }

    public void setCapital(Capitales capital) {
        this.capital = capital;
    }

    public boolean addOpositores(Opositor opos){
        if (!esta(opos)){
            Opositor[]result= Arrays.copyOf(opositores, opositores.length+1);
            result[opositores.length-1]=opos;
            opositores=result;
            return true;
        }
        return false;
    }
    public boolean esta(Opositor opos){
        for (int i = 0; i <opositores.length; i++) {
            if (opositores[i].equals(opos)){
                return true;
            }
        }
        return false;
    }

    public boolean eliminarOpos(Opositor opos){
        Opositor[]result=new Opositor[0];
        Integer longitud=opositores.length;

        for (int i = 0; i <opositores.length; i++) {
            if (!opositores[i].equals(opos)){
                result=Arrays.copyOf(result, result.length+1);
                result[result.length-1]=opositores[i];
            }
        }
        opositores=result;
        if (longitud==result.length){
            return false;
        }
        return true;
    }
    public void mostrarInformacion(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "codigo='" + codigo + '\'' +
                ", capital=" + capital +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedes sedes = (Sedes) o;
        return codigo.equals(sedes.codigo) && capital == sedes.capital && Arrays.equals(opositores, sedes.opositores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(codigo, capital);
        result = 31 * result + Arrays.hashCode(opositores);
        return result;
    }
}

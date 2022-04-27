import java.io.*;
import java.text.CollationElementIterator;
import java.util.*;

public class SAE extends Ofertas implements Serializable {

    private Map<String, Set<Trabajadores>> trabajadores;
    private Map<Integer, Set<Ofertas>> ofertas;

    public SAE(Integer codigo, String descripcion, boolean cubierta) {
        super(codigo, descripcion, cubierta);
        this.trabajadores=new TreeMap<>();
        this.ofertas=new TreeMap<>();
    }


    public Map<String, Set<Trabajadores>> getT() {
        return trabajadores;
    }

    public void setT(Map<String, Set<Trabajadores>> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public Map<Integer, Set<Ofertas>> getO() {
        return ofertas;
    }

    public void setO(Map<Integer, Set<Ofertas>> ofertas) {
        this.ofertas = ofertas;
    }

    public boolean addOfertas(Ofertas o){
        if (ofertas.containsKey(o.getCodigo())){
            System.out.println("Ya existe una oferta con dicho código");
            return false;
        }else{
            ofertas.put(o.getCodigo(),new LinkedHashSet<>());
            ofertas.get(o.getCodigo()).add(o);
            return true;
        }
    }

    public boolean addTrabajador(Integer codigo, Trabajadores t){
        if (ofertas.containsKey(codigo)){
            trabajadores.put(t.getDni(), new LinkedHashSet<>());
            trabajadores.get(t.getDni()).add(t);
            return true;
        }else {
            System.out.println("No se puede añadir al trabajador: "+t);

        }
        return false;
    }

    public boolean removeTrabajador(Integer codigo, Trabajadores t){
        Collection<Set<Trabajadores>>c=trabajadores.values();

        if (ofertas.containsKey(codigo)){
            trabajadores.get(t.getDni()).remove(c.contains(t));

            return true;
        }else{
            System.out.println("No existe el trabajador "+t+" en la oferta del codigo "+codigo);
        }
        return false;
    }

    public void mostrarTrabajadores(Integer codigo){
        Collection<Set<Trabajadores>> t=trabajadores.values();

        Iterator it=t.iterator();
        while (it.hasNext()){
            Set<Trabajadores> tra=(Set<Trabajadores>) it.next();
            if (ofertas.containsKey(codigo)){
                System.out.println(tra);
            }else {
                System.out.println("No existen trabajadores inscritos en el listado del codigo: "+codigo);
            }
        }
    }

    public void mostrarTrabajadoresXEdad(Integer codigo){
        Collection<Set<Trabajadores>> t=trabajadores.values();

        List<Trabajadores> lista=new ArrayList<>();

        Iterator it=t.iterator();
        while (it.hasNext()){
            Set<Trabajadores> tra=(Set<Trabajadores>) it.next();
            if (ofertas.containsKey(codigo)){
                lista.addAll(tra);
            }
        }

        Collections.sort(lista, new Comparator<Trabajadores>() {
            @Override
            public int compare(Trabajadores o1, Trabajadores o2) {
                if (o1.getEdad()==o2.getEdad()){
                    return o1.getNombre().compareTo(o2.getNombre());
                }else{
                    return o1.getEdad()-o2.getEdad();
                }
            }
        });

        System.out.println(lista);

    }

    public int cantidadOfertas(String dni){
        int numOfertas=0;

        Collection<Set<Ofertas>> c=ofertas.values();

        Iterator it=c.iterator();
        while (it.hasNext()){
            Set<Ofertas> o=(Set<Ofertas>) it.next();

            if (o.contains(trabajadores.containsKey(dni))){
                numOfertas++;
            }
        }

        return numOfertas;

    }

    public void mostrarOfertas(){
        Collection<Set<Ofertas>> c=ofertas.values();

        int numTrabajadoresSolicitados=0;

        List<Ofertas> lista=new ArrayList<>();

        Iterator it=c.iterator();
        while (it.hasNext()){
            Set<Ofertas> o=(Set<Ofertas>) it.next();
            lista.addAll(o);
            numTrabajadoresSolicitados++;
        }

        Collections.sort(lista, new Comparator<Ofertas>() {
            @Override
            public int compare(Ofertas o1, Ofertas o2) {
                return o2.getCodigo()-o1.getCodigo();
            }
        });

        System.out.println(lista);
    }

    public void cargarDatos(){
        ObjectInputStream ois=null;

        try {
            ois=new ObjectInputStream(new FileInputStream("sae.dat"));

            while (true){
                Ofertas o=(Ofertas) ois.readObject();
                addOfertas(o);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardarDatos(){
        ObjectOutputStream oos=null;

        try {
            oos=new ObjectOutputStream(new FileOutputStream("sae.dat"));

            Collection<Set<Ofertas>> ofer=ofertas.values();

            Iterator it=ofer.iterator();
            while (it.hasNext()){
                Set<Ofertas> o=(Set<Ofertas>) it.next();

                for (Ofertas ofertas : o) {
                    oos.writeObject(ofertas);
                }
            }

            Collection<Set<Trabajadores>> tra=trabajadores.values();

            Iterator it2=tra.iterator();
            while (it2.hasNext()){
                Set<Trabajadores> s=(Set<Trabajadores>) it2.next();

                for (Trabajadores trabajadores : s) {
                    oos.writeObject(trabajadores);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "SAE{" +
                "trabajadores=" + trabajadores +
                ", ofertas=" + ofertas +
                '}';
    }
}

package Examen;

public class Main {
    public static void main(String[] args) {
        // Creación de los datos de cada clase:

        Chirigota chirigota1=new Chirigota("Paquita","Keni","Manuel","Carlos",212,"Hawai",true,12);
        Chirigota chirigota2=new Chirigota("Eustaquia","Juan","Oscar","Yolanda",3,"Jaio",true,1);
        Romancero romancero1=new Romancero("Campin","Angel","Polak","LOl",15,"Jaula","Rail");
        Romancero romancero2=new Romancero("Agustin","Carlos","Miguel","Julio",40,"Saltar","Poni");

        Integrante inte1=new Integrante(12,"Julian",12,"Sevilla");
        Integrante inte2=new Integrante(1,"Polo",18,"Murcia");
        Integrante inte3=new Integrante(11,"Dario",10,"Jaén");

        // Metodos cantar_la_presentacion() y hacer_tipo()

        chirigota1.cantar_la_presentacion();
        romancero2.cantar_la_presentacion();

        chirigota2.hacer_tipo();
        romancero1.hacer_tipo();

        // Añadir y eliminar integrantes

        chirigota1.insertar_integrante(inte1);
        chirigota1.insertar_integrante(inte2);
        chirigota1.insertar_integrante(inte3);
        System.out.println(chirigota1);

        chirigota1.eliminar_integrante(inte2);
        System.out.println(chirigota1);


        // metodo caminito_del_falla
        chirigota1.caminito_del_falla();

        // metodo amo_a_escucha

        chirigota2.amo_a_escucha();
        chirigota1.amo_a_escucha();

        // Ordenacion:

        COAC coac1=new COAC();
        COAC coac2=new COAC();

        coac1.inscribir_agrupacion(chirigota1);
        coac1.inscribir_agrupacion(chirigota2);
        System.out.println(coac1);

        coac2.eliminar_agrupacion(chirigota1);
        System.out.println(coac1);

        coac1.ordenar_por_autor();
        System.out.println(coac1);

        coac2.ordenar_por_nombre();
        System.out.println(coac1);

        coac1.ordenar_por_puntos();
        System.out.println(coac1);

    }
}

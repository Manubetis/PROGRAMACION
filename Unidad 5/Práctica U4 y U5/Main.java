package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Personas p1=new Personas("1120240","Manuel Jaén Rojas",21315);
        Personas p2=new Personas("5335114","Angelina Yoli Lena",413515);
        Personas p3=new Personas("1326736","Marquito Cisqui Octavo",413515);
        Vivienda v1=new Vivienda(1999,"agagwgq",122,2,4,5,132145);
        Vivienda v2=new Vivienda(1839,"adaga",100,1,2,7,900000);
        Vivienda v3=new Vivienda(2021,"LOS DIOS",5000000,10,20,1000,10);
        Registro r1=new Registro();
        Registro r2=new Registro();
        Registro r3=new Registro();
        LocalIndustrial l1=new LocalIndustrial(1999,"Paquito en tu esquina",1241,"El CHUQUI",99,"mucho");
        LocalIndustrial l2=new LocalIndustrial(1769,"Calle en meio",3513,"Tu hermano",1,"poco");
        LocalIndustrial l3=new LocalIndustrial(1239,"A lao de tu caha",421,"Cisquito",123,"mas o menos");
        LocalComercial c1=new LocalComercial(2002,"mu lejo",14,"Junior",132143,"Asesio");
        LocalComercial c2=new LocalComercial(2020,"tu vecino",11,"Carlito",13214,"Giri");
        LocalComercial c3=new LocalComercial(2021,"Calle Sierpes",214,"Angeliño",111111,"Arquitecto");
        EquipamientoServicio e1=new EquipamientoServicio(1288,"Carmona nº2",1241,TipoEquipamiento.EDUCATIVO);
        EquipamientoServicio e2=new EquipamientoServicio(2003,"Rafael Obispo Bellido Caro",11,TipoEquipamiento.DEPORTIVO);
        EquipamientoServicio e3=new EquipamientoServicio(1902,"LA BARRI",41,TipoEquipamiento.SANITARIO);


        // Añadir personas a viviendad y eliminarlas:
        v1.addPerson(p1);
        v1.addPerson(p2);
        v1.addPerson(p3);
        System.out.println(v1);
        v1.elimPerson(p1);
        System.out.println(v1);

        // Añadir personas a viviendad:
        v2.addPerson(p3);
        v2.addPerson(p1);

        //En los siguientes metodos mostrare las propiedades de la vivienda 1 y 2:
        v2.mostrarPropiedad();
        v1.mostrarPropiedad();

        //En estos metodos mostrare el precio de una Vivienda:
        v1.precio();

        //En estos metodos mostrare el precio de un LocalComercial:
        l1.precio();

        //En estos metodos mostrare el precio de un LocalIndustrial:
        c1.precio();
        System.out.println();

        //Añadir y eliminar propiedades en Registro:

        r1.addPropiedad(v1);
        r1.addPropiedad(v2);

        r1.elimPropiedad(v2);

        //Ahora se motrara el informe de Superficie que ordena las Propiedades por superficie
        // y las muestra por pantalla:

        r1.informeSuperficie();

        //Ahora se mostrara el informe de Antiguedad que ordena las Propiedades
        // por antiguedad mostrando primero los más nuevos,
        // y en caso de empate las propiedades más grandes primero:

        r1.informeAntiguedad();

        //Voy a ordenar las viviendad por total de habitaciones:
        Vivienda[]vivied={v1,v2,v3};

        Arrays.sort(vivied,new OrdenarViviendad());
        System.out.println(Arrays.toString(vivied));

    }
}

public class Main {
    public static void main(String[] args) {

        //Sae:
        SAE sae=new SAE(1,"Buenas días/tardes/noches",true);

        // Ofertas:
        Ofertas of1=new Ofertas(1213,"Hola que tal",true);
        Ofertas of2=new Ofertas(4262,"Buenas tardes",false);
        Ofertas of3=new Ofertas(9574,"Adios crack",false);
        Ofertas of4=new Ofertas(3242,"Viva el Betis",true);
        Ofertas of5=new Ofertas(5637,"Buena suerte",true);

        // Trabajadores:
        Trabajadores t1=new Trabajadores("12345670P","Alejandro","Domiguez Jul",
                19,"adfaf");
        Trabajadores t2=new Trabajadores("12312356W","Alvaro","Pas Fal",
                22,"adfaf");
        Trabajadores t3=new Trabajadores("14256734I","Angel","Fsfag Fgag",
                10,"adfaf");
        Trabajadores t4=new Trabajadores("84362746O","Miguel","Kifasof Koa",
                10,"adfaf");
        Trabajadores t5=new Trabajadores("95945243K","Ivan","Pofal Hifaf",
                22,"adfaf");
        Trabajadores t6=new Trabajadores("95834623J","Daniel","Fraera Iiaf",
                25,"adfaf");
        Trabajadores t7=new Trabajadores("06342421H","Adrian","Lajga Juafa",
                12,"adfaf");
        Trabajadores t8=new Trabajadores("83486452S","Paula","Dfiae Lfa",
                65,"adfaf");
        Trabajadores t9=new Trabajadores("95983521B","Yolanda","Ñofaj Huaf",
                21,"adfaf");
        Trabajadores t10=new Trabajadores("6243721D","Rocio","Wfaf Yufaf",
                40,"adfaf");

        // Introducir oferta:
        sae.addOfertas(of1);
        sae.addOfertas(of2);
        sae.addOfertas(of3);
        sae.addOfertas(of4);
        sae.addOfertas(of5);

            // En la siguiente dira que ya existe una oferta con dicho código:
            sae.addOfertas(of1);


        // Añadir trabajadores en la oferta indicada:
        sae.addTrabajador(4262,t1);
        sae.addTrabajador(4262,t2);
        sae.addTrabajador(4262,t4);
        sae.addTrabajador(4262,t10);

        System.out.println(of2);

            //En la siguiente no podrá introducirlo porque el codigo que le dar de oferta no existe:
                sae.addTrabajador(123124,t2);

        // Eliminar trabajador en una oferta:
        sae.removeTrabajador(4262,t4);

        // Mostrar los Trabajadores:
        sae.mostrarTrabajadores(4262);

        // Mostrar los Trabajadores por edad:
        sae.mostrarTrabajadoresXEdad(4262);

        // Mostrar la cantidad de ofertas solicitados por dicho trabajador:
        sae.cantidadOfertas("12345670P");


        // Mostrar ofertas:
        sae.mostrarOfertas();

        // Cargar los datos en el fichero sae.dat:
        sae.cargarDatos();

        // Guardar los datos en el fichero sae.dat:
        sae.guardarDatos();


    }
}

package Ejercicio_1;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Examen ex1=new Examen(Calendar.getInstance(), "FAGAEGAE", "https://Mamertin.es");
        Sedes sed1=new Sedes("526215135",Capitales.Cadiz);
        Sedes sed2=new Sedes("6356252", Capitales.Sevilla);
        Opositor opositor1=new Opositor("Mamerto", "Gil", 1241,true,"Gagaegagaega");
        Opositor opositor2=new Opositor("Krilin", "Gil", 1241,true,"Gagaegagaega");
        Opositor opositor3=new Opositor("Eustaquio", "Gil", 1241,false,null);
        Opositor opositor4=new Opositor("Genio", "Gil", 1241,true,"Gagaegagaega");

        System.out.println(Opositor.getTotalOpositores());

        sed1.addOpositores(opositor1);
        sed1.addOpositores(opositor2);
        sed1.addOpositores(opositor3);
        sed1.addOpositores(opositor4);
        sed1.eliminarOpos(opositor1);

        sed2.addOpositores(opositor3);
        sed2.addOpositores(opositor4);
        sed2.eliminarOpos(opositor3);

        Preguntas preg1=new Preguntas("Si mamerto va a tocar la guitarra, ¿la va a parti?");
    }
}

package com.company;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduzca la altura de la bandera en cm: ");
        double altura=sc.nextInt();
        System.out.println("Introduce la anchura de la bandera en cm: ");
        double anchura=sc.nextInt();

        double precioBase=(altura*anchura)*0.01;
        double precioEscudo=2.50;
        double gastosEnvios=3.25;

        String respuesta="";

        sc.nextLine();

        System.out.println("¿Quieres el escudo bordao?");
        respuesta=sc.nextLine();

        System.out.println("Gracias aquí tienes el desglose de su compra");

        System.out.println("Bandera de "+altura*anchura+"cm2: "+precioBase);


        if (respuesta.equals("si")){
            System.out.println("Con escudo: "+precioEscudo);

        }else{
            System.out.println("Sin escudo: "+0.00);
        }
        System.out.println("Gastos de envio: "+gastosEnvios);

        double total1=precioEscudo+precioBase+gastosEnvios;
        double total2= precioBase+gastosEnvios;

        if (respuesta.equals("si")){
            System.out.println("Total: "+total1);
        }else{
            System.out.println("Total: "+total2);
        }
    }
}

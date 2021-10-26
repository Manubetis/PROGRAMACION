package com.company;

import java.util.Scanner;

public class Práctica_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de personas que sois");
        int personas = sc.nextInt();
        System.out.println("Introduzca el día de la semana que iréis");
        String dia = sc.next();
        System.out.println("¿Tiene tarjeta de CineCampa? (Si/No)");
        String tarjeta=sc.next();
        int individuales=0;
        double descuento=0;
        double preciobase=8;
        double total=0;

        switch (dia){
            case "Lunes":
                individuales=personas;
                total=personas*preciobase;
            case "Martes":
                individuales=personas;
                total=personas*preciobase;
            case "Miércoles":
                preciobase=5;
                individuales=personas;
                total=personas*preciobase;
            case "Jueves":
                total=(personas/2)*11;
                int pico=(personas%2)*8;
                total+=pico;
            case "Viernes":
                individuales=personas;
                total=personas*preciobase;
            case "Sábado":
                individuales=personas;
                total=personas*preciobase;
            case "Domingo":
                individuales=personas;
                total=personas*preciobase;
        }

        if (tarjeta.equals("Si")){
            descuento=personas*preciobase*0.1;
        }


        System.out.println("Venta de entradas CineCampa");
        System.out.println("Número de entradas por persona:                  "+personas);
        System.out.println("¿Tiene tarjeta de CineCampa? (s/n)  "+tarjeta);
        System.out.println();
        if (dia.equals("Jueves")){
            System.out.println("Entrada de parejas:                  "+(personas/2));
            System.out.println("Precio de entrada por pareja         "+11);
        }else {
            System.out.println("Entradas individuales:               "+individuales);
            System.out.println("Precio por entrada individual:       "+preciobase);
        }
        System.out.println("Total:                               "+total);
        System.out.println("Descuento:                           "+descuento);
        System.out.println("A pagar:                             "+(total-descuento));
    }
}


package com.company;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int i, num;
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce un número");
        num= sc.nextInt();

        System.out.println("Mostrando los 10 números posteriores");
        i=num;

        while (i<=num+10){
            System.out.println("Número psoterrior"+i);
            i++;
        }
    }
}

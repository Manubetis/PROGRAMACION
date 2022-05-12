package com.company;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int altura;
        do {
            System.out.println("Introduce una altura");
            altura= sc.nextInt();
        }while (altura<3);

        int longitud=6;
        int espacios=altura;
        for (int i = 0; i <altura; i++) {
                for (int j = 0; j < espacios; j++) {
                    System.out.print("-");
                }
                for (int j = 0; j < longitud; j++) {
                    System.out.print("*");
                }
                System.out.println();
                longitud += 2;
                espacios--;
        }
    }
}

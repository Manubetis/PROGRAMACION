package com.company;

import java.util.Scanner;

public class Práctica_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la z (impar y mayor que 3)");

        int altura = sc.nextInt();
        int planta = 1;
        int espacios = altura;

        while (altura % 2 == 0 || altura < 3) {

            System.out.println("Error");
            System.out.println("Introduce la altura bien");
            altura = sc.nextInt();

        }
        for (int i = 0; i < altura; i++) {
            for (int j = 1; j <espacios; j++) {
                if (i == 0 || i == altura - 1 || i+j ==altura-1 ) {
                    System.out.print("*");
                }
                }
            System.out.println();
            }
        }
    }


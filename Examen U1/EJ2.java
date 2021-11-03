package com.company;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAlreves = 0;
        int posicion = 0;
        int posFinal = 0;
        int posInicial = 0;
        int num;

        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        {
            while (num > 0) {
                numAlreves = (numAlreves * 10) + (num % 10);
                num /= 10;

            }
            num = numAlreves;
            numAlreves = 0;

            while (num > 0) {
                if (posFinal < posInicial || posFinal > posInicial) {
                    numAlreves = (numAlreves * 10) + (num % 10);
                    num /= 10;
                    System.out.println("*");

                } else if (posFinal < numAlreves) {
                    System.out.println("_");
                }

            }
        }
    }
}

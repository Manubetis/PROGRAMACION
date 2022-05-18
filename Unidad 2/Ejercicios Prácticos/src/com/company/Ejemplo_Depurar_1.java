package com.company;

import java.util.Scanner;

public class Ejemplo_Depurar_1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        num= sc.nextInt();

        for (int i = 0; i <num; i++) {

            if (i%2==0){
                System.out.println("Soy "+i+" y soy un número par");
            }
        }
    }
}

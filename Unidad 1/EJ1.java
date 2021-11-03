package com.company;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int altura;
        int numHuecos=0;


       do {
            System.out.println("Introduce la altura");
            altura= sc.nextInt();
        } while (altura<=4);

        numHuecos = altura - 3;


        for (int i = 0; i <altura; i++) {
            for (int j = 0; j <numHuecos; j++) {
                System.out.print("-");

            }
            if (i!=0 || i ==altura){
                System.out.println("*");
            }else{
                System.out.println("-");

            }

        }
    }
}

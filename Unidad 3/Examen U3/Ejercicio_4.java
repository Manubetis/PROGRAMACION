package com.company;

import java.util.Arrays;

public class Ejercicio_4 {
    public static void main(String[] args) {
        int[][]v=new int[4][4];
        for (int i = 0; i <v.length; i++) {
            for (int j = 0; j <v[i].length; j++) {
                int numAleatorio=(int) (Math.random()*101);
                v[i][j]=numAleatorio;
            }
        }
        for (int[] row:v) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Eliminar Filas Pares:");
        System.out.println(Arrays.toString(eliminarFilasPares(v)));
        System.out.println("Eliminar Filas Impares:");
        System.out.println(Arrays.toString(eliminarFilasImpares(v)));

    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][]result=new int[0][0];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {

            }
        }

        return result;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][]result=new int[0][0];
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j <matriz[i].length; j++) {

            }
        }

        return result;
    }
    public static boolean esPar(int n){
        if (n%2==0){
            return true;
        }
        return false;
    }
}

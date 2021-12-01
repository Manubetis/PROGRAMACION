package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las filas");
        int fila = sc.nextInt();

        System.out.println("Itroduce las columnas");
        int columnas= sc.nextInt();

        int[][] v = new int[fila][columnas];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                int randomNum = (int) (Math.random() * 16);
                v[i][j] = randomNum;
            }
        }
        for (int[]row:v) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Introduce el número de columnas: ");
        int Columna= sc.nextInt();

        System.out.println("La matriz desplazada: ");
        for (int[]row:desplazarMatriz(Columna, v)) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] desplazarMatriz (int Columna, int[][] num){
        int[][]result=new int[num.length][num[0].length];
        while (Columna>=num[0].length){
            Columna-=num[0].length;
        }
        for (int i = 0; i <num.length; i++) {
            for (int j = 0; j <num[i].length; j++) {
                if (j+Columna<num[i].length){
                    result[i][j+Columna]=num[i][j];
                }else {
                    result[i][j+Columna-num[i].length]=num[i][j];
                }
            }
        }
        return result;
    }
}

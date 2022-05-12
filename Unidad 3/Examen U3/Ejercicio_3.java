package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número entero para la matriz cuadrada");
        int dimension=sc.nextInt();

        int[][]v=new int[dimension][dimension];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j <v[i].length; j++) {
                int numAleatorio=(int) (Math.random()*100)+101;
                v[i][j]=numAleatorio;
            }
        }
        for (int[]row:v) {
            System.out.println(Arrays.toString(row));
        }
    }
    public static int numPicos(int n, int[]v){

        return n;
    }
    public static boolean numMayor(int n1,int n2){
        if (n1>n2){
            return true;
        }else{
            return false;
        }
    }
}

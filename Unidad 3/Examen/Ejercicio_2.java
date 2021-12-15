package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []vector=new int[5];
        int pos;

        for (int i = 0; i <vector.length; i++) {
            vector[i]=(int) (Math.random()*11);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(instertarValor(vector,3,2)));

    }
    public static int[] instertarValor(int []v, int n, int pos){
        int[]resultado=new int[6];
        for (int i = 0; i <v.length; i++) {
            if (v[i]==pos){
                resultado[i] =n;
            }else {
                resultado[i] += v[i];
            }
        }
        return resultado;
    }
}

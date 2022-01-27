package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce un número entero");
        String num= sc.nextLine();

        int[]v=new int[0];
        for (int i = 1; i <=num.length(); i++) {
            v= Arrays.copyOf(v, v.length+1);
            v[v.length-1]=i;
        }
        System.out.println(Arrays.toString(v));

        System.out.println("Introduce la posición");
        int pos= sc.nextInt();

        System.out.println("Introduce el valor que quieras meter");
        int valor= sc.nextInt();

        System.out.println(introducirDigito(v, valor, pos));




    }
    public static String introducirDigito (int[]v, int valor, int pos){
        int[]result=new int[0];

        for (int i = 0; i <v.length; i++) {
            if (i==pos){
                result= Arrays.copyOf(result, result.length+1);
                result[result.length-1]=valor;
            }else{
                result= Arrays.copyOf(result, result.length+1);
                result[result.length-1]=v[i];
            }
        }

        String resultado="";
        for (int i = 0; i < result.length; i++) {
            resultado+=result[i];
        }
        return resultado;
    }
}

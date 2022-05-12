package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el tamaño del primer vector");
        int tamaño1=sc.nextInt();
        System.out.println("Introduce el tamaño del segundo vector");
        int tamaño2= sc.nextInt();

        int[]a=new int[tamaño1];

        for (int i = 0; i <a.length; i++) {
            a[i]=(int) (Math.random()*11);
        }
        int[]b=new int[tamaño2];
        for (int i = 0; i <b.length; i++) {
            b[i]=(int) (Math.random()*11);
        }

        System.out.println("Vector a: "+ Arrays.toString(a));
        System.out.println("Vector b: "+ Arrays.toString(b));
        System.out.println("Números iguales ordenados: "+Arrays.toString(interseccionVectores(a, b)));

    }
    public static int[] interseccionVectores(int[]a, int[]b) {
        int[] result = new int[0];

        for (int i = 0; i < a.length; i++) {
            if (esta(result, a[i])) {
                result=Arrays.copyOf(result, result.length-1);
                result[a.length-1]=a[i];
            }
            }
        for (int i = 0; i < b.length; i++) {
            if (esta(result, b[i])) {
                result=Arrays.copyOf(result, result.length-1);
                result[b.length-1]=b[i];
            }
        }
        return result;
    }
    public static boolean esta(int[] a, int num){
        for (int i = 0; i <a.length; i++) {
            if (num==a[i]){
                return true;
            }
        }
        return false;
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del primer vector:");
        int tam1=sc.nextInt();
        System.out.println("Introduce el tamaño del segundo vector:");
        int tam2=sc.nextInt();

        int[] v1=new int[tam1];
        int[] v2=new int[tam2];

        for (int i = 0; i < v1.length; i++) {
            System.out.println("Introduce un número ");
            v1[i]=sc.nextInt();
        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Introduce un número ");
            v2[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println("Media de los dos vectores: "+Arrays.toString(mediaVectores(v1,v2)));

    }
    public static float[] mediaVectores(int[] a, int[] b){
        float[] resultado=new float[Math.max(a.length,b.length)];

        for (int i = 0; i < resultado.length; i++) {
            if (i<Math.min(a.length, b.length)){
                float aFloat = a[i];
                float bFloat = b[i];
                resultado[i]=(aFloat+bFloat)/2;
            }else{
                if (resultado.length==a.length){
                    resultado[i]=a[i];
                }else{
                    resultado[i]=b[i];
                }
            }
        }
        return resultado;
    }
}

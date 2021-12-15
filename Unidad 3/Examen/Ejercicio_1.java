package com.company;

import java.util.Arrays;

public class Ejercicio_1 {
    public static void main(String[] args) {
        int[] v1 = new int[4];
        int[] v2 = new int[4];
        float[]media=new float[4];

        for (int i = 0; i < v1.length; i++) {
            float suma = 0;
            v1[i] = (int) (Math.random() * 11);
            suma++;
            for (int j = 0; j < v2.length; j++) {
                v2[j] = (int) (Math.random() * 11);
                suma++;
                media[j]+=suma/2;

            }
        }
        System.out.println("El primer vector es: "+Arrays.toString(v1));
        System.out.println("El segundi vector es: "+Arrays.toString(v2));
        System.out.println("La media de los dos vectores es: "+Arrays.toString(media));
    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        char[] palabraAlreves=new char[palabra.length()];

        for (int i = 0; i <palabra.length(); i++) {
            int pos=1;
            palabraAlreves[i]=palabra.charAt(palabra.length()-pos);
            pos++;
        }

        System.out.println(Arrays.toString(palabraAlreves));

        System.out.println(Arrays.toString(desplazarVocales(palabra)));
    }

    public static char[] desplazarVocales(String palabra) {
        char[] result = new char[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            if (esVocal(palabra.charAt(i))) {
                if (palabra.charAt(i) == 'a') {
                    result[i] = 'e';
                }
                if (palabra.charAt(i) == 'e') {
                    result[i] = 'i';
                }
                if (palabra.charAt(i) == 'i') {
                    result[i] = 'o';
                }
                if (palabra.charAt(i) == 'o') {
                    result[i] = 'u';
                }
                if (palabra.charAt(i) == 'u') {
                    result[i] = 'a';
                }
            } else {
                if (!esVocal(palabra.charAt(i)))
                result[i] = palabra.charAt(i);
            }
        }
        return result;
    }

    public static boolean esVocal(char letra) {
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

                if (letra==(vocales.length)) {
                    return true;
                }
        return false;
    }
}

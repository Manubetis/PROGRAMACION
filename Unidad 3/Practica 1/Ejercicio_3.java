package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el tamaño");
            int tamaño1 = sc.nextInt();

            int[][] v = new int[tamaño1][tamaño1];

            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v[i].length; j++) {
                    int randomNum = (int) (Math.random() * (65 - 18) + 18);
                    v[i][j] = randomNum;
                }
            }

            int[] diag = new int[v.length];

            for (int i = 0; i < v.length; i++) {
                for (int j = 0; j < v[i].length; j++) {
                    if (i == j) {
                        diag[i] = v[i][j];
                    }
                }
            }
            for (int[] row : v) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println("Diagonal" + Arrays.toString(diag));

            int menor = diag[0];
            int mayor = diag[0];
            double suma = 0;
            for (int i = 0; i <v.length; i++) {
                if (diag[i] > mayor) {
                    mayor = diag[i];
                } else if (diag[i] < menor) {
                    menor = diag[i];
                }
            }

            for (int i = 0; i < diag.length; i++) {
                suma += diag[i];
            }

            double media = suma / diag.length;

            System.out.println("Máximo: " + mayor);
            System.out.println("Mínimo " + menor);
            System.out.println("Media: " + media);
        }
    }

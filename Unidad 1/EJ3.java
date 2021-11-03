package com.company;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {

        int palos = (int) (Math.random()*4);
        int carta = (int) (Math.random()*13);


        switch (palos) {

            case 0: {
                System.out.println("Palo es: picas");
                break;
            }
            case 1: {
                System.out.println("Palo es: corazones");
                break;
            }
            case 2: {
                System.out.println("Palo es: diamantes");
                break;
            }
            case 3: {
                System.out.println("Palo es: tréboles");
                break;
            }

        }
        switch (carta) {

            case 0: {
                System.out.println("Carta es: A");
                break;
            }
            case 1: {
                System.out.println("Carta es: 2");
                break;
            }
            case 2: {
                System.out.println("Carta es: 3");
                break;
            }
            case 3: {
                System.out.println("Carta es: 4");
                break;
            }
            case 4: {
                System.out.println("Carta es: 5");
                break;
            }
            case 5: {
                System.out.println("Carta es: 6");
                break;
            }
            case 6: {
                System.out.println("Carta es: 7");
                break;
            }
            case 7: {
                System.out.println("Carta es: 8");
                break;
            }
            case 8: {
                System.out.println("Carta es: 9");
                break;
            }
            case 9: {
                System.out.println("Carta es: 10");
                break;
            }
            case 10: {
                System.out.println("Carta es: J");
                break;
            }
            case 11: {
                System.out.println("Carta es: Q");
                break;
            }
            case 12: {
                System.out.println("Carta es: K");
            }
        }
    }
}
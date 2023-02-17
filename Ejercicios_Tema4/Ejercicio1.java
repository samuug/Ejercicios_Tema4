package Ejercicios_Tema4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de notas: ");
        double numNotas = sc.nextDouble();
        double notas=0;
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Introduce la nota: ");
            notas += sc.nextDouble();
        }
        System.out.println("La media es: " + notas/numNotas);
    }
}

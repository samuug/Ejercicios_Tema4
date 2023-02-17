package Ejercicios_Tema4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esMultiplo = false;
        System.out.println("Escriba un múltiple de 3: ");
        while (!esMultiplo) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                System.out.println("Ok: "+num+" es múltiple de 3");
                esMultiplo = true;
            } else {
                System.out.println("Error, "+num+" es múltiple de 3");
            }
        }
    }
}

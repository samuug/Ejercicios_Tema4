package Ejercicios_Tema4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        while (true) {
            System.out.println("Introduce un número: ");
            int num2 = sc.nextInt();
            if (num2 == num) {
                System.out.println("Bravo, lo has acertado!");
                break;
            } else if (num2 > num) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
        }
    }
}

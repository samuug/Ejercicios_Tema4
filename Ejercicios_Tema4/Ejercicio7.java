package Ejercicios_Tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {

    static void imprimirMenu() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            System.out.println();
            System.out.println("Bienvenido al menú de la aplicación");
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado.nextInt();
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("¡Viva la ciudad del miedo!");
                        break;
                    case 2:
                        System.out.println("¡Bond, James Bond!");
                        break;
                    case 3:
                        System.out.println("¡La vida es un largo río tranquilo!");
                        break;
                    case 4:
                        System.out.println("¡Que la fuerza te acompañe!");
                        break;
                    case 5:
                        System.out.println("Adios 🖐");
                        System.out.println("¡Por supuesto, puede elegir las películas y las citas que prefiera!");
                        salir = true;
                        break;
                    default:
                        System.out.println("⚠⚠ ¡El número que ha insertado es incorrecto😡!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserte de nuevo una opcion valida");
                teclado.nextInt();
            }
        } while (!salir);
    }
    public static void main(String[] args) {
        imprimirMenu();
    }

}

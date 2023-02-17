package Ejercicios_Tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {
    public static void imprimirRectanguloConRelleno(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void imprimirRectanguloSinRelleno(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirCruzDeSanAndres(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j || i + j == tamaño - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirTriangulo(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            System.out.println("");
            for (int j = 0; j < tamaño; j++) {
                if(i==tamaño-1 || j==0){
                    System.out.print(caracter);
                } else if (i==j) {
                    System.out.print(caracter);
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
    public static void imprimirRombo(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (j >= tamaño / 2 - i && j <= tamaño / 2 + i) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirAjedrezado(int tamaño, char caracter) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void imprimirMenu() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        System.out.println("¿Tamaño?");
        int tamaño = teclado.nextInt();
        System.out.println("¿Carácter?");
        char caracter = teclado.next().charAt(0);
        System.out.println("¿Forma?");
        System.out.println("1 - Rectángulo con relleno");
        System.out.println("2 - Rectángulo sin relleno");
        System.out.println("3 - Cruz de San Andrés");
        System.out.println("4 - Triángulo rectángulo sin relleno");
        System.out.println("5 - Rombo");
        System.out.println("6 - Ajedrezado");
        int opcion = teclado.nextInt();
        try {
                switch (opcion) {
                    case 1:
                        imprimirRectanguloConRelleno(tamaño, caracter);
                        break;
                    case 2:
                        imprimirRectanguloSinRelleno(tamaño, caracter);
                        break;
                    case 3:
                        imprimirCruzDeSanAndres(tamaño, caracter);
                        break;
                    case 4:
                        imprimirTriangulo(tamaño, caracter);
                        break;
                    case 5:
                        imprimirRombo(tamaño, caracter);
                        break;
                    case 6:
                        imprimirAjedrezado(tamaño, caracter);
                        break;
                    default:
                        System.out.println("⚠⚠ ¡El número que ha insertado es incorrecto😡!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Inserte de nuevo una opcion valida");
                teclado.nextInt();
        }
    }
    public static void main(String[] args) {
        imprimirMenu();
    }
}

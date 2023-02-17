package Ejercicios_Tema4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media=0;
        double nota=0;
        double cont=0;
        do {
            System.out.println("¿Nota (-1 para terminar)? ");
            nota=sc.nextDouble();
            if (nota != -1){
                media+=nota;
                cont++;
            }
        }while (nota != -1);
        System.out.println("La media es: " + media/cont);
    }
}

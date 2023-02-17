package Ejercicios_Tema4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {


        public static void adivinoNumero(){
            Scanner teclado = new Scanner(System.in);
            Random rand  = new Random();
            boolean encontrado=false;
            //int numSecretro = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
            int numElegido = (int)Math.floor(Math.random() * (100 - 0 + 1) + 0);
            System.out.println("Elige un numero del 1 al 100 luego presiona cualquer tecla");
            int max=100;
            int min=0;
            int cont=0;
            while(!encontrado){
                System.out.println("Pruebo con "+numElegido+"¿Es mayor, menor o es el numero secreto(+/-/=)?");
                char pista = teclado.nextLine().charAt(0);
                switch (pista){
                    case '+':
                        min=numElegido;
                        numElegido = (int)Math.floor(Math.random() * (max - min + 1) + min);
                        cont++;
                        break;
                    case '-':
                        max=numElegido;
                        numElegido = (int)Math.floor(Math.random() * (max - min + 1) + min);
                        cont++;
                        break;
                    case '=':
                        encontrado=true;
                        cont++;
                        break;
                    default:
                        System.out.println("No has elegido una opcion valida");

                }
            }
            System.out.println("Fenomenal, lo he encontrado después de "+cont+" intentos");
        }



    public static void main(String[] args) {
        System.out.println("Elige un numero del 1 al 100, luego presione cualquier tecla para continuar:");
        adivinoNumero();

    }
}

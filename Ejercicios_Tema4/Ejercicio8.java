package Ejercicios_Tema4;

import java.lang.reflect.Array;
import java.util.*;

public class Ejercicio8 {
    static void imprimirMenu() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        ArrayList<String> ciudadDM = new ArrayList<String>(Arrays.asList("¡Viva la ciudad del miedo!", "CIUDAD DEL MIEDO", "daba mucho miedo", "En la ciudad del miedo, la gente se muere de miedo"));
        ArrayList<String> james = new ArrayList<String>(Arrays.asList("¡Bond, James Bond!", "JAMES BOND", "Bond, James Bond", "James Bond"));
        ArrayList<String> vida = new ArrayList<String>(Arrays.asList("¡La vida es un largo río tranquilo!", "LA VIDA ES UN LARGO RIO TRANQUILO", "La vida es un largo río tranquilo", "la vida es un largo rio tranquilo"));
        ArrayList<String> starWars = new ArrayList<String>(Arrays.asList("¡Que la fuerza te acompañe!", "QUE LA FUERZA TE ACOMPAÑE", "que la fuerza te acompañe", "Que la fuerza te acompañe"));
        do {
            System.out.println();
            System.out.println("Bienvenido al menú de la aplicación");
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado.nextInt();
            Random r = new Random();
            int num = r.nextInt(4) + 1;
            try {
                switch (opcion) {
                    case 1:
                        System.out.println(ciudadDM.get(num));
                        break;
                    case 2:
                        System.out.println(james.get(num));
                        break;
                    case 3:
                        vida.get(num);
                        break;
                    case 4:
                        starWars.get(num);
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

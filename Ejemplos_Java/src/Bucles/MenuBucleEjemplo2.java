package Bucles;


import java.util.Scanner;

/**
 *
 * @author gabrielheralv /**
 *
 * @author gabrielheralv
 */

public class MenuBucleEjemplo2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        String opcion;
        do {
            System.out.println("Menu: ");
            System.out.println("1-. Ejercicio 1");
            System.out.println("2-. Ejercicio 2");
            System.out.println("3-. Ejercicio 3");
            System.out.println("Z-. Salir");
            System.out.println("Opcion: ");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "Z":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion.equals("Z"));
            System.out.println("Menu: ");
            System.out.println("1-. Ejercicio 1");
            System.out.println("2-. Ejercicio 2");
            System.out.println("3-. Ejercicio 3");
            System.out.println("Z-. Salir");

            System.out.println("Opcion: ");
            opcion = sc.next();
            switch (opcion) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "Z":
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    static void ejercicio1() {
        String numStr = sc.next();
        int num = Integer.parseInt(numStr);
        double numDec = Double.parseDouble(numStr);
    }

    static void ejercicio2() {

    }

    static void ejercicio3() {

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class EjerciciosArray1 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        s.useDelimiter("\n");
        String op = "";
        do {
            System.out.println("");
            System.out.println("1.- Ejercicio 1");
            System.out.println("2.- Ejercicio 2");
            System.out.println("3.- Ejercicio 3");
            System.out.println("4.- Ejercicio 4");
            System.out.println("5.- Ejercicio 5");
            System.out.println("6.- Ejercicio 6");
            System.out.println("7.- Ejercicio 7");
            System.out.println("8.- Ejercicio 8");
            System.out.println("z.- Salir");
            System.out.print("Elige un Ejercicio: ");
            op = s.next();

            switch (op) {
                case "1":
                    Exercise1();
                    break;
                case "2":
                    Exercise2();
                    break;
                case "3":
                    Exercise3();
                    break;
                case "4":
                    Exercise4();
                    break;
                case "5":
                    Exercise5();
                    break;
                case "6":
                    Exercise6();
                    break;
                case "7":
                    Exercise7();
                    break;
                case "8":
                    Exercise8();
                    break;
                case "z":
                    System.out.println("Gracias por ver mis Ejercicios");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (op.equals("z"));
    }

    static void Exercise1() {
        int num = 0;
        int listaNums[] = new int[10];
        for (int i = 0; i < listaNums.length; i++) {
            System.out.println("Dime 10 numeros aleatorios " + (i + 1) + " : ");
            num = s.nextInt();
            listaNums[i] = num;
        }
        for (int j = listaNums.length - 1; j >= 0; j--) {
            System.out.print((listaNums[j]) + "\t");
        }

    }

    static void Exercise2() {
        int listaNumero[] = new int[20];
        int listaCuadrado[] = new int[20];
        int listaCubo[] = new int[20];
        Random Numero = new Random();

        for (int i = 0; i < listaNumero.length; i++) {
            listaNumero[i] = Numero.nextInt(101);
            listaCuadrado[i] = (listaNumero[i] * listaNumero[i]);
            listaCubo[i] = (listaNumero[i] * listaNumero[i] * listaNumero[i]);

            System.out.println("  ");
            System.out.println("Numero: " + listaNumero[i]);
            System.out.println("Cuadrado: " + listaCuadrado[i]);
            System.out.println("Cubo: " + listaCubo[i]);
            System.out.println("  ");
        }
    }

    static void Exercise3() {
        int[] listaNumero = new int[10];

        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("Enter an integer: ");
            listaNumero[i] = s.nextInt();
        }
        int minimo = listaNumero[0];
        int maximo = listaNumero[0];

        for (int i = 1; i < listaNumero.length; i++) {
            if (listaNumero[i] > maximo) {
                maximo = listaNumero[i];
            }
            if (listaNumero[i] < minimo) {
                minimo = listaNumero[i];
            }
        }
        System.out.println("Min: " + minimo);
        System.out.println("Max: " + maximo);

    }

    static void Exercise4() {
        String listaPalabras[] = new String[15];

        for (int i = 0; i < listaPalabras.length; i++) {
            System.out.println("Write a Word: ");
            listaPalabras[i] = s.next();
        }
        String ultimaPalabra = listaPalabras[listaPalabras.length - 1];

        for (int i = listaPalabras.length - 1; i > 0; i--) {
            listaPalabras[i] = listaPalabras[i - 1];
        }
        listaPalabras[0] = ultimaPalabra;
        for (String listaPalabra : listaPalabras) {
            System.out.println(listaPalabra + " ");
        }
    }

    static void Exercise5() {
        int[] listaNumeros = new int[100];
        Random numero = new Random(20);
        int num1;
        int num2;
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = numero.nextInt(21);
            System.out.print(listaNumeros[i] + " \t");
        }
        System.out.println(" ");
        do {
            System.out.println("Dime un numero del 1-20: ");
            num1 = s.nextInt();
        } while (num1 > 20);

        do {
            System.out.println("Dime un numero del 1-20: ");
            num2 = s.nextInt();
        } while (num2 > 20);

        for (int i = 0; i < listaNumeros.length; i++) {
            if (num1 == listaNumeros[i]) {
                listaNumeros[i] = num2;
                System.out.print(("\"" + listaNumeros[i] + "\"") + "\t");
            } else {
                System.out.print(listaNumeros[i] + "\t");
            }

        }

    }

    static void Exercise6() {
        int[] listaNumero = new int[8];

        for (int i = 0; i < listaNumero.length; i++) {
            System.out.println("Dime un numero: ");
            listaNumero[i] = s.nextInt();
        }
        for (int i = 0; i < listaNumero.length; i++) {
            if (listaNumero[i] % 2 == 0) {
                System.out.println(listaNumero[i] + " Par");
            } else {
                System.out.println(listaNumero[i] + " Impar");
            }
        }
    }

    static void Exercise7() {
        int[] listaNumeros = new int[10];
        int[] listaPrimo = new int[10];
        int[] listaNoPrimo = new int[10];
        int indicePrimo = 0;
        int indiceNoPrimo = 0;
        System.out.println("Dime 10 Numeros");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Numero: ");
            listaNumeros[i] = s.nextInt();
        }
        System.out.println(" ");
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println((i + 1) + " el numero es: " + listaNumeros[i]);
        }

        for (int num : listaNumeros) {
            boolean esPrimo = true;
            if (num <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                listaPrimo[indicePrimo++] = num;
            } else {
                listaNoPrimo[indiceNoPrimo++] = num;
            }

        }
        int indice = 0;
        for (int i = 0; i < indicePrimo; i++) {
            listaNumeros[indice++] = listaPrimo[i];
        }
        for (int i = 0; i < indiceNoPrimo; i++) {
            listaNumeros[indice++] = listaNoPrimo[i];
        }
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Indice: " + listaNumeros[i]);
        }
    }

    static void Exercise8() {
        String[] palabras = new String[8];
        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "purpura"};
        String[] listapalabra = new String[palabras.length];

        int indexColores = 0;
        int indexPalabras = palabras.length - 1;
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Dime una palabra: ");
            palabras[i] = s.next();

            boolean esColor = false;
            for (String color : colores) {
                if (palabras[i].equals(color)) {
                    esColor = true;
                    break;
                }
            }
            if (esColor) {
                listapalabra[indexColores] = palabras[i];
                indexColores++;
            } else {
                listapalabra[indexPalabras] = palabras[i];
                indexPalabras--;
            }
        }
        for (String palabra : listapalabra) {
            System.out.println(palabra);
        }
    }
}

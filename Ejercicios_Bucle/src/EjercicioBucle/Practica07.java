/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucle;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Practica07 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        s.useDelimiter("\n");
        String op = "";
        do {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("Select An Option");
            System.out.println("1.- Exercise 1");
            System.out.println("2.- Exercise 2");
            System.out.println("3.- Exercise 3");
            System.out.println("4.- Exercise 4");
            System.out.println("5.- Exercise 5");
            System.out.println("6.- Exercise 6");
            System.out.println("7.- Exercise 7");
            System.out.println("z");
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
                case "z":
                    System.out.println("Adios gracias");
                    break;
                default:
                    System.out.println("Error");
            }
        } while (!op.equals("z"));
    }

    static void Exercise1() {
        String op = "";
        int i = 0;
        do {
            System.out.println("Enter  a integer Number");
            int number = s.nextInt();
            System.out.println("Select An Option");
            System.out.println("[1] Using For");
            System.out.println("[2] Using While");
            System.out.println("[3] do-While");
            System.out.println("[4] z");
            op = s.next();
            switch (op) {
                case "1":
                    for (i = number; i <= 100; i = (i + number)) {
                        System.out.println(i);
                    }
                    break;
                case "2":
                    i = number;
                    while (i <= 100) {
                        System.out.println(i);
                        i = i + number;
                    }
                    break;
                case "3":
                    i = number;
                    do {
                        System.out.println(i);
                        i = i + number;
                    } while (i <= 100);
                    break;
                case "z":
                    System.out.println("Elige otro Ejercicio");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!op.equals("z"));

    }

    static void Exercise2() {
        String op = "";
        int i = 0;
        do {
            System.out.println("Enter an Integer >10");
            int num = s.nextInt();
            System.out.println("Select an Option");
            System.out.println("[1] Using For");
            System.out.println("[2] Using While");
            System.out.println("[3] Using do While");
            System.out.println("[4] z");
            op = s.next();
            switch (op) {
                case "1":
                    for (i = 10; num >= 0; num = num - i) {
                        System.out.println(num);
                    }
                    break;
                case "2":
                    i = 10;
                    while (num >= 0) {
                        System.out.println(num);
                        num = num - i;
                    }
                    break;
                case "3":
                    i = 10;
                    do {
                        System.out.println(num);
                        num = num - i;
                    } while (num >= 0);
                    break;
                case "z":
                    System.out.println("Elige otro Ejercicio");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!op.equals("z"));
    }

    static void Exercise3() {
        int i = 1;
        int res = 0;
        System.out.println("Ingrese un numero del uno al diez");
        int num = s.nextInt();
        do {
            res = num * i;
            System.out.println(res);
            i = i + 1;
        } while (i <= 10);
    }

    static void Exercise4() {
        System.out.println("Ingrese un numero: ");
        int num = s.nextInt();
        System.out.printf("%-10s %-10s %-10s%n", "Numero", "Cuandrado", "Cubo");
        for (int i = 0; i < 5; i++) {
            int base = num + i;
            int square = base * base;
            int cub = base * base * base;
            System.out.printf("%-10d %-10d %-10d%n", base, square, cub);
        }
    }

    static void Exercise5() {
        System.out.println("Introduce un numero: ");
        String numStr = s.next();
        int num = Integer.parseInt(numStr);
        int numdigit = 0;
        while ((num > 0) || (num < 0)) {
            num = (num / 10);
            numdigit++;

        }
        System.out.println("El numero de digitos son " + numdigit);
    }

    static void Exercise6() {
        int randomnumber = (int) (Math.random() * 11);
        int lifes;
        for (lifes = 1; lifes <= 3; ++lifes) {
            System.out.println("Enter a number random (0-10): ");
            int num = s.nextInt();
            if (randomnumber == num) {
                System.out.println("You won the game!!");
                break;
            } else if ((randomnumber != num) && (lifes < 3)) {
                System.out.println("Try again you can do it!");
            } else if (lifes == 3) {
                System.out.println("You lost the game!!!");
            }
        }
    }
    static void Exercise7 (){
        int result = 1;
        System.out.println("Enter a base number: ");
        int base = s.nextInt();
        System.out.println("Enter a expontent: ");
        int exponent = s.nextInt();
       boolean expneg = false;
         if (exponent == 0){
                result = 1;
                
            }else if (exponent <0){
              expneg = true;
              exponent = exponent * (-1);
            }
         int count = exponent;
        while  (count >0){
            result = base * result;
            count --;
            
        }
        if (expneg) {
            result = 1 /result;
        }
        System.out.println( "El resultado de " + base + "^" + exponent  + "=" + result);
    }
}

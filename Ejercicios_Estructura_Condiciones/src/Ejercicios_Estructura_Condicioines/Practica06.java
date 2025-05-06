/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Estructura_Condicioines;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Practica06 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        s.useDelimiter("\n");
        System.out.println("");
        System.out.println("Menu:");
        System.out.println("1 - Exercise 1");
        System.out.println("2 - Exercise 2");
        System.out.println("3 - Exercise 3");
        System.out.println("4 - Exercise 4");
        System.out.println("5 - Exercise 5");
        System.out.println("6 - Exercise 6");
        System.out.println("Enter option: ");
        String op = s.next();

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
            default:
                throw new AssertionError();
        }
    }

    static void Exercise1() {
        int fg = 0;
        System.out.println("Question 1:  What is the output of 'System.out.println (5+3);'?");
        System.out.println("a) 53");
        System.out.println("b) 8");
        System.out.println("c) 5+3");
        System.out.println("d) Error");
        System.out.println("Answer: ");
        String q1 = s.next();
        if (q1.toUpperCase().equals("B")) {
            fg = fg + 1;
        }
        System.out.println("Question 2: Witch keyword is used to create a class in Java?");
        System.out.println("a) class");
        System.out.println("b) create");
        System.out.println("c) new");
        System.out.println("d) method");
        System.out.println("Answer: ");
        String q2 = s.next();
        if (q2.toUpperCase().equals("A")) {
            fg = fg + 1;
        }
        System.out.println("Question 3: What data type is used to create a variable that should store text?");
        System.out.println("a) myString");
        System.out.println("b) String");
        System.out.println("c) Txt");
        System.out.println("d) Text");
        System.out.println("Answer: ");
        String q3 = s.next();
        if (q3.toUpperCase().equals("B")) {
            fg = fg + 1;
        }
        System.out.println("Question 4: How do you start the main method in Java?");
        System.out.println("a) public void main ()");
        System.out.println("b) public static void main()");
        System.out.println("c) main ()");
        System.out.println("d) static void main()");
        System.out.println("Answer: ");
        String q4 = s.next();
        if (q4.toUpperCase().equals("B")) {
            fg = fg + 1;
        }
        System.out.println("Question 5: What is the correct way to create a variable of type int?");
        System.out.println("a) int num = 5");
        System.out.println("b) integer num = 5");
        System.out.println("c) num int = 5");
        System.out.println("d) num = int 5");
        System.out.println("Answer: ");
        String q5 = s.next();
        if (q5.toUpperCase().equals("A")) {
            fg = fg + 1;
        }
        System.out.println("Final Grade:" + fg + "/5");
    }

    static void Exercise2() {
        System.out.println("");
        System.out.println("Enter a 3-digit number");
        String num = s.next();
        int number = Integer.parseInt(num);
        if ((number >= 100) && (number <= 999)) {
            char dig1 = num.charAt(0);
            char dig3 = num.charAt(2);
            if (dig1 == dig3) {
                System.out.println("This number is capicua");
            } else if (dig1 != dig3) {
                System.out.println("This number is not capicua");
            }
        } else if ((number <= -100) && (number >= -999)) {
            char dig1 = num.charAt(1);
            char dig3 = num.charAt(3);
            if (dig1 == dig3) {
                System.out.println("This number is capicua");
            } else if (dig1 != dig3) {
                System.out.println("This number is not capicua");
            }
        } else {
            System.out.println("This is not a 3-digit number");
        }
    }

    static void Exercise3() {
        System.out.println("Enter a number: ");
        String num = s.next();
        int number = Integer.parseInt(num);
        if (number > 0) {
            num.length();
            if (num.length() == 1) {
                System.out.println("This number has 1 digit");
            } else if (num.length() == 2) {
                System.out.println("This number has 2 digit");
            } else if (num.length() == 3) {
                System.out.println("This number has 3 digit");
            } else if (num.length() == 4) {
                System.out.println("This number has 4 digit");
            } else if (num.length() == 5) {
                System.out.println("This number has 5 digit");
            }
            if (num.length() > 5) {
                System.out.println("This number has more than 5 digit");
            }
        }
        if (number < 0) {
            num.length();
            if (num.length() == 2) {
                System.out.println("This number has 1 digit");
            } else if (num.length() == 3) {
                System.out.println("This number has 2 digit");
            } else if (num.length() == 4) {
                System.out.println("This number has 3 digit");
            } else if (num.length() == 5) {
                System.out.println("This number has 4 digit");
            } else if (num.length() == 6) {
                System.out.println("This number has 5 digit");
            }
            if (num.length() > 6) {
                System.out.println("This number has more than 5 digit");
            }
        }

    }

    static void Exercise4() {
        final int Min_Semana = 6660;
        final int Min_Viernes = 900;
        final int Min_diarios = 1440;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a day of the Week");
        String day = s.next();

        System.out.println("Enter Time (HH MM):");

        int hora = s.nextInt();
        int min = s.nextInt();

        int Min_Totales = (hora * 60) + min;
        int Min_restantes = 0;
        switch (day) {
            case "Monday":
                Min_restantes = Min_Semana - Min_Totales;
                System.out.println("Minutes until weekend: " + Min_restantes);
                break;
            case "Tuesday":
                Min_restantes = Min_Semana - Min_diarios - Min_Totales;
                System.out.println("Minutes until weekend: " + Min_restantes);
                break;
            case "Wednesday":
                Min_restantes = Min_Semana - Min_Totales - 2 * Min_diarios;
                System.out.println("Minutes until weekend: " + Min_restantes);
                break;
            case "Thursday":
                Min_restantes = Min_Semana - Min_Totales - 3 * Min_diarios;
                System.out.println("Minutes until weekend: " + Min_restantes);
                break;
            case "Friday":
                Min_restantes = Min_Semana - Min_Totales - 4 * Min_diarios;
                System.out.println("Minutes until weekend: " + Min_restantes);
                break;
            default:
                System.out.println("Error");
        }
    }

    static void Exercise5() {
        final double GENERAL = 0.21;
        final double REDUCED = 0.10;
        final double SUPER_REDUCED = 0.04;
        final double NOPROBLEM = 1.0;
        final double HALF = 2.0;
        final double FIXDISCOUNT = 5.0;
        System.out.println("Enter the taxables base:");
        double taxable = s.nextDouble();
        System.out.println("Enter the TAX type (general,reduced, super-reduced): ");
        String Tax = s.next();
        System.out.println("Enter the promo code (noPromo, half, fixDiscound,percentage");
        String Promo = s.next();
        double taxrate = 0;
        if (Tax.equals("general")) {
            taxrate = GENERAL;
        } else if (Tax.equals("reduced")) {
            taxrate = REDUCED;
        } else if (Tax.equals("super_reduced")) {
            taxrate = SUPER_REDUCED;
        } else {
            System.out.println("Invalid Tax");
        }
        double Precio = (taxable * (1 + taxrate));
        double descuentos = 0;
        if (Promo.equals("noPromo")) {
            descuentos = 0;
        } else if (Promo.equals("half")) {
            descuentos = Precio / HALF;
        } else if (Promo.equals("fixDiscount")) {
            descuentos = FIXDISCOUNT;
        } else if (Promo.equals("percentage")) {
            descuentos = Precio * 0.05;
        } else {
            System.out.println("Invalid Promo");
        }

        double total = Precio - descuentos;
        System.out.printf("%-20s %10.2f%n", "Taxable base:", taxable);
        System.out.printf("%-20s %10.2f%n", "TAX" + "(" + (taxrate * 100) + "%)", Precio - taxable);
        System.out.printf("%-20s %10.2f%n", "Price with taxes:", Precio);
        System.out.printf("%-20s %10s%n", "Promo code:", Promo);
        System.out.printf("%-20s %10.2f%n", "Discount:", -descuentos);
        System.out.printf("%-20s %10.2f%n", "Total:", total);
    }

    static void Exercise6() {
        System.out.println("Turno del Jugador 1 (Introduzca piedra, papel o Tijera): ");
        String opcionJugador1 = s.next();
        opcionJugador1.toLowerCase();
        boolean Jugada1OK = false;
        boolean Jugada2OK = false;
        int numJugador;
        switch (opcionJugador1) {
            case "papel":
                Jugada1OK = true;
                break;
            case "piedra":
                Jugada1OK = true;
                break;
            case "tijera":
                Jugada1OK = true;
                break;
            default:
                Jugada1OK = false;
                System.out.println("Jugada No Valida");
        }
        System.out.println("Turno del Jugador 2 (Introduzca piedra, papel o Tijera): ");
        String opcionJugador2 = s.next();
        opcionJugador2.toLowerCase();
        switch (opcionJugador2) {
            case "papel":
                Jugada2OK = true;
                break;
            case "piedra":
                Jugada2OK = true;
                break;
            case "tijera":
                Jugada2OK = true;
                break;
            default:
                Jugada1OK = false;
                System.out.println("Jugada No Valida");
        }
        if ((Jugada1OK)||(Jugada2OK)) {
            if (opcionJugador1.equals(opcionJugador2)) {
                System.out.println("Empate");
            } else {
                numJugador =1;
                switch (opcionJugador1) {
                    case "papel":
                        if (opcionJugador2.equals("tijera")){
                            numJugador = 2;
                        }
                        break;
                    case "piedra":
                        if (opcionJugador2.equals("papel")){
                            numJugador = 2;

                        }
                        break;
                    case "tijera":
                        if (opcionJugador2.equals("piedra")){
                            numJugador = 2;
                        }
                        break;
                    default:

                }
                System.out.println("Ha ganado el Jugador: " + numJugador);
            }
        }else {
            System.out.println("Hay Jugadas Invalidas");
        }
    }
}

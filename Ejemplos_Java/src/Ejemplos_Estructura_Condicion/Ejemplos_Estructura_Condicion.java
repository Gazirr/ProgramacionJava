/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Estructura_Condicion;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Ejemplos_Estructura_Condicion {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");
        boolean PuedeTrabajar = false;
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        PuedeTrabajar = (edad >= 18) && (edad <= 65);
        if (PuedeTrabajar) {
            System.out.println("Puedes trabajar");
        } else {
            System.out.println("No puedes trabajar");
        }
    }
}

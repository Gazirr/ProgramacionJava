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
public class Ejemplo_Estructura_Condicion1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");
        String respuestaCorrecta = "PARIS";
        System.out.println("Cual es la capital de francia (Escribe en mayusculas): ");
        String respuesta = sc.next();
        if (respuestaCorrecta.equals(respuesta)) {
            System.out.println("Respuesta Correcta");
        }
            else {
            System.out.println("Respuesta incorrecta");
            }
        
    }
}

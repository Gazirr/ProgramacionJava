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
public class Ejemplo_Estructura_Condicion3 {
    static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        double x = 0, y = 0;
        System.out.println("Calculadora");
        
        System.out.print("Introduce la operacion a realizar(\"+\",\"-\",\"*\",\"/\") : ");
        char op = (scan.next()).charAt(0);
        
        System.out.print("Valor de x: ");
        x = scan.nextDouble();
        
        System.out.print("Valor de y: ");
        y = scan.nextDouble();
        
        switch (op) {
            case '+':
                System.out.println("La suma es: " + x + "+" + y + "= " + (x+y));
                break;
            case '-':
                System.out.println("La resta es:" + x + "-" + y + "= " + (x-y));
                break;
            case '*':
                System.out.println("La multiplicacion es:" + x + "*" + y + "= " + (x*y));
                break;
            case '/':
                System.out.println("La division es: " + x + "/" + y + "= " + (x/y));
                break;
            default:
                System.out.println("La operacion no es validad");
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Variables;

/**
 *
 * @author gabrielheralv
 */
public class Ejercicio1_Variable {
    public static void main(String[] args) {
        int x;
        x = 145;
        int y; 
        y = 999;
        int suma;
        int sub;
        double div;
        int mult;
        suma =  x + y;
        sub =  y -  x;
        mult =  x *  y;
        div =(double) x/ y;
        System.out.println("Este es la suma de x+y = " + suma );
        System.out.println("Este es la resta de y-x = " + sub );
        System.out.println("Este es la multiplicacion de x*y = " + mult );
        System.out.println("Este es la division de y/x = " + div );
    }
}

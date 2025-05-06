/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;
import java.util.Scanner;
/**
 *
 * @author gabrielheralv
 */
public class Ejercicio8_Scanner {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        System.out.println("Cual es tu Nombre: ");
        String nombre = sc.next();
        System.out.println("Cuantas Horas trabajaste esta semana?");
        int horas = sc.nextInt();
        int sueldo = 12;
        int paga = (horas*sueldo);
        System.out.println("Tu Nombre es: " + nombre);
        System.out.println("Tu paga es: " + paga);
    }
}

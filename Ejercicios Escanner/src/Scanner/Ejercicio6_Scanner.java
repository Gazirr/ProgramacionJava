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
public class Ejercicio6_Scanner {
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
        System.out.println("Dime una letra: ");
        char letra = (keyboard.next()).charAt(0);
        System.out.println("Escribe una palabra:");
        String palabra = keyboard.next();
        System.out.println("Tu frase es: " + letra + palabra);
    }
}

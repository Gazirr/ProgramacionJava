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
public class Ejercicio7_Scanner {
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
        System.out.println("Escribe una letra:");
        char letra1 = (keyboard.next().charAt(0));
        System.out.println("Escribe la segunda letra: ");
        char letra2 =(keyboard.next().charAt(0));
        System.out.println("Escribe la tercera letra: ");
        char letra3 = (keyboard.next().charAt(0));
        System.out.println("Escribe la cuarta letra: ");
        char letra4 = (keyboard.next().charAt(0));
        System.out.println("Escribe la quinta letra: ");
        char letra5 = (keyboard.next().charAt(0));
        String palabra = ("" + letra1+letra2+letra3+letra4+letra5);
        System.out.println("Tu palabra es: " + palabra);
    }
}

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
public class Ejercicio2_Scanner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Hola," + nombre);
    }
}

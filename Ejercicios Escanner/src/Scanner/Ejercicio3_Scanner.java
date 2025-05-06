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
public class Ejercicio3_Scanner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        System.out.println("Name: ");
        String name = sc.next();
        System.out.println("Address: ");
        String address = sc.next();
        System.out.println("Phone number: ");
        int Phone_number = sc.nextInt();
        System.out.println("Hola como estas, " + name);
        System.out.println("Tu direccion es: " + address);
        System.out.println("Tu numero de telefono es: " + Phone_number);
    }
}

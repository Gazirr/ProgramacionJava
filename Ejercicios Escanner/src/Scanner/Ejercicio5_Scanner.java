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
public class Ejercicio5_Scanner {
    static Scanner sc = new Scanner (System.in);
    static final  double IVA = 0.21;
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        System.out.println("Cual es el precio del producto");
        double precio = sc.nextFloat();
        double calc = (precio/(1+ IVA));
        System.out.println("El calculo del precio es: " + calc);
    }
}

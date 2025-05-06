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
public class Ejercicio1_Scanner {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        int suma;
        int rest;
        int mult;
        int div;
        System.out.println("x = ");
        int x = sc.nextInt();
        System.out.println("y = ");
        int y = sc.nextInt();
        suma =  x +  y;
        rest = x - y;
        mult = x * y;
        div = x / y;
        System.out.println("El resultado de la suma es: " + suma );
        System.out.println("El resultado de la resta es: " + rest );
        System.out.println("El resultado de la multiplicacion es: " + mult );
        System.out.println("El resultado de la division es: " + div );
    }
}

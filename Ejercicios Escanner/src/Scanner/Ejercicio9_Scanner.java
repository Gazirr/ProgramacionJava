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
public class Ejercicio9_Scanner {
    static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        double pi = 3.14;
        System.out.println("Cual es el radio?");
        double radio =sc.nextDouble();
        System.out.println("Cual es la altura?");
        double altura = sc.nextDouble();
        double Volumen = (((radio*radio)*altura * pi)/3);
        System.out.println("El Volumen es:"+ Volumen);
    }
}

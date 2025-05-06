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
public class Ejercicio4_Scanner {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        float libras;
        sc.useDelimiter("\n");
        System.out.println("Cuantos euros quieres pasar a libras: ");
        float euros = sc.nextFloat();
        libras = (euros *(0.83f));
        System.out.println("las libras son:" +libras);
    }
}

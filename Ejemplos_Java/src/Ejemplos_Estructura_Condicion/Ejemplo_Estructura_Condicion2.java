/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Estructura_Condicion;
import  java.util.Scanner;
/**
 *
 * @author gabrielheralv
 */
public class Ejemplo_Estructura_Condicion2 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        sc.useDelimiter("\n");
        System.out.println("Que nota has sacado? ");
        int nota = sc.nextInt();
        if((nota>= 9)&& (nota<10)){
            System.out.println("Excelente");
        }else if ((nota>= 7.5)&&(nota<9)){
            System.out.println("Notable");
        }else if((nota>=5)&&(nota>7.5)){
            System.out.println("Aprobado");
        } else{
            System.out.println("Suspendido");
        }
    }
}

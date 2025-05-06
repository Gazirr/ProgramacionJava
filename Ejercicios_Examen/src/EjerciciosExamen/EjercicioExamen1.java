/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosExamen;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class EjercicioExamen1 {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String op = "";
    do{
        System.out.println("1- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("z.- Salir");
        System.out.print("Elige una Opcion de Ejercicio: ");
        op = s.next();
        switch (op) {
            case "1":
                Ejercicio1();
                break;
            default:
                System.out.println("Error");
        }
    }while(op.equals("z"));
    }
    
    static void Ejercicio1(){
        System.out.println("Introduce la temperatura: ");
        int temp = s.nextInt();
        System.out.println("Esta Lloviendo (Si/No): ");
        String clima = s.next();
        
        if ((temp >25)&&(clima.equals("No"))){
            System.out.println("Ir a la Playa");
        }else if (temp >= 20 && temp <=25 && clima.equals("No")){
            System.out.println("");
        }
    }
}

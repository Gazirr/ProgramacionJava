/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosArrays;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class EjemplosArray1 {

    static Scanner s = new Scanner(System.in);
    static final int MAX = 5;

    public static void main(String[] args) {
        double temp = 0;
        double[] listaTemp = new double[MAX];
        for (int i = 0; i < listaTemp.length; i++) {
            System.out.println("Introduce la temperatura del dia " + (i+1));
            temp = s.nextDouble();
            listaTemp[i] = temp;
        }     
        int numDia = 1;
        for (double temperatura : listaTemp) {
            System.out.println("La temperatura del dia " +(numDia++) + " es " + temperatura);
        }
    }
}

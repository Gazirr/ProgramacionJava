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
public class EjemplosArray2 {
    static Scanner s = new Scanner (System.in);
    static final int MAX = 5;
    public static void main(String[] args) {
        double  notas = 0;
        double listaNotas[] = new double [MAX];
        for (int i = 0; i < listaNotas.length; i++ ){
            System.out.println("La nota " + (i+1) + " q has sacado es : " );
            notas = s.nextDouble();
            listaNotas[i]= notas;
        }
        double suma = 0;
        double media = 0;
        int numNotas = 1;
        for (double nota : listaNotas) {
            System.out.println("La nota "+(numNotas++)+ " es: " + nota);
            suma = suma + nota;
        }
        media = (suma/listaNotas.length);
        System.out.println("La media de todas las notas es: " + media);
    }
}

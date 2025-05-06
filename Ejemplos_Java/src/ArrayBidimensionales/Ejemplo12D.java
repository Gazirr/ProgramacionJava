/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayBidimensionales;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Ejemplo12D {

    static Scanner s = new Scanner(System.in);
    static final int MAX_PAISES = 7;
    static final int MAX_MEDALLAS = 3;

    public static void main(String[] args) {
        s.useDelimiter("\n");
//       int [] miArray1D = new int [3];
//       int [] miArray1D = {1,2,3};
//       int [][] miArray2D = new int [3][4];
//       int [][] miArray2D = {{1,2,3,4},{5,6,7,8},{9,10,11,12} };
        String[] paises = {"ANDORRA", "SPAIN", "PERU", "MEXICO", "ECUADOR", "USA", "UK"};
        String[] medallas ={"ORO","PLATA","BRONCE", "TOTAL"};
//      int [][] contadorMedallas = new int [MAX_PAISES][MAX_MEDALLAS];
        int[][] contadorMedallas = {{0, 2, 3}, {15, 16, 0}, {10, 0, 0}, {3, 5, 8}, {8, 23, 0}, {0, 1, 0}, {3, 3, 3}};
      
      System.out.printf("%-10s","MEDALLAS:");
        for (String medalla : medallas) {
            System.out.printf("%8s",medalla); 
            
        }
        
        System.out.println("");
        for (int i = 0; i< MAX_PAISES; i++){
            System.out.printf("%-10s:",paises[i]);
            int total = 0;
            for (int j = 0 ; j < MAX_MEDALLAS; j++){
                System.out.printf("%8d", contadorMedallas[i][j]);
               total = total + contadorMedallas[i][j];
            }
            System.out.printf("%8d", total);
            System.out.println("");
        }
    }
}

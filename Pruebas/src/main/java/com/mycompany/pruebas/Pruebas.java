/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebas;

/**
 *
 * @author gabrielheralv
 */
public class Pruebas {

    public static void main(String[] args) {

        int[][] matriz = {

            {3, 7, 2},

            {9, 12, 5},

            {6, 14, 8}

        };

        int var = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 1; j < matriz[i].length; j++) {

                if (matriz[i][j] > var) {

                    var = matriz[i][j];

                }

            }

        }

        System.out.println("El valor es: " + var);

    }

}
}

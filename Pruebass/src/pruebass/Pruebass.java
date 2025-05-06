/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebass;

/**
 *
 * @author gabrielheralv
 */
public class Pruebass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] matriz = {

            {3, 7, 2},

            {9, 12, 5},

            {6, 14, 8}

        };

        int var = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 1; j < matriz[i].length; j++) {

                if (matriz[i][i] > var) {
                    var = matriz[i][i];
                }
            }
        }
        System.out.println("El valor es: " + var);

    }

}
    
    


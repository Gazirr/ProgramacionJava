/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class EjerciciosArray3 {

    static Scanner s = new Scanner(System.in);
    static Random rand = new Random();
    static final int MAX_COLUMNAS = 5;
    static final int MAX_FILAS = 5;

    public static void main(String[] args) {
        String[][] tableroPersona = new String[5][5];
        String[][] tableroEnemigo = new String[5][5];
        String[][] tableroShooter = new String[5][5]; // Este es el Tablero de disparos
        
        //Inicializacion de los Tableros
        boolean turno = true;
        inicializarTablero(tableroPersona);
        inicializarTablero(tableroEnemigo);
        inicializarTablero(tableroShooter);
        
        System.out.println("Bienvenido a Undir la flota Camarada");
        System.out.println("Cual es tu nombre Camarada? : ");
        String  nombre = s.next();
        System.out.println("Hola Grumete " + nombre);
          System.out.println("Este es tu Tablero:");
            imprimirTablero(tableroPersona);
            
        System.out.println("Elige donde vas tu barco (1A,2A:");
        String barco = s.nextLine().toUpperCase().replaceAll(" ","");
        String[] barco1 = barco.split(",");
        
        for (String coordenada : barco1) {
            int fil = coordenada.charAt(0)- '1';            
            int col = coordenada.charAt(1)- 'A';
            tableroPersona[fil][col] = "*";
        }
        System.out.println("Este es tu barco actualizado:");
        imprimirTablero(tableroPersona);
        System.out.println("This is your enemy board (you can only see your attemps): ");
        imprimirTablero(tableroShooter);
    }
    static void inicializarTablero(String[][] tablero){
        for (int i= 0 ; i < tablero.length; i++){
            for (int j= 0; j < tablero[i].length; j++){
                tablero[i][j]= "~";
            }
        } 
        
    }
      
   
        static void imprimirTablero(String[][] tablero) {
            System.out.print("  ");
            for (char tab = 'A' ; tab < 'F'; tab++){
                System.out.print(tab + " ");
               
            }
            System.out.println();
            for (int i = 0; i < tablero.length; i++){
                System.out.print((i + 1) + " ");
                for(int j = 0; j < tablero [i].length;j++){
                    System.out.print(tablero[i][j]+ " ");
                }
                System.out.println();
            }
            
        }
        static void colocarBarcoEnemigo(String[][] tableroEnemigo){
                boolean colocado = false;
                
                while (!colocado){
                    int filInicio = rand.nextInt(5);
                    int colInicio = rand.nextInt(5);
                    boolean Horizontal = rand.nextBoolean();
                    
                    int fil2 = filInicio;
                    int col2 = colInicio;
                    
                    if (Horizontal){
                        col2 = colInicio + 1;
                        if (col2 >=5) col2 = colInicio - 1;
                    } else{
                        fil2 = filInicio + 1;
                        if (fil2 >=5) fil2 = colInicio - 1;
                    }
                    if (tableroEnemigo[filInicio][colInicio].equals("-")&& tableroEnemigo[fil2][col2].equals("-")){
                        tableroEnemigo[filInicio][colInicio]= "*";
                        tableroEnemigo[fil2][col2] = "*";
                        colocado = true;
                    }
                }
            }
        static void DisparoPersona(String[][]tableroShooter, String[][] tableroEnemigo){
            System.out.println("Entra el disparo (Ejemplo: A1): ");
            String disparo = s.nextLine().toUpperCase().replaceAll(" "," ");
            
            if (disparo.length()== 2){
                int filaDisparo = disparo.charAt(1)-'1';
                char colDisparoChar = disparo.charAt(0);
                int colDisparo = colDisparoChar - 'A';
                
                if (colDisparo >= 0 && colDisparo < 5 && filaDisparo >= 0 && filaDisparo <5){
                    
                    if (tableroEnemigo[filaDisparo][colDisparo].equals("*")){
                        System.out.println("Le diste al Barco Enemigo");
                        tableroShooter[filaDisparo][colDisparo] = "X";
                        tableroEnemigo[filaDisparo][colDisparo] = "-";
                    }else {
                        System.out.println("Fallaste. Prueba otra vez");
                        tableroShooter[filaDisparo][colDisparo]= "O";
                    }
                }else{
                        System.out.println("Las Cordenadas estan fuera del rango (A1-E5).");
                    }
            } else{
                    System.out.println("Formato Invalido");
                }
                System.out.println("tu tablero de disparos");
                imprimirTablero(tableroShooter);
        }
        static void disparoMaquina (String[][] tableroPersona){
            System.out.println("El enemigo esta pensando....");
            boolean disparoRealizar = false;
         
            while(!disparoRealizar){
                int filDisp = rand.nextInt(5);
                int colDisp = rand.nextInt(5);
                
                
                if (!tableroPersona[filDisp][colDisp].equals("O")&& !tableroPersona[filDisp][colDisp].equals("X")){
                    if (tableroPersona[filDisp][colDisp].equals("*")){
                        System.out.println("El enemigo disparo a tu barco " + (char)(colDisp + 'A') + (filDisp + 1)+ "!");
                        tableroPersona[filDisp][colDisp]= "-";
                    }else {
                        System.out.println("El disparo de tu enemigo fallo"+ (char)(colDisp + 'A')+(filDisp + 1)+ ".");
                        tableroPersona[filDisp][colDisp] = "O";
                    }
                    disparoRealizar = true;
                }
            } 
            System.out.println("tu barco despues del ataque de la maquina: ");
            imprimirTablero(tableroPersona);
        }
//        static void barcosHundidos (String [][] tableroEnemigo, String[][] tableroPersona){
//            boolean retorno = false;
//            for (int i = 0; i  < tableroEnemigo.length; i ++){
//                for (int j = 0; i < tableroEnemigo.length; j++){
//                    if (tableroEnemigo [i][j].equals("*")){
//                        retorno = false;
//                    }
//                }    
//            }
//            retorno = true;
//            if(barcosHundidos(tableroEnemigo)){
//                System.out.println("Felicidadess has ganado y derribaste el barco enemigo");
//                break;
//            }else if (barcosHundidos(tableroPersona)){
//                System.out.println("Lo siento gano tu enemigo te derroto tu barco");
//                break;
}
        
           
            
        
        
//        s.useDelimiter("\n");
//        String[] columnas = {"1", "2", "3", "4", "5"};
//        String[] fila = {"A", "B", "C", "D", "E"};
//        String[][] flotas = new String[MAX_COLUMNAS][MAX_FILAS];
//        String[][] barcos = new String[MAX_FILAS][MAX_COLUMNAS];
//
//        inicializarTablero(flotas, "-");
//        inicializarTablero(barcos, "-");
//
//        colocarBarcoAleatorio(barcos);
//        while (true) {
//            mostrarTablero(columnas, fila, flotas);
//            System.out.println("Introduce tu disparo (Ejemplo: 4B): ");
//            String disparo = s.next().toUpperCase();
//            if (!procesarDisparo(disparo, flotas, barcos, fila, columnas)) {
//                System.out.println("Entrada inválida. Inténtalo de nuevo.");
//            }
//        }
//    }
//
//    static void inicializarTablero(String[][] tablero, String simbolo) {
//        for (int i = 0; i < MAX_FILAS; i++) {
//            for (int j = 0; j < MAX_COLUMNAS; j++) {
//                tablero[i][j] = simbolo;
//            }
//        }
//    }
//
//    static void colocarBarcoAleatorio(String[][] barcos) {
//        Random random = new Random();
//        int fila, columna;
//        boolean colocado = false;
//
//        while (!colocado) {
//            fila = random.nextInt(MAX_FILAS - 1);
//            columna = random.nextInt(MAX_COLUMNAS - 1);
//
//            if (barcos[fila][columna].equals("-")
//                    && barcos[fila][columna + 1].equals("-")
//                    && barcos[fila + 1][columna].equals("-")
//                    && barcos[fila + 1][columna + 1].equals("-")) {
//
//                barcos[fila][columna] = "B";
//                barcos[fila][columna + 1] = "B";
//                barcos[fila + 1][columna] = "B";
//                barcos[fila + 1][columna + 1] = "B";
//                colocado = true;
//            }
//        }
//    }
//
//    static void mostrarTablero(String[] columnas, String[] fila, String[][] tablero) {
//        System.out.print("   "); // Espacio inicial para alinear con las filas
//        for (String col : columnas) {
//            System.out.printf("%3s", col);
//        }
//        System.out.println();
//
//        for (int i = 0; i < MAX_FILAS; i++) {
//            System.out.print(fila[i] + "  "); // Etiqueta de fila
//            for (int j = 0; j < MAX_COLUMNAS; j++) {
//                System.out.printf("%3s", tablero[i][j]);
//            }
//            System.out.println();
//        }
//    }
//      static boolean procesarDisparo(String disparo, String[][] flotas, String[][] barcos, String[] fila, String[] columnas) {
//        if (disparo.length() != 2) return false;
//
//        char letraFila = disparo.charAt(1);
//        char numColumna = disparo.charAt(0);
//
//        // Validar fila y columna
//        int filaIndex = -1, colIndex = -1;
//        for (int i = 0; i < fila.length; i++) {
//            if (fila[i].charAt(0) == letraFila) filaIndex = i;
//        }
//        for (int i = 0; i < columnas.length; i++) {
//            if (columnas[i].charAt(0) == numColumna) colIndex = i;
//        }
//
//        if (filaIndex == -1 || colIndex == -1) return false;
//
//        // Verificar impacto o fallo
//        if (barcos[filaIndex][colIndex].equals("B")) {
//            System.out.println("¡Impacto!");
//            flotas[filaIndex][colIndex] = "*";
//            barcos[filaIndex][colIndex] = "-"; 
//        } else if (flotas[filaIndex][colIndex].equals("-")) {
//            System.out.println("¡Fallaste!");
//            flotas[filaIndex][colIndex] = "x";
//        } else {
//            System.out.println("Ya disparaste aquí.");
//        }
//
//        return true;
//    }


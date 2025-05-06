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
public class EjerciciosArray2 {

    static Scanner s = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        String[][] tableroPersona = new String[5][5];
        String[][] tableroEnemigo = new String[5][5];
        String[][] tableroShooter = new String[5][5]; // Este es el Tablero de disparos

        //Inicializacion de los Tableros
        boolean turnoJugador = true;
        inicializarTablero(tableroPersona);
        inicializarTablero(tableroEnemigo);
        inicializarTablero(tableroShooter);

        System.out.println("Bienvenido a Undir la flota Camarada");
        System.out.println("Cual es tu nombre Camarada? : ");
        String nombre = s.next();
        System.out.println("Hola Grumete " + nombre);

        System.out.println("Este es tu Tablero:");
        imprimirTablero(tableroPersona);

        System.out.println("Elige donde vas tu barco (A1,B1):");
        String barco = s.next().toUpperCase().replaceAll(" ", " ");
        String[] barco1 = barco.split(",");

        for (String coordenada : barco1) {
            int fil = coordenada.charAt(1) - '1';
            int col = coordenada.charAt(0) - 'A';
            tableroPersona[fil][col] = "*";
        }
        System.out.println("Este es tu barco actualizado:");
        imprimirTablero(tableroPersona);

        colocarBarcoEnemigo(tableroEnemigo);
        
        System.out.println("This is your enemy board (you can only see your attemps): ");
        imprimirTablero(tableroShooter);
        
        while (true) {
            turnoJugador = manejoTurno(turnoJugador, tableroPersona, tableroEnemigo, tableroShooter);
            if (barcosHundidos(tableroEnemigo)) {
                System.out.println("Felicidadess has ganado y derribaste el barco enemigo");
                break;
            } else if (barcosHundidos(tableroPersona)) {
                System.out.println("Lo siento gano tu enemigo te derroto tu barco");
                break;
            }
        }
    }
    

    static void inicializarTablero(String[][] tablero) {
        for(int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = "~";
            }
        }

    }

    static void imprimirTablero(String[][] tablero) {
        System.out.print(" ");

        for (char tab = 'A'; tab < 'F'; tab++) {
            System.out.print(" ");
            System.out.printf("%3s","  "+ tab + " ");
        }
        System.out.println();
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.printf("%5s",tablero[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void colocarBarcoEnemigo(String[][] tableroEnemigo) {
        boolean colocado = false;

        while (!colocado) {
            int filInicio = rand.nextInt(5);
            int colInicio = rand.nextInt(5);
            boolean Horizontal = rand.nextBoolean();

            int fil2 = filInicio;
            int col2 = colInicio;

            if (Horizontal) {
                col2 = colInicio + 1;
                if (col2 >= 5) {
                    col2 = colInicio - 1;
                }
            } else {
                fil2 = filInicio + 1;
                if (fil2 >= 5) {
                    fil2 = filInicio - 1;
                }
            }
            if (tableroEnemigo[filInicio][colInicio].equals("~") && tableroEnemigo[fil2][col2].equals("~")) {
                tableroEnemigo[filInicio][colInicio] = "*";
                tableroEnemigo[fil2][col2] = "*";
                colocado = true;
            }
        }
    }

    static void disparoPersona(String[][] tableroEnemigo, String[][] tableroShooter) {
        System.out.println("Entra el disparo (Ejemplo: A1): ");
        String disparo = s.next().toUpperCase().replaceAll(" ", " ");

        if (disparo.length() == 2) {
            int filaDisparo = disparo.charAt(1) - '1';
            char colDisparoChar = disparo.charAt(0);
            int colDisparo = colDisparoChar - 'A';

//            System.out.println(colDisparo + " " + filaDisparo);
            if (colDisparo >= 0 && colDisparo < 5 && filaDisparo >= 0 && filaDisparo < 5) {

                if (tableroEnemigo[filaDisparo][colDisparo].equals("*")) {
                    System.out.println("Le diste al Barco Enemigo");
                    tableroShooter[filaDisparo][colDisparo] = "X";
                    tableroEnemigo[filaDisparo][colDisparo] = "~";
                } else {
                    System.out.println("Fallaste. Prueba otra vez");
                    tableroShooter[filaDisparo][colDisparo] = "O";
                }
            } else {
                System.out.println("Las Cordenadas estan fuera del rango (A1-E5).");
            }
        } else {
            System.out.println("Formato Invalido");
        }
        System.out.println("tu tablero de disparos");
        imprimirTablero(tableroShooter);
    }

    static void disparoMaquina(String[][] tableroPersona) {
        System.out.println("El enemigo esta pensando....");
        boolean disparoRealizar = false;

        while (!disparoRealizar) {
            int filDisp = rand.nextInt(5);
            int colDisp = rand.nextInt(5);

            if (!tableroPersona[filDisp][colDisp].equals("O") && !tableroPersona[filDisp][colDisp].equals("X")) {
                if (tableroPersona[filDisp][colDisp].equals("*")) {
                    System.out.println("El enemigo disparo a tu barco " + (char) (colDisp + 'A') + (filDisp + 1) + "!");
                    tableroPersona[filDisp][colDisp] = "~";
                } else {
                    System.out.println("El disparo de tu enemigo fallo" + (char) (colDisp + 'A') + (filDisp + 1) + ".");
                    tableroPersona[filDisp][colDisp] = "O";
                }
                disparoRealizar = true;
            }
        }
        System.out.println("tu barco despues del ataque de la maquina: ");
        imprimirTablero(tableroPersona);
    }

    static boolean barcosHundidos(String[][] tableroEnemigo) {
        for (int i = 0; i < tableroEnemigo.length; i++) {
            for (int j = 0; j < tableroEnemigo[i].length; j++) {
                if (tableroEnemigo[i][j].equals("*")) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean manejoTurno(boolean turnoJugador, String[][] tableroPersona, String[][] tableroEnemigo, String[][] tableroShooter) {
        if (turnoJugador) {
            System.out.println("Es tu turno");
            disparoPersona(tableroEnemigo, tableroShooter);
        } else {
            System.out.println("Es el turno del Enemigo");
            disparoMaquina(tableroPersona);
        }
        return !turnoJugador;
    }
}



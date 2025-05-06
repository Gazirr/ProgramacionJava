/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class LecturaConScanner {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String fileName = "C:\\Users\\gabrielheralv\\Desktop\\Prueba.txt";

        String opcion = "";
        do {
            try {
                System.out.println("MENU");
                System.out.println("1.- Leer fichero");
                System.out.println("z.- Saliendo");

                System.out.println("Opcion:");
                opcion = keyboard.next();
                switch (opcion) {
                    case "1":
                        String contentFile;
                        contentFile = leerFichero(fileName);
                        System.out.println(contentFile);
                        break;
                    case "z":
                        System.out.println("Saliendo");
                    default:
                        System.out.println("Opcion");
                }
            }catch (FileNotFoundException ex){
                System.out.println("Error" + ex.getMessage());
            }
        } while (!opcion.equals("z"));

    }

    private static String leerFichero(String fileName) throws FileNotFoundException {
        String contenido = "";
        File fichero = new File(fileName);
        Scanner scan = new Scanner(fichero);

        scan.useDelimiter("\n");
        String linea;
        while (scan.hasNext()) {
            linea = scan.next();
            contenido += linea + "\n";
//            System.out.println(palabra); 
        }
        scan.close();
        return contenido;
    }

}

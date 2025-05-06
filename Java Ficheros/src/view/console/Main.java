/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.io.File;
import model.Funciones;
import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Main {

    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scan.useDelimiter("\n");
        String Option = "";

        do {
            System.out.println("--Menu:--");
            System.out.println("----1.- Create Folder----");
            System.out.println("----2.- Create File----");
            System.out.println("----3.- ShowListFiles----");
            System.out.println("----4.- ShowFile----");
            System.out.println("----5.- ModifyFile----");
            System.out.println("----6.- DeleteFile----");
            System.out.println("----7.- CountChars----");
            System.out.println("----8.- CountWords----");
            System.out.println("----9.- SwapWords----");
            System.out.println("----Z.- Salir");
            System.out.println("Write a number: ");
            Option = Scan.next();
            switch (Option) {
                case "1":
                    createFolder();
                    break;
                case "2":
                    createFile();
                    break;
                case "3":
                    showListFile();
                    break;
                case "4":
                    showFile();
                    break;
                case "5":
                    overWriteFile();
                    break;
                case "6":
                    deleteFile();
                    break;
                case "7":
                    countChars();
                    break;
                case "8":
                    countWords();
                    break;
                case "9":
                    swapWords();
                    break;
                case "z":
                    System.out.println("Saliendo...");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!Option.equals("z"));
    }

    static void createFolder() {
        try {
            System.out.println("Name of the folder: ");
            String nameFolder = Scan.next();
            String path = System.getProperty("user.dir") + File.separator + nameFolder;
            Funciones.createFolder(path);
            System.out.println("Se creo la Carpeta eficientemente");
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    static void createFile() {
        try {
            System.out.println("Nombre de la carpeta donde quieras crear el fichero: ");
            String folder = Scan.next();
            String path = System.getProperty("user.dir") + File.separator + folder;
            System.out.println("Nombre del Fichero: ");
            String nameFile = Scan.next();
            if (!nameFile.endsWith(".txt")) {
                nameFile += ".txt";
            }
            System.out.println("Que contenido quieres ponerle al fichero: ");
            String content = Scan.next();

            Funciones.createFile(path, nameFile, content);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void showListFile() {
        System.out.println("Enter the name of the folder: ");
        String folder = Scan.next();
        String path = System.getProperty("user.dir") + File.separator + folder;

        String[] listFile = Funciones.showListFile(path);
        if (listFile != null && listFile.length > 0) {
            for (String nameFile : listFile) {
                System.out.println("- " + nameFile);
            }
        } else {
            System.out.println("La carpeta esta vacia o no existe ");
        }

    }

    static void showFile() {
        try {
            System.out.println("Nombre de la Carpeta: ");
            String folder = Scan.next();
            System.out.println("Nombre del Fichero: ");
            String fichero = Scan.next();
            if (!fichero.endsWith(".txt")) {
                fichero += ".txt";
            }
            String path = System.getProperty("user.dir") + File.separator + folder;
            String contenido = Funciones.showFile(path, fichero);
            System.out.println(contenido);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    static void overWriteFile() {
        try{

            System.out.println("Nombre de la Carpeta: ");
            String folder = Scan.next();
            System.out.println("Nombre del fichero: ");
            String nameFile = Scan.next();
            if (!nameFile.endsWith(".txt")) {
                nameFile += ".txt";
            }
            System.out.println("Introduce el contenido q quieras modificar: ");
            String content = Scan.next();
            String path = System.getProperty("user.dir") + File.separator + folder;

            boolean result = Funciones.overWriteFile(path, nameFile, content);
            if (result) {
                System.out.println("El fichero ha sido modificado ");
            }
        }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    static void deleteFile(){
        try{
            System.out.println("Escriba el nombre de la Carpeta: ");
            String folder = Scan.next();
            System.out.println("Escriba el nombre del Fichero:");
            String fichero = Scan.next();
            if(!fichero.endsWith(".txt")){
                fichero += ".txt";
            }
            String path = System.getProperty("user.dir")+ File.separator + folder;
            Funciones.deleteFile(path, fichero);
            System.out.println("El fichero se borro correctamente");
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    static void countChars(){
        try{
            System.out.println("Escriba el nombre de la Carpeta: ");
            String folder = Scan.next();
            System.out.println("Escriba el nombre del fichero");
            String nameFile = Scan.next();
            if(!nameFile.endsWith(".txt")){
                nameFile += ".txt";
            }
            String path = System.getProperty("user.dir") + File.separator + folder;
            int count = Funciones.countChars(path, nameFile);
            System.out.println("Este es el numero de caracteres sin espacios: " + count);
        }catch(Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    static void countWords(){
       try{
           System.out.println("Escriba el nombre de la Carpeta: ");
           String folder = Scan.next();
           System.out.println("Escriba el nombre del fichero: ");
           String fichero = Scan.next();
           if(!fichero.endsWith(".txt")){
               fichero += ".txt";
           }
           String path = System.getProperty("user.dir") + File.separator + folder;
           int totalWords = Funciones.countWords(path, fichero);
           System.out.println("Total de palabras: " + totalWords);
       }catch (Exception ex){
           System.out.println("Error: " + ex.getMessage());
       }
    }
    static void swapWords(){
        try{
            System.out.println("Nombre de la Carpeta: ");
            String folder = Scan.next();
            System.out.println("Nombre del Fichero: ");
            String fichero = Scan.next();
            if(!fichero.endsWith(".txt")){
                fichero += ".txt";
            }
            String path = System.getProperty("user.dir") + File.separator + folder;
            System.out.println("Palabra q quieras cambiar: ");
            String oldWord = Scan.next();
            System.out.println("Palabra nueva: ");
            String newWord = Scan.next();
            
            String[] modifiedLines = Funciones.swapWords(path, fichero, oldWord, newWord);
            for (String line : modifiedLines) {
                System.out.println(line);
            }
        }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabrielheralv
 */
public class EscrituraConBufferedWritter {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{ 
        File fichero = new File("src\\Recursos\\GHA.txt");
        fw = new FileWriter(fichero,true);
        bw = new BufferedWriter(fw);
        bw.write("Hola Primera Prueba");
        bw.newLine();
        bw.write("Segunda Prueba ");
        bw.newLine();
        bw.write("Tercera Linea");
        bw.newLine();
        bw.write("Quarta prueba");
        bw.newLine();
        bw.flush();
        bw.close();
        }catch (IOException ex){
            System.out.println("Error entrada y salida" + ex.getMessage());
        }finally{
            try{
                bw.close();
            }catch(IOException ex){
                System.out.println("Error entrada del fichero");
            }
        }
    }
}

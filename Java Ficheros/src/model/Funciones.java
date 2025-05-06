/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author gabrielheralv
 */
public class Funciones {

    public static void createFolder(String folderPath) throws Exception {
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdir();
        } else {
            throw new Exception("La Carpeta ya existe");
        }
    }

    public static void createFile(String path, String nameFile, String content) throws IOException {
        String pathFile = path + File.separator + nameFile;
        FileWriter fr = new FileWriter(pathFile, true);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write(content);
        bw.newLine();
        bw.flush();
        bw.close();
        fr.close();
    }
    public static String[] showListFile(String path){
        File folder = new File(path);
        return folder.list();
    }
    public static String showFile(String path, String fichero) throws Exception{
        String pathFile = path + File.separator + fichero;
        File file = new File(pathFile);
        if(!file.exists()){
            throw new Exception("No se pudo encontrar el fichero");
        }
        StringBuilder sb;
        try(FileReader fr = new FileReader(file)){
            BufferedReader br = new BufferedReader(fr);
            sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null){
                sb.append(line).append("\n");
            }br.close();
        }
        return sb.toString();
    }
    
    public static boolean overWriteFile(String path, String nameFile, String newContent) throws Exception{
        String pathFile = path + File.separator + nameFile;
        File file = new File(pathFile);
        if(!file.exists()){
            throw new Exception ("El archivo no existe");
        }
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(newContent);
        bw.newLine();
        bw.flush();
        bw.close();
        fw.close();
        return true;
    }
    public static void deleteFile(String path, String fichero) throws Exception{
        String pathFile = path + File.separator + fichero;
        File file = new File(pathFile);
        if(!file.exists()){
            throw new Exception("El fichero no existe");
        }
        boolean deleted = file.delete();
        if(!deleted)
            throw new Exception("El fichero no se pudo borrar");
    }
    public static int countChars (String path, String nameFile) throws Exception{
        String pathFile = path + File.separator + nameFile;
        File file = new File(pathFile);
        if(!file.exists()){
            throw new Exception("No se encontro el fichero");
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int numChars = 0;
        String line;
        while((line = br.readLine()) != null){
            numChars += line.replaceAll("\\s+", "").length();
        }
        br.close();
        fr.close();
        return numChars;
    }
    public static int countWords(String path, String fichero) throws Exception{
        String filePath = path + File.separator + fichero;
        File file = new File(filePath);
        if(!file.exists()){
            throw new Exception("El fichero no se encuentra");
        }
        FileReader fr = new FileReader(file);
        BufferedReader br =  new BufferedReader(fr);
        int numberWords = 0;
        String line;
        while((line = br.readLine())!= null){
            if(!line.isBlank()){
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if(!word.isBlank()){
                        numberWords++;
                    }
                }
            }
        }
        br.close();
        fr.close();
        return numberWords;
    }
    
    public static String [] swapWords(String path,String fichero,String oldWord,String newWord) throws Exception{
        String pathFile = path + File.separator + fichero;
        File file = new File(pathFile);
        if(!file.exists()){
            throw new Exception("No se encontro el fichero");
        }
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        List<String> modifiedLine = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean cambios = false;
        String line;
        while ((line = br.readLine())!= null){
            String modified = line.replace(oldWord, newWord);
            if (!line.equals(modified)){
                cambios = true;
            }
            modifiedLine.add(modified);
            sb.append(modified).append("\n");
        }
        br.close();
        fr.close();
        if(!cambios){
           return new String[]{"no se encontro la " + oldWord}; 
        }
        FileWriter fw = new FileWriter(file, false);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        fw.close();
        return modifiedLine.toArray(new String[0]);
    }
    
}

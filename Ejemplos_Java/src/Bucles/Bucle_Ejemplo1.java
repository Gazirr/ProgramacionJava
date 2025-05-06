/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;
 import java.util.Scanner;
/**
 *
 * @author gabrielheralv
 */
public class Bucle_Ejemplo1 {
    static Scanner s = new Scanner (System.in);
    public static void main(String[] args) {
        s.useDelimiter("\n");
        int numAlumno = 1;
        int sumaNotas = 0;
        
        System.out.println("Introduce la nota del alumno " + numAlumno + ": ");
        String nota = s.next();
        int notas = Integer.parseInt(nota);
        sumaNotas = sumaNotas + notas;
        numAlumno = numAlumno + 1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno  + ": " );
        nota = s.next();
        notas = Integer.parseInt(nota);
        sumaNotas = sumaNotas + notas;
        numAlumno = numAlumno +1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno + ": ");
        nota = s.next();
        notas = Integer.parseInt(nota);
        sumaNotas = sumaNotas + notas;
        numAlumno = numAlumno + 1;
        
         System.out.println("Introduce la nota del alumno " + numAlumno  + ": " );
        nota = s.next();
        notas = Integer.parseInt(nota);
        sumaNotas = sumaNotas + notas;
        numAlumno = numAlumno +1;
        
        System.out.println("Introduce la nota del alumno " + numAlumno + ": ");
        nota = s.next();
        notas = Integer.parseInt(nota);
        sumaNotas = sumaNotas + notas;
        
        int media = sumaNotas/(numAlumno);
        System.out.println("La nota Media de los Alumnos es: " + media);
        
        
    }
    
    
}

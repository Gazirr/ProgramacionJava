/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioBucle;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Practica08 {
    static Scanner s = new Scanner (System.in);
    
    public static void main(String[] args) {
        s.useDelimiter("\n");
        String op = "";
        do{
             System.out.println("");
            System.out.println("Menu");
            System.out.println("Select An Option");
            System.out.println("1.- Exercise 1");
            System.out.println("2.- Exercise 2");
            System.out.println("3.- Exercise 3");
            System.out.println("4.- Exercise 4");
            System.out.println("5.- Exercise 5");
            System.out.println("6.- Exercise 6");
            System.out.println("7.- Exercise 7");
            System.out.println("z");
            op = s.next();
            switch (op) {
                case "1":
                    Exercise1();
                    break;
                case "2":
                    Exercise2();
                    break;
                case "3":
                    Exercise3();
                    break;
                case "4":
                    Exercise4();
                    break;
                case "5":
                    Exercise5();
                    break;
                case "6":
                    Exercise6();
                    break;
                case "7":
                    Exercise7();
                    break;
                case "z":
                    System.out.println("Adios gracias");
                    break;
                default:
                    System.out.println("Error");
            }
        } while (!op.equals("z"));
    }
    
    static void Exercise1(){
        int sumadigit = 0;
        System.out.println("Write a number");
        int num = s.nextInt();
        while(num > 0){
            sumadigit = sumadigit + (num % 10);
            num = (num / 10);
        }
        System.out.println("The sum of the digits are: " + sumadigit);
    }
    
    static void Exercise2(){
        int contar = 0;
        System.out.println("Enter a Word or a Pharse");
        String pharse = s.next();
        System.out.println("Enter a character of the Word");
        char caracter = s.next().charAt(0);
        for (int i = 0;i < pharse.length();i++){
            if (pharse.charAt(i) == caracter){
               contar ++; 
            } 
        }
        System.out.println("The Caracter "+ caracter + " is written " + contar + " times");
    }
    
    static void Exercise3(){
        System.out.println("Write a phrase");
        String word = s.next();
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(word.charAt(i));
        }
    }
    static void Exercise4(){
        int size = 10;
        
        for (int row = 1; row<=size;row++){       
            for (int col = 1; col<=size;col++){
                System.out.printf("%4d", row * col);
            }
            System.out.println(" ");
        }
    }
    static void Exercise5(){
        int vidahero = 100;
        int vidaenemy = 100;
        int firstatack = 25;
        int secondatack = 30;
        int firstatackenemy = 20;
        int secondatackenemy = 25;
        boolean turno = false;
        System.out.println("Chose a Character: ");
        System.out.println("1.- Hero");
        System.out.println("2.- Enemy");
        int option = s.nextInt();
        if (option == 1){
            turno = true;
        }else {
            turno = false;
        }
        while(vidaenemy > 1 && vidahero > 1){
            System.out.println("Choose Attack");
            System.out.println("1.- FirstAttack");
            System.out.println("2.- SecondAttack");
            System.out.println("3.- Surrender");
            String attack = s.next();
            if ((option == 1)&&(turno == true)){
                switch (attack) {
                    case "1":
                        vidaenemy -=firstatack;
                        System.out.println("The atack distroys the enemy with a pain of "+ firstatack +" his health is "+ vidaenemy);
                        break;
                    case "2":
                        vidaenemy-=secondatack;
                        System.out.println("The atack distroys the enemy with a pain of "+ secondatack +" his health is "+ vidaenemy);
                        break;
                    case "3":
                        System.out.println("You surrender");
                        vidahero = 0;
                        break; 
                    default:
                        throw new AssertionError();
                }
                turno = false;
                
            }
            if ((option ==1)&& (turno == false)){
                    int attackenemy = (int) (Math.random()*2);
                    if (attackenemy == 0  ){
                         vidahero -= firstatackenemy;
                        System.out.println("The atack distroys the hero with a pain of "+ firstatackenemy +" his health is "+ vidahero);
                    }
                    if (attackenemy == 1  ){
                         vidahero -=secondatackenemy;
                        System.out.println("The atack distroys the hero with a pain of "+ secondatackenemy +" his health is "+ vidahero);
                    }
                    turno = true;
            }
            if ((option == 2)&& (vidaenemy > 1) && (turno == false)){
            switch (attack) {
                    case "1":
                        vidahero -=firstatackenemy;
                        System.out.println("The atack distroys the hero with a pain of "+ firstatackenemy +" his health is "+ vidahero);
                        break;
                    case "2":
                        vidahero-=secondatackenemy;
                        System.out.println("The atack distroys the hero with a pain of "+ secondatackenemy +" his health is "+ vidahero);
                        break;
                    case "3":
                        System.out.println("You surrender");
                        vidaenemy = 0;
                        break; 
                    default:
                        throw new AssertionError();
                }
                turno = true;
                
                
        }
            if ((option ==2)&& (turno == true)){
                    int atackhero = (int) (Math.random()*2);
                    if (atackhero == 0  ){
                        vidaenemy -= firstatack;
                        System.out.println("The atack distroys the enemy with a pain of "+ firstatack +" his health is "+ vidaenemy);
                    }
                    if (atackhero == 1  ){
                        vidaenemy -= secondatack;
                        System.out.println("The atack distroys the enemy with a pain of "+ secondatack +" his health is "+ vidaenemy);
                    }
                    turno = false;
            }
            if (vidaenemy <= 0){
                System.out.println("The hero wins and  saved the village");
            }
            if (vidahero <= 0){
               System.out.println("The enemy Wins and distroys the village"); 
            }
            
            
        }
    }
    static void Exercise6(){
        int numAlumno = 1;
        int sumaNotas = 0;
        int maximo = 5;
        String numString = String.valueOf(numAlumno);
       while (numAlumno <= maximo){
           System.out.println("Introduce la nota del alumno " +  numAlumno);
           int nota = s.nextInt();
           sumaNotas = sumaNotas + nota;
           numAlumno = numAlumno +  1;
       }
       int media = sumaNotas/(numAlumno-1);
       String mediaString = String.valueOf(media);
        System.out.println("La nota de los alumnos es " + media);
    }
    static void Exercise7(){
        System.out.println("Ingrese un numero entero: ");
        int num = s.nextInt();
        boolean es_primo = true;
        for (int i = 2 ; i < num; i ++){
            if (num % i == 0){
                es_primo =false;
                System.out.println(+ i + " es divisible entre " + num);
            }
        }
        if (es_primo){
            System.out.println("El numero "+ num + " es primo");
        }else{
            System.out.println("El numero " + num + " no es primo");
        }
    }
}


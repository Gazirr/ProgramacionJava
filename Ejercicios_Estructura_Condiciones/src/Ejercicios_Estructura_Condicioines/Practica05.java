/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Estructura_Condicioines;

import java.util.Scanner;

/**
 *
 * @author gabrielheralv
 */
public class Practica05 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        s.useDelimiter("\n");
//        System.out.println("Practica 05");
//        System.out.println("Menu: ");
        System.out.print("Please select an exercise (1-5): ");
        String opcion = s.next();
        switch (opcion) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();
                break;
            case "3":
                ejercicio3();
                break;
            case "4":
                ejercicio4();
                break;
            case "5":
                ejercicio5();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }// Fin Main

    static void ejercicio1() {
        System.out.print("Enter a day of the week: ");
        String day = s.next();
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("The first subject of the day is PROG.");
                break;
            case "thueday":
                System.out.println("The first subject of the day is ENT");
                break;
            case "wednesday":
                System.out.println("The first subject of the day is SO");
                break;
            case "thurday":
                System.out.println("The first subject of the day is SIST");
                break;
            case "friday":
                System.out.println("The first subject of the day is BBDD");
                break;
            default:
                System.out.println("Error");
                break;
        }
}
    static void ejercicio2(){
        System.out.print("Enter the hour: ");
        String hour = s.next();
        int hora = Integer.parseInt(hour);
        if ((hora >= 6)&& (hora<=12)){
            System.out.println("Good Morning");
        } else if ((hora >= 13)&&(hora<=20)){
            System.out.println("Good afternoon ");
        }else if ((hora >= 21)&& (hora<=24)|| (hora>=0)&& (hora<=5)){
            System.out.println(" Good evening");
        }else{
            System.out.println("Error");
        }
  }
    static void ejercicio3(){
        System.out.print("Enter a number (1-7)");
        String day = s.next();
        int dia = Integer.parseInt(day);
        switch (dia) {
            case 1:
                System.out.println("The corresponding day is Monday");
                break;
            case 2:
                System.out.println("The corresponding day is Tuesday");
                break;
            case 3:
                System.out.println("The corresponding day is Wednesday");
                break;
            case 4:
                System.out.println("The corresponding day is Thursday");
                break;
            case 5:
                System.out.println("The corresponding day is Friday");
                break;
            case 6:
                System.out.println("The corresponding day is Saturday");
                break;
            case 7:
                System.out.println("The corresponding day is Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    static void ejercicio4(){
         double  paga_ordinaria= 10;
         double paga_extra =12;
         double hora_extra = 0;
         int hora_regular = 40;
         double totalpaga = 0;
        System.out.print("Enter the number of hours worked hours: ");
        String hours = s.next();
        double horas =Double.parseDouble(hours);
        if (horas <= hora_regular){
            totalpaga = horas*paga_ordinaria;
            System.out.println("The total weekly wage is: " + totalpaga);
        }else {
            hora_extra = horas - hora_regular;
            totalpaga =(hora_regular*paga_ordinaria)+ (hora_extra*paga_extra);
            System.out.println("The total weekly wage is: " + totalpaga);
        }
    }
    static void ejercicio5(){
        System.out.print("Enter the day of birth: ");
        String day = s.next();
        int dia = Integer.parseInt(day);
        System.out.print("Enter the month of  birth: ");
        String month = s.next();
        int mes = Integer.parseInt(month);
        if ((mes == 1 && dia >= 21) || (mes == 2 && dia<=19)){
            System.out.println("your horoscope is Acuario");
        } else if ((mes == 2 && dia >=20)||(mes == 3 && dia <= 20)){
            System.out.println("your horoscope is Piscis");
        }else if ((mes == 3 && dia >=21)|| (mes ==4 && dia <= 20 )){
            System.out.println("your horoscope is Aries");
        }else if((mes == 4 && dia >= 21)||(mes ==5 && dia<= 21)){
            System.out.println("your horoscope is Tauro");
        } else if ((mes == 5 && dia >= 22)||(mes==6 && dia <= 21)){
            System.out.println("your horoscope is Geminis");
        }else if ((mes == 6 && dia >= 22)|| (mes ==7 && dia <= 22)){
            System.out.println("Your horoscope is Cancer");
        }else if((mes == 7 && dia >= 23) || (mes == 8 && dia <=22)){
            System.out.println("Your horoscope is Leo");
        }else if ((mes == 8 && dia >=23)|| (mes == 9 && dia <=22)){
            System.out.println("Your horoscope is Virgo");
        } else if ((mes == 9 && dia >= 23)|| (mes ==10 && dia <= 22)){
            System.out.println("Your horoscope is Libra");
        }else if ((mes == 10 && dia >=23)|| (mes == 11 && dia <= 22)){
            System.out.println("Your horoscope is Escorpio");
        }else if ((mes == 11 && dia>= 23)||(mes == 12 && dia<= 21)){
            System.out.println("Your horoscope is Sagitario");
        }else if ((mes ==12 && dia>= 22)|| mes == 1 && dia <= 20){
            System.out.println("Your horoscope is Capricornio");
        }else{
            System.out.println("Error");
        }
    }
}


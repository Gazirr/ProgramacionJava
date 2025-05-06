/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.console;

import Model.validations.UserDataValidations;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author gabrielheralv
 */
public class Main {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        String option;
        do {
            System.out.println("------------------------------");
            System.out.println("MENU: ");
            System.out.println("1.- Tester checkId");
            System.out.println("2.- Tester checkFormatDate");
            System.out.println("3.- Tester calculateAge");
            System.out.println("4.- Tester checkPostalCode");
            System.out.println("5.- Tester isNumeric");
            System.out.println("6.- Tester isAlphabetic");
            System.out.println("7.- Tester checkEmail");
            System.out.println("8.- Tester checkName");
            System.out.println("9.- Salir");
            System.out.println("------------------------------");
            System.out.print("Option: ");
            option = sc.next();
            
            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                     break;
                case "3":
                    testcalculateAge();
                     break;
                case "4":
                    testcheckPostalCode();
                     break;
                case "5":
                    testisNumeric();
                     break;
                case "6":
                    testisAlphabetic();
                     break;
                case "7":
                    testcheckEmail();
                    break;
                case "8":
                    testcheckName();
                    break;
                case "z":
                    System.out.println("Saliendo");
                default:
                    System.out.println("Incorrect Option");
            }
        } while (!option.equals("z"));
    }
    static void testCheckId(){
        System.out.println("--------NIF validator--------");
        System.out.println("                             ");
        System.out.println("--Enter your NIF/DNI--");
        String nif = sc.next();
        boolean nifOk = UserDataValidations.checkId(nif);
        if (nifOk){
            System.out.println("Correct Nif");
        }else{
            System.out.println("Wrong Nif");
        }
        
        
    
    }
    static void testCheckFormatDate(){
        System.out.println("--------Date Validator--------"); 
        System.out.println("                              ");
        System.out.println("--Enter your Date--");
        String date = sc.next().replaceAll(" ", "");
        boolean dateOk = UserDataValidations.checkFormatDate(date);
        
        if (dateOk){
            System.out.println("Correct Date");
        }else{
            System.out.println("Incorrect Date");
        }
    }
    static void testcalculateAge(){
        System.out.println("--------Age Validator--------");
        System.out.println("                             ");
        System.out.println("---Enter your Birthday(dd/MM/yyyy)---");
        String edad = sc.next().replaceAll(" ","");
        int birthdayOk = UserDataValidations.calculateAge(edad);
        
        if (birthdayOk == -1) {
            System.out.println("Incorrect date");            
        } else{
            System.out.println("Correct date");
            System.out.println(birthdayOk);
        }
    }
static void testcheckPostalCode(){
    System.out.println("--------Postal Code Validator--------");
    System.out.println("                                     ");
    System.out.println("--Enter a Postal Code--");
    String postal = sc.next().replaceAll(" ","");
    boolean postalOk = UserDataValidations.postalCode(postal);
    if(postalOk){
        System.out.println("Is a Postal Code");
    }else{
        System.out.println("Is not a Postal Code");
        
    }
}

 static void  testisNumeric(){
     System.out.println("--------Number Validator--------");
     System.out.println("                                ");
     System.out.println("--Enter Number--");
     String num = sc.next().replaceAll(" ","");
     boolean numOk = UserDataValidations.isNumeric(num);
     
     if (numOk){
         System.out.println("Is a number");
     }else{
         System.out.println("Is not a number");
     }
         
 }
 static void testisAlphabetic(){
     System.out.println("--------Alphabetic Validator--------");
     System.out.println("                                    ");
     System.out.println("--Enter a Word--");
     String word =sc.next().replaceAll(" ","");
     boolean wordOk = UserDataValidations.isAlphabetic(word);
     
     if(wordOk){
         System.out.println("Is a Word");
     }else{
         System.out.println("Is not a Word");
     }
         
 }
 static void testcheckEmail(){
     System.out.println("--------Email Validator--------");
     System.out.println("                               ");
     System.out.println("--Enter a Email--");
     String email = sc.next().replaceAll(" ","");
     boolean emailOk = UserDataValidations.checkEmail(email);
     if(emailOk){
         System.out.println("Is a email");
     }else
         System.out.println("Is a not a email");
 }
 static void testcheckName(){
     System.out.println("--------Name Validator--------");
     System.out.println("                              ");
     System.out.println("--Enter a name--");
     String name = sc.next().replaceAll(" ","");
     boolean nameOk = UserDataValidations.checkName(name);
     if (nameOk){
         System.out.println("Is a name");
     }else {
         System.out.println("Is not a name");
     }
 }
}

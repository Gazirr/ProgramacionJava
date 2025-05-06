/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.validations;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabrielheralv
 */
public class UserDataValidations {

    public static boolean checkId(int typeDoc, String id) {
        boolean nifOk = false;
        String digitos = id.substring(0, 8);
        char letra = id.charAt(8);
        int numeros = Integer.parseInt(digitos);

        int resto = numeros % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCalculada = letras.charAt(resto);
        nifOk = (letraCalculada == letra);
        return nifOk;
    }

    public static boolean checkFormatDate(String date) {
        boolean dateOk = false;
        String[] allDate = date.split("/");

        String days = allDate[0];
        String months = allDate[1];
        String years = allDate[2];

        int day = Integer.parseInt(days);
        int month = Integer.parseInt(months);
        int year = Integer.parseInt(years);

        if (year < 1 || year > 9999) {
            dateOk = true;
        }

        switch (month) {
            case 1,3,5,7,8,10,12:
                if (day < 1 || day > 31) {
                    dateOk = true;
                }
                break;
            case 4,6,9,11:
                if (day < 1 || day > 30) {
                    dateOk = true;
                }
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day < 1 || day > 29) {
                        dateOk = true;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        dateOk = true;
                    }
                }
                break;
            default:
                System.out.println("fecha Error");

        }
        return !dateOk;
    }

    public static boolean calculateAge(String edad) {

        int fecha = -1;
        boolean age = false;
        if (UserDataValidations.checkFormatDate(edad)) {
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate datebirth = LocalDate.parse(edad, dateFormat);

            LocalDate actualDay = LocalDate.now();

            Period años = Period.between(datebirth, actualDay);
            System.out.printf("The age is: %d years , %d month y %d days%n", años.getYears(), años.getMonths(), años.getDays());
            System.out.println("");
            age = true;
        }
        return age;
    }

    public static boolean postalCode(String postal) {
        boolean postalOk = false;
        UserDataValidations.isNumeric(postal);
        if (postal.length() == 5) {
            postalOk = true;
        }

        return postalOk;
    }

    public static boolean isNumeric(String num) {
        boolean numOk = true;

        for (char a : num.toCharArray()) {
            if (!Character.isDigit(a)) {
                return numOk = false;
            }
        }

        return numOk;
    }

    public static boolean isAlphabetic(String word) {
        boolean wordOk = true;

        for (char b : word.toCharArray()) {
            if (!Character.isAlphabetic(b)) {
                return wordOk = false;
            }
        }

        return wordOk;
    }

    public static boolean checkEmail(String email) {
        boolean emailOk = false;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                for (int j = 0; j < email.length(); j++) {
                    if (email.charAt(j) == '.') {
                        return emailOk = true;
                    }
                }
            }
        }

        return emailOk;
    }

    public static boolean checkName(String name) {
        boolean nameOk = false;
        if (UserDataValidations.isAlphabetic(name)) {
            nameOk = true;
        }
        return nameOk;
    }
}

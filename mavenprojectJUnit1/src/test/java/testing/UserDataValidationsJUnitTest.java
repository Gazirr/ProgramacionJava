/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testing;

import com.mycompany.mavenprojectjunit1.model.validations.UserDataValidations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gabrielheralv
 */
public class UserDataValidationsJUnitTest {
    
    public UserDataValidationsJUnitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testCheckId() {
         System.out.println("--------TestCheckId--------");
         int typeDoc = 1;
         String id = "51461598H";
         boolean expResult = true;
         boolean result = UserDataValidations.checkId(typeDoc, id);
//         assertEquals(expResult, result, "El Nif es Incorrecto");
         assertTrue(result);
     }
     @Test
     public void testcheckFormatDate(){
         System.out.println("--------TestFormatDate--------");
         String date = "18/10/2006";
         boolean expResult = true;
         boolean result = UserDataValidations.checkFormatDate(date);
         assertTrue(result);
     }
     @Test
     public void testcalculateAge(){
         System.out.println("--------TestCalculateAge--------");
         String edad = "18/10/2006";
         boolean expResult = true;
         boolean result = UserDataValidations.calculateAge(edad);
         assertTrue(result);
     }
     @Test
     public void testpostalCode(){
         System.out.println("--------TestPostalCode--------");
         String postal = "08027";
         boolean expResult = true;
         boolean result = UserDataValidations.postalCode(postal);
         assertTrue(result);
     }
     @Test
     public void testisNumeric(){
         System.out.println("--------TestIsNumeric--------");
         String num = "2211";
         boolean expResult = true;
         boolean result = UserDataValidations.isNumeric(num);
         assertTrue(result);
     }
     @Test
     public void testisAlphabetic(){
         System.out.println("--------TestIsAlphabetic--------");
         String word = "Agua";
         String words = "Bendita";
         boolean expResult = true;
         boolean result = UserDataValidations.isAlphabetic(word);
         boolean results = UserDataValidations.isAlphabetic(words);
         assertTrue(result);
         assertTrue(results);
     }
     @Test
     public void testcheckEmail(){
         System.out.println("--------TestCheckEmail--------");
         String email = "tontoJordi@gmail.com";
         boolean expResult = true;
         boolean result = UserDataValidations.checkEmail(email);
         assertTrue(result);
     }
     @Test
     public void testcheckName(){
         System.out.println("--------TestCheckName--------");
         String name = "Gabriel";
         boolean expResult = true;
         boolean result = UserDataValidations.checkName(name);
         assertTrue(result);
     }
             
}

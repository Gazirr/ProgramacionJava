/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package model;

/**
*
* @author gabrielheralv
*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Car extends Vehicles {
    private static final int MAX = 120;
    private static final double ACE = 10;
    private static final double FRE = 10;
    // Atributos caracteristicas de la classe
    private int numPuertas;
    public Car() {
        super();
    }
 
    public Car(String brand, String plate, String model, int power, int seats, ColorEnum color, MotorEnum engine, double velocity, String fechaDeFabricacion,double peso, int numpuertas) {
       super(brand,plate,model,power,seats,color, engine, velocity, fechaDeFabricacion,peso);
       
       this.numPuertas =  numPuertas;
        
        
                
    }

    public Car(String brand, String model, int power, int seats, ColorEnum color, MotorEnum engine, double peso) {
        super(brand, model,power,seats,color,engine,peso);
      this.numPuertas = 4;
    }
    
 
 
 
 
 
    
 
    // Getter & Setter
 public int getNumPuertas(){
     return numPuertas;
 }
 public void setNumPuertas(int numPuertas){
     this.numPuertas = numPuertas;
 }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n Numero de Puertas:").append(numPuertas <0 ? numPuertas: "No especificado").append("\n");
        sb.append("\n FIN-CAR");
        return sb.toString();
    }
//METODOS PROPIOS

}
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

public class Moto extends Vehicles {
    private static final int MAX = 120;
    private static final double ACE = 10;
    private static final double FRE = 10;
    // Atributos caracteristicas de la classe
   
    private boolean tieneSidecar;
    private int cilendrada;
    public Moto() {
        super();
    }
 
    public Moto(String brand, String plate, String model, int power, int seats, ColorEnum color, MotorEnum engine, double velocity, String fechaDeFabricacion,double peso, boolean tieneSidecar, int cilendrada) {
       super(brand,plate,model,power,seats,color,engine,velocity,fechaDeFabricacion,peso);
       
       this.tieneSidecar = tieneSidecar;
       this.cilendrada = cilendrada;
        
        
                
    }
 
    public Moto(String model, int power, int seats, MotorEnum engine, double peso) {
        super(model,power,seats,engine, peso);
 
    }
 
 
 
    
 
    // Getter & Setter
public boolean getTieneSidecar(){
      return tieneSidecar;
  }
public void setTieneSidecar(boolean tieneSidecar){
    this.tieneSidecar = tieneSidecar;
}
public int getcilendrada(){
    return cilendrada;
}
public void setCilendrada(int cilendrada){
    this.cilendrada = cilendrada;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n TieneSidecar: ").append(tieneSidecar);
        sb.append("\n cilendrada: ").append(cilendrada);
        sb.append("\n FIN-CAR");
        return sb.toString();
    }
//METODOS PROPIOS


}
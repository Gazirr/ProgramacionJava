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

public class Camion extends Vehicles {

    private static final int MAX = 120;
    private static final double ACE = 10;
    private static final double FRE = 10;
    // Atributos caracteristicas de la classe
    private double carga;
    private double altura;

    public Camion() {
        super();
    }

    public Camion(String brand, String plate, String model, int power, int seats, ColorEnum color, MotorEnum engine, double velocity, String fechaDeFabricacion,double peso, double carga, double altura) {

        super(brand, plate, model, power, seats, color, engine, velocity, fechaDeFabricacion,peso);

        this.carga = carga;
        this.altura = altura;
    }

    public Camion(String model, int power, int seats, MotorEnum engine, double peso) {
        super(model, power, seats, engine, peso);
    }

    // Getter & Setter
    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("carga = ").append(carga);
        sb.append("altura = ").append(altura);
        sb.append("\n FIN-CAR");
        return sb.toString();
    }
//METODOS PROPIOS

 

}

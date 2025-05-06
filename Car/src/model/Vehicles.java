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

public class Vehicles {

    private static final int MAX = 120;
    private static final double ACE = 10;
    private static final double FRE = 10;
    // Atributos caracteristicas de la classe
    private String brand;
    private String plate;
    private String model;
    private int power;
    private int seats;
    private ColorEnum color;
    private MotorEnum engine;
    private double velocity;
    private String fechaDeFabricacion;
    private double peso;

    public Vehicles() {
    }

    public Vehicles(String brand, String plate, String model, int power, int seats, ColorEnum color, MotorEnum engine, double velocity, String fechaDeFabricacion, double peso) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.power = power;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.velocity = velocity;
        this.fechaDeFabricacion = fechaDeFabricacion;
        this.peso = peso;

    }

    public Vehicles(String brand, String model, int power, int seats, ColorEnum color, MotorEnum engine, double peso) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.seats = seats;
        this.color = color;
        this.engine = engine;
        this.peso = peso;
    }

    public Vehicles(String model, int power, int seats, MotorEnum engine, double peso) {
        this.model = model;
        this.power = power;
        this.seats = seats;
        this.engine = engine;
        this.peso = peso;
    }

    // Getter & Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public MotorEnum getEngine() {
        return engine;
    }

    public void setEngine(MotorEnum engine) {
        this.engine = engine;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        if (velocity >= 0) {
            this.velocity = velocity;
        } else {
            this.velocity = 0;
        }

    }

    public String getFechaDeFabricacion() {
        return fechaDeFabricacion;
    }

    public void setFechaDeFabricacion(String fechaDeFabricacion) {
        this.fechaDeFabricacion = fechaDeFabricacion;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("INI-Car:\n");
        if (brand != null) {
            sb.append("brand=").append(brand);
        }
        if (plate != null) {
            sb.append("\n plate=").append(plate);
        }
        if (model != null) {
            sb.append("\n model=").append(model);
        }
        if (power != 0.0) {
            sb.append("\n power=").append(power);
        }
        if (seats != 0) {
            sb.append("\n seats=").append(seats);
        }
        if (color != null) {
            sb.append("\n color=").append(color);
        }
        if (engine != null) {
            sb.append("\n engine=").append(engine);
        }
        if (velocity != 0.0) {
            sb.append("\n velocity=").append(velocity);
        }
        if (fechaDeFabricacion != null) {
            sb.append("\n fechaDeFabricacion").append(fechaDeFabricacion);
        }
        if (peso != 0.0){
            sb.append("\n peso=").append(peso);
        }
        return sb.toString();
    }
//METODOS PROPIOS

    public void frenar() {
        velocity -= FRE;
    }

    public void acelerar() {
        velocity += ACE;

    }

    public int calcularAntiguedad() {
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period p = Period.between(LocalDate.parse(fechaDeFabricacion, dateFormatter), currentDate);

        return p.getYears();
    }
    
}

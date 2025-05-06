/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import model.Camion;
import model.Car;
import model.ColorEnum;
import model.Moto;
import model.MotorEnum;
import model.Vehicles;

/**
 *
 * @author gabrielheralv
 */
public class Main {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Vehicles>  listaVehiculo = new ArrayList<Vehicles>(); 
    public static void main(String[] args) {
        
//        Car car1 = new Car("Toyota", "Yaris", 400, 5, ColorEnum.GREEN, MotorEnum.ELECTRICO, 500.0);

        String option = "";
        do {
            System.out.println("--------Menu Vehiculos--------");
            System.out.println("---1.- Crear Coche---");
            System.out.println("---2.- Crear Moto---");
            System.out.println("---3.- Crear Camion---");
            System.out.println("---4.- Mostrar todas las Matriculas---");
            System.out.println("---5.- Mostrar datos del  vehiculo mediante Matricula---");
            System.out.println("---6.- Mostrar todos los vehiculos creados---");
            System.out.println("---7.- Mostrar todos los Coches---");
            System.out.println("---8.- Mostrar todas las motos---");
            System.out.println("---9.- Mostrar todos los camiones---");
            System.out.println("---10.- Eliminar Matricula mediante arraylist---");
            System.out.println("---11.- Salir---");
            option = sc.next();
            switch (option) {
                case "1":
                    crearCoche();                 
                    break;
                case "2":
                    crearMoto();
                    break;
                case "3":
                    crearCamion();
                    break;
                case "4":
                    mostrarTodasLasMatriculas();
                    break;
                case "5":
                    System.out.println("Dime una matricula para ver los datos del vehiculo?");
                    String plate = sc.next();
                    mostrarDatosMedianteMatricula(plate);
                    break;
                case "6":
                    mostrarTotalVehiculosCreados();
                    break;
                case "7":
                    mostrarTodosCoches();
                    break;
                case "8":
                    mostrarTodasMotos();
                    break;
                case "9":
                    mostrarTodosCamiones();
                    break;
                case "10":
                    System.out.println("Que Matricula Quieres Eliminar?");
                    String matricula = sc.next();
                    eliminarVehiculo(matricula);
                    break;
                case "11":
                    System.out.println("gracias por ver");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!option.equals("11"));
    }

    private static void crearCoche() {
        crearVehiculo("Coche");
    }
    private static void crearMoto(){
       crearVehiculo("Moto");
    }
    private static void crearCamion(){
        crearVehiculo("Camion");
    }
    private static void crearVehiculo(String tipo){
        System.out.println("-----1.- Brand(Marca)----");
        String brand = sc.next();
        System.out.println("-----2.- Plate(Matricula)-----");
        String plate = sc.next();
        System.out.println("-----3.- Model(Modelo)-----");
        String model = sc.next();
        System.out.println("-----4.- Power(Potencia)-----");
        int power = sc.nextInt();
        System.out.println("-----5.- Seats(Sitios)-----");
        int seats =sc.nextInt();
        System.out.println("-----6.- Color(color)-----");
        System.out.println("Escoge Un Color" + Arrays.toString(ColorEnum.values()));
        String color = sc.next();
        ColorEnum colorEnum = ColorEnum.valueOf(color);
        System.out.println("-----7.- Engine(Motor)-----");
        System.out.println("Escoge un Motor" + Arrays.toString(MotorEnum.values()));
        String motor = sc.next();
        MotorEnum motorEnum = MotorEnum.valueOf(motor);
        System.out.println("-----8.- Velocity(Velocidad)-----");
        double velocity = sc.nextDouble();
        System.out.println("-----9.- Fecha De Fabricacion------");
        String fecha = sc.next();
        System.out.println("-----10.- Peso-----");
        double peso = sc.nextDouble();
        
        switch (tipo) {
            case "Coche":
                 System.out.println("----11.- Numero de Puertas-----");
                 int numPuertas = sc.nextInt();
                 Vehicles newCar = new Car(brand, plate, model, power, seats, colorEnum, motorEnum, velocity, fecha, peso, numPuertas);
                 listaVehiculo.add(newCar);
                break;
            case "Moto":
                System.out.println("-----11. - TieneSidecar-----");
                boolean tieneSidecar = sc.nextBoolean();
                System.out.println("-----12. - Cilindrada-----");
                int cilindrada = sc.nextInt();
                Vehicles newMoto = new Moto(brand, plate, model, power, seats, colorEnum, motorEnum, velocity, fecha, peso, tieneSidecar, cilindrada);
                listaVehiculo.add(newMoto);
                break;
            case "Camion":
                System.out.println("-----11. - Carga-----");
                double carga = sc.nextDouble();
                System.out.println("-----12. - Altura-----");
                double altura = sc.nextDouble(); 
                Vehicles newCamion = new Camion(brand, plate, model, power, seats, colorEnum, motorEnum, velocity, fecha, peso, carga, altura);
                listaVehiculo.add(newCamion);
                break;
            default:
                throw new AssertionError();
        }
    }
    private static void mostrarTodasLasMatriculas() {
        if (listaVehiculo.size() <=0){
            System.out.println("No hay Matriculas");
        }else{
            System.out.println("Matriculas de los vehiculos");
            for (Vehicles elemVeh : listaVehiculo) {
                System.out.println(elemVeh.getPlate());
            }
        }
        
    }
    private static void mostrarDatosMedianteMatricula(String plate){
        for (Vehicles elemVeh : listaVehiculo) {
            if(plate.equals(elemVeh.getPlate())){
                System.out.println("Aqui tienes los datos: ");
                System.out.println(elemVeh.toString());
            }
        }
    }
    private static void mostrarTotalVehiculosCreados(){
        System.out.println("Aqui tienes el total de Vehiculos actualmente");
        System.out.println(listaVehiculo.size());
    }
    private static void mostrarTodosCoches(){
        int contarCoches = 0;
        for (Vehicles elemVeh : listaVehiculo) {
            if(elemVeh instanceof Car){
                contarCoches++;
            }
        }
        System.out.println(contarCoches);
    }
    private static void mostrarTodasMotos(){
        int contarMotos = 0;
        for (Vehicles elemVeh : listaVehiculo) {
            if (elemVeh instanceof Moto){
                contarMotos++;
            }
        }
        System.out.println(contarMotos);
    } 
    private static void mostrarTodosCamiones(){
        int contarCamion= 0;
        for (Vehicles elemVeh : listaVehiculo) {
            if(elemVeh instanceof Camion){
                contarCamion++;
            }
        }
        System.out.println(contarCamion);
    }
    private static void eliminarVehiculo (String matricula){
         for (Vehicles elemVeh : listaVehiculo) {
            if(matricula.equals(elemVeh.getPlate())){
                listaVehiculo.remove(elemVeh);
                break;
            }
        }
    }
}

package alquiler;

import java.util.ArrayList;

public class Main {

    ArrayList<Car> cars = new ArrayList<>();

    public static void main(String[] args) {
        Main programa = new Main();
        programa.start();
    }

    public void start(){
        cars = Files.readObjectFile();
        int menuOption = 0;
        String menu = "\n=== Bienvenido a Coches de Alquiler ===\n [2] Añadir coche \n [1] Ver coches disponibles \n [0] Salir \n";
        do {
            menuOption = Utils.leerEnteroConsola(menu, 0, 2);
            switch (menuOption){
                case 2:
                    addCar();
                    break;
                case 1:
                    showCars();
                    break;
            }
        }while(menuOption!=0);
    }

    private void addCar(){
        String plate = Utils.leerStringConsole("Introduce matricula: ");
        String brand = Utils.leerStringConsole("Introduce marca: ");
        String model = Utils.leerStringConsole("Introduce modelo: ");
        int seats = Utils.leerEnteroConsola("Introduce num asientos", 2, 8);
        Car car = new Car(plate, brand, model, seats);
        cars.add(car);
        Files.writeObjectFile(cars);
        System.out.println("Añadidido nuevo coche");

    }

    private void showCars(){
        for (Car car : cars){
            System.out.println(car);
        }
    }

}

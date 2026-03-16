package alquiler;

import java.io.Serializable;

public class Car implements Serializable {
    private String plate;
    private String brand;
    private String model;
    private int seats;



    public Car(String plate,String brand, String model, int seats) {
        this.plate= plate;
        this.brand = brand;
        this.model = model;
        this.seats = seats;

    }

    @Override
    public String toString() {
        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                '}';
    }
}

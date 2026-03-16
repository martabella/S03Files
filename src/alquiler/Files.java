package alquiler;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {

    private static final String TEXT_FILE = "cars.txt";
    private static final String DAT_FILE = "cars.dat";

    // --- MÉTODOS PARA TEXTO (.txt) ---

    public static void writeTextFile(ArrayList<Car> cars) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEXT_FILE))) {
            for (Car c : cars) {
                writer.println(c.toString());
            }
        } catch (IOException e) {
            System.err.println("Error escribiendo fichero texto: " + e.getMessage());
        }
    }

    public static ArrayList<Car> readTextFile() {
        ArrayList<Car> cars = new ArrayList<>();
        try (Scanner reader = new Scanner(new FileReader(TEXT_FILE))) {
            String line;
            while ((line = reader.nextLine()) != null) {
                String[] data = line.split(";");
                cars.add(new Car(data[0], data[1], data[2], Integer.parseInt(data[3])));
            }
        } catch (IOException e) {
            System.err.println("Error leyendo fichero texto: " + e.getMessage());
        }
        return cars;
    }

    // --- MÉTODOS PARA OBJETOS (.dat) ---

    public static void writeObjectFile(ArrayList<Car> cars) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DAT_FILE))) {
            oos.writeObject(cars);
        } catch (IOException e) {
            System.err.println("Error escribiendo objetos: " + e.getMessage());
        }
    }

    public static ArrayList<Car> readObjectFile() {
        ArrayList<Car> cars = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DAT_FILE))) {
            cars = (ArrayList<Car>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error leyendo objetos: " + e.getMessage());
        }
        return cars;
    }
}

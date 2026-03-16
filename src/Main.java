import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main programa = new Main();
        programa.inicio();
    }

    public void inicio() {

        File fichero = new File("notas.txt");
       // Scanner scanner=null;
        try(Scanner scanner = new Scanner(fichero)) {
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] lineContent = line.split(";");
                Student student = new Student(lineContent[0], Float.parseFloat(lineContent[1]), Float.parseFloat(lineContent[2]), Float.parseFloat(lineContent[3]));
                System.out.println(student.getUsername()+" - Media: "+student.media());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error. "+e.getMessage());
        }

        System.out.println("Terminando");

    }

}

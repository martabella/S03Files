package alquiler;

import java.util.Scanner;

public class Utils {
    /**
     * Solicita al usuario la introducción de un número entero por consola,
     * mostrando un mensaje personalizado y validando que el valor esté
     * dentro de un rango específico.
     *
     * <p>El método seguirá solicitando la entrada hasta que el usuario
     * introduzca un número entero válido y comprendido entre los valores
     * mínimo y máximo indicados (ambos incluidos).</p>
     *
     * @param mensaje el texto que se mostrará al usuario para solicitar el número
     * @param minEntero el valor mínimo permitido (incluido)
     * @param maxEntero el valor máximo permitido (incluido)
     * @return el número entero introducido por el usuario que cumple
     *         las condiciones de validación
     */
    public static int leerEnteroConsola(String mensaje, int minEntero, int maxEntero){
        Scanner input = new Scanner(System.in);
        int lectura=0;
        boolean exit = false;
        do {
            System.out.println(mensaje);
            if (input.hasNextInt()) {
                lectura = input.nextInt();
                input.nextLine();
                if (lectura >= minEntero && lectura <= maxEntero) {
                    exit = true;
                } else {
                    System.out.println("Error. Debes introducir un entero dentro del rango " + minEntero + " ,  " + maxEntero);
                }
            } else {
                System.out.println("Error. Debes introducir un entero");
                input.nextLine();
            }
        }while(!exit);
        return lectura;
    }

    /**
     * Solicita al usuario la introducción de una cadena de texto por consola,
     * mostrando un mensaje personalizado.
     *
     * <p>El método seguirá solicitando la entrada hasta que el usuario
     * introduzca una cadena de texto.</p>
     *
     * @param mensaje texto que se muestra por consola para pedir el valor String
     * @return String que contenga caracteres
     */
    public static String leerStringConsole(String mensaje){
        Scanner input = new Scanner(System.in);
        String texto;
        do {
            System.out.println(mensaje);
            texto = input.nextLine();
        }while(texto.isBlank());
        return texto;
    }


}

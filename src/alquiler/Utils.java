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
     * Solicita al usuario la introducción de un número float por consola,
     * mostrando un mensaje personalizado y validando que el valor esté
     * dentro de un rango específico.
     *
     * <p>El método seguirá solicitando la entrada hasta que el usuario
     * introduzca un número comprendido entre los valores
     * mínimo y máximo indicados (ambos incluidos).</p>
     *
     * @param mensaje texto que se muestra por consola para pedir el valor float
     * @param valueMin valor mínimo float aceptado
     * @param valueMax valor máximo float aceptado
     * @return valor float comprendido entre valueMin y valueMax
     */
    public static float leerFloatConsole(String mensaje, float valueMin, float valueMax){
        Scanner input= new Scanner(System.in);
        float value = 0;
        boolean exit = false;
        do{
            System.out.println(mensaje);
            if (input.hasNextFloat()){
                value = input.nextFloat();
                input.nextLine();
                if (value>=valueMin&&value<=valueMax){
                    exit = true;
                }
            }else{
                System.out.println("Error. Debes introducir un valor numerico");
                input.nextLine();
            }
        }while(!exit);
        return value;
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

    /**
     * Solicita una confirmación al usuario (Sí/No).
     * * @param mensaje El texto de la pregunta (ej: "¿Desea continuar?")
     * @return true si el usuario responde 's' o 'si', false si responde 'n' o 'no'
     */
    public static boolean leerBooleanConsole(String mensaje) {
        Scanner input = new Scanner(System.in);
        String respuesta;
        boolean valido = false;
        boolean resultado = false;

        do {
            System.out.print(mensaje + " [S/N]: ");
            respuesta = input.nextLine().trim().toLowerCase(); // Normalizamos la entrada

            if (respuesta.equals("s") || respuesta.equals("si")) {
                resultado = true;
                valido = true;
            } else if (respuesta.equals("n") || respuesta.equals("no")) {
                resultado = false;
                valido = true;
            } else {
                System.out.println("Error: Por favor, responde 'S' para Sí o 'N' para No.");
            }
        } while (!valido);

        return resultado;
    }


}

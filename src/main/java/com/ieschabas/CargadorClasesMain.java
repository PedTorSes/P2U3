package com.ieschabas;
/**
 * Clase Main de CargadorClases en la que el usuario va a introducir una clase de Java.
 * En el caso de existir, se mostrará "true"
 * En el caso de no existir, se mostrará "false"
 * @author Pedro Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class CargadorClasesMain {
    public static void main(String[] args) {
        /**
         * Establecemos el menú de la clase para introducir al usuario en la finalidad del programa
         */

        System.out.println("Bienvenid@ al verificador de clases de Java, a continuación, le invito a introducir el nombre de una clase.");
        System.out.println("En el caso de que exista, devolveré 'true', en el caso que no 'false'");
        /**
         * Solicitamos los datos al usuario y los establecemos en una variable
         */
        Scanner scanner = new Scanner(System.in);
        String clase = scanner.nextLine();
        /**
         * Instanciamos la clase para que compruebe el dato introducido
         */
        CargadorClases existeClases = new CargadorClases();
        /**
         * Mostramos en pantalla el resultado de las operaciones realizados en CargadorClase
         */
        System.out.println(existeClases.existeClase(clase));

    }
}

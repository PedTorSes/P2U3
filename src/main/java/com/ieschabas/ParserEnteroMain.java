package com.ieschabas;
/**
 * Clase Main de ParserEntero en el que el programa va a corroborar que introducimos números en su consola
 * En el caso de introducir otro dato diferente, saltará un error
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */
import java.util.Scanner;

public class ParserEnteroMain {
    public static void main(String[] args) {
        /**
         * Introducimos el menú que verá el usuario y le solicitamos el dato
         */
        System.out.println("Vamos a introducir valores numéricos: ");
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.nextLine();
        /**
         * Instanciamos la clase ParserEntero para que realice las comprobaciones y nos muestre en pantalla el resultado que aparezca
         */

        ParserEntero parserEntero = new ParserEntero();
        System.out.println(parserEntero.aEnteroSeguro(null));

        parserEntero = new ParserEntero();
        System.out.println(parserEntero.aEnteroSeguro(numero));

    }
}

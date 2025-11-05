package com.ieschabas;
/**
 * Clase TemporizadorMain en la cual vamos a introducir un dato numérico en milisegundos y el programa mostrará un mensaje al final de dicho tiempo
 * Si se interrumpe el proceso, saldrá un mensaje de error.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class TemporizadorMain {
    /**
     * Establecemos el menú del programa
     */
    public static void main(String[] args) {
        System.out.println("Bienvenida/o al juego del temporizador. Introdúceme un valor en milisegundos y realizaré la cuenta atrás: ");
        /**
         * Soicitamos el dato al usuario y lo establecemos en una variable
         */
        Scanner scanner = new Scanner(System.in);
        long milisegundos = scanner.nextLong();
        /**
         * Instanciamos la clase para realizar las comprobaciones
         */
        Temporizador cuentaAtras = new Temporizador();
        /**
         * Mostramos en pantalla el resultado
         */
        cuentaAtras.dormir(milisegundos);
        scanner.close();
    }
}

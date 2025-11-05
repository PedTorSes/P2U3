package com.ieschabas;
/**
 * Clase Main de ConversorFecha en la que solicitamos un patrón al usuario y luego un dato en formato fecha y ver si mantiene el formato.
 * @author Pedro Torres Sesé
 * @version 1.0
 */
/**
 * Importamos las clases necesarias
 */

import java.util.Date;
import java.util.Scanner;

public class ConversorFechaMain {
    /**
     * Establecemos el menú de introducción al usuario
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Bienvenid@ al comprobador de formato de fecha.");
        System.out.println("A continuación, le solicitaré un patrón de fecha:");
        System.out.println("Unas propuestas son: dd-MM-yyyy / yyyy-MM-dd");
        /**
         * Solicitamos los datos al usuario y los establecemos en variables
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el patrón:");
        String patron = scanner.nextLine();
        System.out.println("Introduce la fecha");
        String fecha = scanner.nextLine();
        /**
         * Instanciamos la clase ConversorFecha para realizar las comprobaciones y mostramos resultados
         *
         */

        ConversorFecha conversor = new ConversorFecha();
        Date resultado = conversor.parsear(fecha, patron);
        System.out.println(resultado);
    }
}

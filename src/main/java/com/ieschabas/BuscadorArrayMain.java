package com.ieschabas;
/**
 * Main de BuscadorArray donde establecemos un array de datos y luego los mostramos en pantalla.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class BuscadorArrayMain {
    public static void main(String[] args) {
        /**
         * Establecemos el menú del programa para que el usuario sepa cómo interactuar.
         */
        System.out.println("Veamos qué mensaje tengo oculto en el programa. Puedes seleccionar cualquier número desde el 0 hasta el que se te ocurra.");
        System.out.println("Cuidado con no pasarte de número u obtendrás un error. ");
        /**
         * Establecemos el array de datos
         */
        String lista[] = {"HABÍA", "UNA", "VEZ", "UN", "CIRCO", "QUE", "ALEGRABA", "SIEMPRE", "EL", "CORAZÓN"};
        Scanner scanner = new Scanner(System.in);
        int indice = scanner.nextInt();
        /**
         * Instanciamos la clase BuscadorArray para trabajar con ella y que realice la comprobación de los datos
         */

        BuscadorArray buscadorArray = new BuscadorArray();
        /**
         * Mostramos en pantalla el resultado del número introducido por el usuario.
         */
        System.out.println(buscadorArray.obtener(lista, indice));
    }
}

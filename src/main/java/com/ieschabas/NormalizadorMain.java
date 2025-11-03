package com.ieschabas;
/**
 * Clase Main de Normalizador en la que le vamos a solicitar un dato por escrito al usuario ofreciendo la posibilidad de que escriba espacios antes y después del dato
 * Luego mostraremos en pantalla el dato escrito sin los espacios anteriores y posteriores del texto y mostraremos el dato en mayúsculas (en caso de se necesario)
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class NormalizadorMain {
    public static void main(String[] args) {
        /**
         * Establecemos el menú que va a ver el usuario
         */
        System.out.println("Venga, venga, escríbeme una frasecita, si te equivocas y pones espacios delante o detrás los eliminaré");
        System.out.println("Aprovechando que hay oferta, también te cambiaré el formato para que salga en mayúsculas.Siéntete libre: ");
        System.out.println("Desbloquea la respuesta secreta mediante: null");
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        /**
         * Instanciamos la clase Normalizador para trabajar con ella.
         */
        Normalizador normalizar = new Normalizador();
        /**
         * Mostramos en pantalla el resultado obtenido
         */
        System.out.println(normalizar.normalizar(null));
    }
}

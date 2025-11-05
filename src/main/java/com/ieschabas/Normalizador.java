package com.ieschabas;

/**
 * Clase Normalizador donde el programa quitará los espacios anteriores al primer caracter y posterior del último
 * También devolverá el texto escrito en mayúsculas
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class Normalizador {
    public String normalizar(String texto) {
        /**
         * Establecemos los datos que tiene que comprobar el programa, si son correctos, devuelven el texto sin espacios anteriores y posteriores y en mayúsculas
         */
        try {
            return texto.toUpperCase().trim();
        }
        /**
         * Establecemos el criterio a seguir para el análisis de los datos, devolvemos el mensaje de error y ningún dato.
         */
        catch (NullPointerException error) {
            System.out.println("Texto nulo, santa Rita, Rita, lo que se da no se quita, no te devuelvo nada:");
            return "";
        }
    }
}

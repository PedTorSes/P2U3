package com.ieschabas;

/**
 * Clase CargadorClases en la que el programa va a analizar los datos introducidos por el usuario y va a comparar con una base de datos de clases de java si existe o no
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class CargadorClases {
    public boolean existeClase(String nombreClase) {
        /**
         * Establecemos la variable a analizar y devolvemos true en caso de que coincida con una clase existente
         */
        try {
            Class.forName(nombreClase);
            return true;
        }
        /**
         * Establecemos el criterio de análisis y devolvemos "false" más un mensaje de error en caso de que la clase introducida no exista
         */
        catch (ClassNotFoundException error) {
            System.out.println("Lo siento, seguramente será maravillosa la clase que estás buscando pero, lamentablemente, no se encuentra en la base de datos: " + error);
            return false;
        }
    }
}

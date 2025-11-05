package com.ieschabas;
/**
 * Clase Temporizador donde se comprueba que el sistema está durmiendo la cantidad de milisegundos que el usuario introduce
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

import java.util.Scanner;

public class Temporizador {
    /**
     * Establecemos los datos que tiene que comprobar que estén correctos
     * @param milisegundos
     * @return true + mensaje
     */
    public boolean dormir(long milisegundos) {
        try {
            Thread.sleep(milisegundos);
            System.out.println("Ha dormido " + milisegundos /1000 + " segundos");
            return true;
    }
        /**
         * Establecemos de qué manera queremos verificar los datos introducidos
         * En el caso de incumplirse, mostraría el mensaje de error y devolvería false
         */
        catch (InterruptedException error) {
            System.out.println("Se ha interrumpido el temporizador: " + error);
            return false;
        }
    }
}


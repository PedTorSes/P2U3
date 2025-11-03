package com.ieschabas;

/**
 *Clase ParserEntero donde el programa va a comprobar que introducimos un dato numérico
 */

public class ParserEntero {
    public Integer aEnteroSeguro(String numero) {
        /**
         * El programa va a comprobar el siguiente dato y lo va a devolver en el caso de ser correcto
         */
        try {
            int dato = Integer.parseInt(numero);
            return dato;
            /**
             * En el caso de que sea incorrecto el dato mostará los siguientes errores:
             * Formato erróneo en el caso de introducir un dato alfanumérico
             * Texto nulo en el caso de introducir "null"
             */
        } catch (NumberFormatException error ) {
            System.out.println("Error: formato inválido: " + error.getMessage());
            return null;
        } catch (NullPointerException error) {
            System.out.println("Error: Texto nulo: " + error.getMessage());
            return null;
        }
    }
}

package com.ieschabas;
/**
 * Clase ConversorFecha donde el programa realiza la comprobación entre el patrón y la fecha
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */
/**
 * Importamos las clases necesarias
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConversorFecha {
    /**
     * Establecemos el dato a comprobar
     * @param texto
     * @param patron
     * @return texto formateado
     */
    public java.util.Date parsear(String texto, String patron) {
        SimpleDateFormat formato = new SimpleDateFormat(patron);
        try {

        return formato.parse(texto);
            /**
             * Devolvemos el mensaje de error
             */
        } catch (ParseException error) {
            System.out.println("Lo siento, la fecha introducida no coincide con el patrón: "+ error);
            return null;

        }
    }
}

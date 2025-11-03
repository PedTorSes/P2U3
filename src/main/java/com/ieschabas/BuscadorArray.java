package com.ieschabas;

/**
 * Clase BuscadorArray donde realizamos la comprobación de datos que nos introduce el usuario desde el Main.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class BuscadorArray {
    /**
     * Establecemos las variables que queremos comprobar
     * @param lista
     * @param indice
     * @return valor de la lista
     */
    public String obtener(String[] lista, int indice) {
        try  {
            return lista[indice];
            /**
             * En caso de error, mostramos el siguiente mensasje.
             */
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Te pasaste, wey. Índice fuera de rango: " + error.getMessage());
            return null;
        }
    }
}

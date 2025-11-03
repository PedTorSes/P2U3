package com.ieschabas;

import java.util.Scanner;

/**
 * Vamos a preparar una calculadora segura en la cual tenemos que introducir dos números para dividirlos entre ellos.
 * Lo primero que vamos a comprobar es que los caracteres sean los correctos, solamente numéricos, no alfanuméricos.
 * Lo siguiente que comprobaremos es que no dividimos entre 0 porque no tendría sentido.
 * @author Pedro Enrique Torres Sesé
 * @version 1.0
 */

public class CalculadoraSegura {
    public double dividir(int numerador, int denominador) {
        /**
         * El programa va a analizar estas variables para ver si hay fallo
         */
        try {
            int division = numerador / denominador;
            return division;
            /**
             * Utiliza estos criterios para ver si hay fallo (que el denominador sea 0)
             */
        } catch (ArithmeticException e) {
            System.out.println("Ya te lo he dicho antes, el denominador (el segundo número que introduces) no puede ser 0, anda, cámbialo por favor");
            return Double.NaN;
        }
    }
}



package com.ieschabas;
/**
 * Vamos a mostrar diferentes errores que ocurren si no se cumplen los requisitos de los programas.
 * @author Pedro Torres Sesé
 * @version 1.0
 */
import java.util.Scanner;

public class CalculadoraSeguraMain {
    public static void main(String[] args) {
        //CalculadoraSeguraMain
        /**
         * Menú del programa y solicitud de datos al usuario
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a dividir dos números, recuerda que el denominador no puede ser 0");
        System.out.println("¿Qué número vas a elegir como numerador?");
        int numerador = scanner.nextInt();
        System.out.println("¿Cuál va a ser el denominador?");
        int denominador = scanner.nextInt();
        /**
         * Instancia a la clase CalculadoraSegura para realizar las comprobaciones
         */
        CalculadoraSegura calculadoraSegura = new CalculadoraSegura();
        calculadoraSegura.dividir(numerador, denominador);
        /**
         * Mostramos en pantalla los datos introducidos y el resultado o error
         */
        System.out.println("El numerador es:" + numerador);
        System.out.println("El denominador es: " + denominador);
        System.out.println("El resultado de la división es: " + calculadoraSegura.dividir(numerador, denominador));



    }

}
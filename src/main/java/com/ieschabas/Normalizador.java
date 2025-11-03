package com.ieschabas;

public class Normalizador {
    public String normalizar(String texto) {

        try {
            return texto.toUpperCase().trim();
        } catch (NullPointerException error) {
            System.out.println("Texto nulo, santa Rita, Rita, lo que se da no se quita, no te devuelvo nada:");
            return "";
        }
    }
}

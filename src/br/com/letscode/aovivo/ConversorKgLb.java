package br.com.letscode.aovivo;

public class ConversorKgLb {

    public static final float FATOR = 2.20462F;

    public static void main(String[] args) {
        int kg = 100;

        System.out.println(kg+"kg" + " são "+ (kg * FATOR) + "lb.");
    }
}

package br.com.letscode.aovivo;

import java.util.Scanner;

public class CalcMedia {
    public static void main(String[] args) {

        /*
        * Calcule a média aritmética de n valores a serem digitados.

Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.

Se o valor digitado for -1, seu programa deve efetuar o cálculo da média e imprimir na tela, com a quantidade de notas
digitadas

Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma.
        * */

        Scanner input = new Scanner(System.in);

        double contador = 0;
        double resultado = 0;
        double numero = 0;
        do {
            System.out.println("Informe uma nota de 0 a 10. Para sair do programa digite -1.");
            numero = input.nextDouble();

            if(numero > 10) {
                System.out.println("Nota invalida");
                return ;
            }
            if(numero == -1) {
                break;
            }
            resultado += numero;
            contador+=1;

        }while(numero != -1);

        System.out.println("O resultado da média é "+ (resultado / contador));
        input.close();
    }
}

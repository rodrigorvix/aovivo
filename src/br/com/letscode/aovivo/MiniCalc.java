package br.com.letscode.aovivo;

import java.util.Scanner;

public class MiniCalc {

    public static void main(String[] args) {
        /*
        * Realizar uma operação matemática, que deve ser passada
        * via System.in ( opções: + - / * ) entre dois números que
        * também devem ser solicitados via System.in
        * */

        Scanner input = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Digite um operador");
        String operator = input.nextLine();

        System.out.println("Digite um número");
        double n1 = input.nextDouble();

        System.out.println("Digite outro número");
        var n2 = input.nextDouble();

        switch (operator) {
            case "+": {
                resultado = n1 + n2;
                break;
            }
            case "-": {
                resultado = n1 - n2;
                break;
            }
            case "*": {
                resultado = n1 * n2;
                break;
            }
            case "/": {
                resultado = n1 / n2;
                break;
            }
            default:
                System.out.println("Erro");
                return;

        }
        System.out.println(resultado);
    }
}

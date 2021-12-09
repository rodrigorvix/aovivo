package br.com.letscode.aovivo;

import java.util.Scanner;

public class CalcNotas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double soma = 0;
        int quantidadeAlunos;
        double notas[];

        System.out.println("Informe a quantidade de alunos");
        quantidadeAlunos = input.nextInt();
        notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Informe a "+ (i + 1) +"º nota.");
            notas[i] = input.nextDouble();
        }

        for(Double nota : notas){
          soma+=nota;
        }

        System.out.println("A média das notas é : "+ (soma/notas.length));
        input.close();

    }
}

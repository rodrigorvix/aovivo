package br.com.letscode.aovivo;

import java.util.Scanner;

public class CalcTurmasMedia {
    public static void main(String[] args) {
        int quantidadeTurmas;
        int quantidadeAlunosTurma;
        double listaNotas[][];
        double mediaPorTurma[];
        double somaTurma = 0;
        double somaPorTurma = 0;
        double mediaTotal = 0;


        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de turmas:");
        quantidadeTurmas = input.nextInt();

        System.out.println("Informe a quantidade de alunos por turma:");
        quantidadeAlunosTurma = input.nextInt();

        listaNotas = new double[quantidadeTurmas][quantidadeAlunosTurma];
        mediaPorTurma = new double[quantidadeTurmas];

        for (int i = 0; i < quantidadeTurmas; i++) {
            for (int j = 0; j < quantidadeAlunosTurma; j++){
                System.out.println("Informe a "+ (j + 1) + "º nota da turma "+ (i +1));
                listaNotas[i][j] = input.nextDouble();
                mediaTotal += listaNotas[i][j];
                somaTurma += listaNotas[i][j];
            }
            mediaPorTurma[i] = somaTurma;
            somaTurma = 0;
        }

        System.out.println("A media de todas as turmas é "+ mediaTotal / (quantidadeTurmas * quantidadeAlunosTurma));

       for(int i = 0; i < mediaPorTurma.length; i++) {
           System.out.println("A media da turma é "+ (i +1) + " é: "+ (mediaPorTurma[i] /quantidadeAlunosTurma));
       }

       input.close();
    }
}

package edu.praticas.introducaopoo.aluno;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double notas[] = new double[3];
        double media;
        String nome;

        System.out.print("Nome do Aluno: ");
        nome = scan.nextLine();
        System.out.println("Notas do aluno:");
        for (int i = 0; i < 3; i++) {
            notas[i] = scan.nextDouble();
        }

        Aluno aluno = new Aluno(nome, notas);
        media = aluno.mediaDoAluno();

        if (media >= 60.0){
            System.out.format("NOTA FINAL: %.2f\n", media);
            System.out.println("Aprovado!");
        } else {
            System.out.format("NOTA FINAL: %.2f\n", media);
            System.out.println("Reprovado!");
            System.out.format("Faltaram %.2f pontos.", 60 - media);
        }

        scan.close();
    }
}

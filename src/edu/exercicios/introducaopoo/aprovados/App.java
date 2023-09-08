package edu.exercicios.introducaopoo.aprovados;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados: ");
        int n = sc.nextInt();

        Aluno[] alunos = new Aluno[n];
        String nomeDoAluno;
        float notaPrimeiroSemestre;
        float notaSegundoSemestre;

        for (int i = 0; i < alunos.length; i++) {
            sc.nextLine();
            System.out.printf("Dados do %d° aluno:\n", i+1);
            System.out.print("Nome: ");
            nomeDoAluno = sc.nextLine();
            System.out.print("Nota do 1° semestre: ");
            notaPrimeiroSemestre = sc.nextFloat();
            System.out.print("Nota do 2° semestre: ");
            notaSegundoSemestre = sc.nextFloat();
            alunos[i] = new Aluno(nomeDoAluno, notaPrimeiroSemestre, notaSegundoSemestre);
        }

        System.out.println("Alunos aprovados:");

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].mediaDoAluno() >= 6) {
                System.out.println(alunos[i].getNome());
            }
        }

        sc.close();

    }
}

package edu.exercicios.pensionato;

import java.util.Scanner;

public class App {
    private String nome;
    private String email;
    private int numeroDoQuarto;
    private Estudante[] estudante = new Estudante[10];

    public static void main(String[] args) {
        App app = new App();
        app.preecherArrayEstudante();
        app.imprimirRelatorioQuartosOcupados();
    }

    public void preecherArrayEstudante() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos estudantes vão alugar quarto? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d° aluguel:\n", i);
            System.out.print("Nome........: ");
            nome = sc.nextLine();
            System.out.print("E-mail......: ");
            email = sc.nextLine();
            System.out.print("N° do quarto: ");
            numeroDoQuarto = sc.nextInt();
            sc.nextLine();
            estudante[numeroDoQuarto] = new Estudante(nome, email, numeroDoQuarto);
        }
        sc.close();
    }

    public void imprimirRelatorioQuartosOcupados() {
        for (int i = 0; i < estudante.length; i++) {
            if (estudante[i] != null) {
                System.out.println(estudante[i]);
            }
        }
    }
}

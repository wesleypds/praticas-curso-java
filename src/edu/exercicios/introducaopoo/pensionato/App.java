package edu.exercicios.introducaopoo.pensionato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private List<Quarto> listQuartos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        App app = new App();
        app.cadastrarQuartos();
        app.preecherQuartos();
        app.imprimirRelatorioQuartosOcupados();
    }

    public void cadastrarQuartos() {
        System.out.print("Quantidade de quartos a serem criados: ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            listQuartos.add(new Quarto(i));
        }
    }

    public void preecherQuartos() {
        System.out.print("Quantos estudantes vão alugar quarto? ");
        int n = sc.nextInt();
        sc.nextLine();
        pularLinha();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d° aluguel:%n", i+1);
            System.out.print("Nome........: ");
            String nome = sc.nextLine();
            System.out.print("E-mail......: ");
            String email = sc.nextLine();
            System.out.print("N° do quarto: ");
            int numeroDoQuarto = sc.nextInt();
            sc.nextLine();
            Estudante estudante = new Estudante(nome, email);
            listQuartos.get(numeroDoQuarto).setEstudante(estudante);
            listQuartos.get(numeroDoQuarto).setOcupado(true);
            pularLinha();
        }
        sc.close();
    }

    public void imprimirRelatorioQuartosOcupados() {
        System.out.println("Quartos alugados:");
        for (Quarto quarto : listQuartos) {
            if (Boolean.TRUE.equals(quarto.getOcupado())) {
                System.out.println(quarto);
            }
        }
    }

    public void pularLinha() {
        System.out.println();
    }
}

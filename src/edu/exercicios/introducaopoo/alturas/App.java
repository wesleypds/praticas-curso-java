package edu.exercicios.introducaopoo.alturas;

import java.util.Scanner;

public class App {
    private String nome;
    private int idade;
    private float altura;
    private Pessoa[] pessoa;
    private float somaAltura = 0;
    private int contadorMenorDe16 = 0;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.preencherArrayPessoa();
        app.imprimirInformacoesGerais();
    }

    public void preencherArrayPessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        pessoa = new Pessoa[n];
        for (int i = 0; i < pessoa.length; i++) {
            System.out.printf("Dados da %d pessoa:\n", i+1);
            sc.nextLine();
            System.out.print("Nome..: ");
            nome = sc.nextLine();
            System.out.print("Idade.: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextFloat();
            pessoa[i] = new Pessoa(nome, idade, altura);
            somaAltura += altura;
        }
        sc.close();
    }

    public void imprimirInformacoesGerais() {
        System.out.printf("\nAltura media: %.2f\n", somaAltura / pessoa.length);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                contadorMenorDe16++;
            }
        }
        if (contadorMenorDe16 > 0) {
            System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", contadorMenorDe16 * 100.0 / pessoa.length);
            for (int i = 0; i < pessoa.length; i++) {
                if (pessoa[i].getIdade() < 16) {
                    System.out.println(pessoa[i].getNome());
                }
            }
        } else {
            System.out.println("Todos são maiores de idade.");
        }
    }
}

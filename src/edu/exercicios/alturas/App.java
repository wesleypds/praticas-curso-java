package edu.exercicios.alturas;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        int contadorMenorDe16 = 0;
        float altura;
        float somaAltura = 0;

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

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

        System.out.printf("\nAltura media: %.2f\n", somaAltura / pessoa.length);

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                contadorMenorDe16++;
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %d%%\n", contadorMenorDe16 * 100 / pessoa.length);

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getNome());
            }
        }

        sc.close();

    }
}

package edu.praticas.introducaojava.maiorposicao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        int maiorNumero;
        int indice = 0;

        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        maiorNumero = vetor[indice];

        for (int i = 1; i < vetor.length; i++) {
            if (maiorNumero < vetor[i]) {
                maiorNumero = vetor[i];
                indice = i;
            }
        }

        System.out.println("\nMAIOR VALOR: " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR: " + indice);

        sc.close();
    }
}

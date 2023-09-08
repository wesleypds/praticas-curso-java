package edu.exercicios.introducaojava.mediapares;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros o vetor vai ter: ");
        int n = sc.nextInt();

        int[] vetor = new int[n];
        int soma = 0;
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contador++;
            }
        }

        if (soma != 0) {
            System.out.println("MEDIA DOS NUMEROS PARES: " + soma/contador);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();

    }
}

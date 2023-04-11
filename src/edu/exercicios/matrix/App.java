package edu.exercicios.matrix;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("-> ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int qtdNumNegativos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("-> ");
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] < 0) {
                    qtdNumNegativos++;
                }
            }
        }
        System.out.println("\nDiagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + ", ");
        }
        System.out.println("\n\nQuantidade de números negativos: " + qtdNumNegativos);
        sc.close();
    }
}

package edu.exercicios.introducaojava.desafiomatriz;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x;
        int[][] mat = new int[m][n];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        x = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.printf("Posicao: %d, %d\n", i, j);
                    if (j > 0) {
                        m = i;
                        n = j;
                        System.out.printf("Esquerda: %d\n", mat[m][--n]);
                    }
                    if (j < mat[i].length-1) {
                        m = i;
                        n = j;
                        System.out.printf("Direita: %d\n", mat[m][++n]);
                    }
                    if (i > 0) {
                        m = i;
                        n = j;
                        System.out.printf("Cima: %d\n", mat[--m][n]);
                    }
                    if (i < mat.length-1) {
                        m = i;
                        n = j;
                        System.out.printf("Baixo: %d\n", mat[++m][n]);
                    }
                }
            }
        }
        sc.close();
    }
}

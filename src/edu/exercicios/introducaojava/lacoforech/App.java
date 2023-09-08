package edu.exercicios.introducaojava.lacoforech;

public class App {
    public static void main(String[] args) {
        String[] vetor = new String[] {"Wesley", "Camila", "Neusa"};
        System.out.println("\nLaço for normal:\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("\nLaço forech:\n");
        for (String nome : vetor) {
            System.out.println(nome);
        }
        System.out.println("");
    }
}

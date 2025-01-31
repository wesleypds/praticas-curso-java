package edu.praticas.tratamentoexcecoes.blocofinally.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String uri = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios\\exercicios-java-curso\\src\\edu\\exercicios\\tratamentoexcecoes\\blocofinally\\arquivo\\arquivo.txt";
        File arquivo = new File(uri);
        Scanner sc = null;

        try {
            sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir arquivo: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }
}

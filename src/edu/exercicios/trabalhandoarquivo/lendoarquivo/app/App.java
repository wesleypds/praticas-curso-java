package edu.exercicios.trabalhandoarquivo.lendoarquivo.app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\trabalhandoarquivo\\arquivos\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}

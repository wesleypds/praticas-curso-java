package edu.exercicios.trabalhandoarquivo.filewriterbufferedwriter.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\trabalhandoarquivo\\arquivos\\out.txt";

        String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // Subscreve o arquivo
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // Escreve no final do arquivo
            
            bw.write("Boa madrugada");
            bw.newLine();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

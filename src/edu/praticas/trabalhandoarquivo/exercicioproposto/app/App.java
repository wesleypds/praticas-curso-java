package edu.praticas.trabalhandoarquivo.exercicioproposto.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\trabalhandoarquivo\\arquivos\\source.csv";
        List<String> vect = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                vect.add(splitString(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File(path);
        String sourcePath = file.getParent();
        boolean success = new File(sourcePath + "\\out").mkdir();

        if (success) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(sourcePath + "\\out\\summary.csv"))) {
                for (String string : vect) {
                    bw.write(string);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }

    public static String splitString(String line) {
        String[] palavras = line.split(",");
        double sum = Double.parseDouble(palavras[1]) * Double.parseDouble(palavras[2]);
        return palavras[0] + "," + sum;
    }
}

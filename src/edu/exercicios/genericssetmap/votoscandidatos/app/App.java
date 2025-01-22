package edu.exercicios.genericssetmap.votoscandidatos.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\genericssetmap\\votoscandidatos\\arquivos\\votos.csv";

        Map<String, Integer> candidatos = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] palavras = line.split(",");
                if (candidatos.containsKey(palavras[0])) {
                    candidatos.put(palavras[0], Integer.parseInt(palavras[1]) + candidatos.get(palavras[0]));
                } else {
                    candidatos.put(palavras[0], Integer.parseInt(palavras[1]));
                }
                line = br.readLine();
            }

            for (String candidato : candidatos.keySet()) {
                System.err.println(candidato + ": " + candidatos.get(candidato));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

package edu.praticas.genericssetmap.registrodelog.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

import edu.praticas.genericssetmap.registrodelog.models.Usuario;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\genericssetmap\\registrodelog\\arquivos\\usuarios.txt";

        Set<Usuario> usuarios = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] palavras = line.split(" ");
                usuarios.add(new Usuario(palavras[0], ZonedDateTime.parse(palavras[1])));
                line = br.readLine();
            }

            System.err.println("Total de usuários: " + usuarios.size());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

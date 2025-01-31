package edu.praticas.interfacespoo.interfacecomparable.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.praticas.interfacespoo.interfacecomparable.model.Funcionario;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\interfacespoo\\interfacecomparable\\arquivo\\lista.txt";

        String path2 = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\interfacespoo\\interfacecomparable\\arquivo\\funcionarios.csv";

        List<String> nomes = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("****************************************************");
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                nomes.add(line);
                line = br.readLine();
            }
            Collections.sort(nomes);
            for (String nome : nomes) {
                System.out.println(nome);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("****************************************************");
        try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
            String line = br.readLine();
            while (line != null) {
                String[] palavras = line.split(",");
                funcionarios.add(new Funcionario(palavras[0], Double.parseDouble(palavras[1])));
                line = br.readLine();
            }
            Collections.sort(funcionarios);
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getNome() + ", " + funcionario.getSalario());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

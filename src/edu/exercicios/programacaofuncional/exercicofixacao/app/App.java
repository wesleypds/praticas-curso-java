package edu.exercicios.programacaofuncional.exercicofixacao.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import edu.exercicios.programacaofuncional.exercicofixacao.models.Funcionario;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\programacaofuncional\\exercicofixacao\\arquivos\\funcionarios.csv";
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Funcionario> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] palavras = line.split(",");
                list.add(new Funcionario(palavras[0], palavras[1], Double.parseDouble(palavras[2])));
                line = br.readLine();
            }

            System.err.print("Digite um valor: ");
            double valorDigitado = sc.nextDouble();

            Comparator<String> comp = (str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());

            List<String> emails = list.stream()
                                    .filter(f -> f.getSalario() > valorDigitado)
                                    .map(f -> f.getEmail())
                                    .sorted(comp)
                                    .collect(Collectors.toList());

            emails.forEach(System.out::println);

            double soma = list.stream()
                            .filter(p -> p.getNome().charAt(0) == 'M')
                            .map(p -> p.getSalario())
                            .reduce(0.0, (x, y) -> x + y);

            System.err.println("Soma: " + soma);
        } catch (Exception e) {
            // TODO: handle exception
        }
        sc.close();
    }
}

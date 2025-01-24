package edu.exercicios.programacaofuncional.pipelinedemo.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.exercicios.programacaofuncional.pipelinedemo.models.Produto;

public class App {
    public static void main(String[] args) {
        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\programacaofuncional\\pipelinedemo\\arquivos\\produtos.csv";

        List<Produto> produtos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(",");
                produtos.add(new Produto(valores[0], Double.parseDouble(valores[1])));
                line = br.readLine();
            }
            
            double media = produtos.stream()
                                .map(p -> p.getPreco())
                                .reduce(0.0, (x, y) -> x + y) / produtos.size();

            System.err.println("Preço médio: " + String.format("%.2f", media));

            Comparator<String> comp = (str1, str2) -> str1.toUpperCase().compareTo(str2.toUpperCase());

            List<String> nomes = produtos.stream()
                                .filter(p -> p.getPreco() < media)
                                .map(p -> p.getNome())
                                .sorted(comp.reversed()).collect(Collectors.toList());

            nomes.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

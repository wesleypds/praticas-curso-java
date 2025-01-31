package edu.praticas.genericssetmap.genericodelimitado.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import edu.praticas.genericssetmap.genericodelimitado.model.Produto;
import edu.praticas.genericssetmap.genericodelimitado.services.CalculoService;

public class App {
    public static void main(String[] args) {

        String path = "C:\\Workspace\\Cursos\\Curso Java\\Exercicios-vscode\\exercicios-java-curso\\src\\edu\\exercicios\\genericssetmap\\genericodelimitado\\arquivos\\produtos.csv";

        List<Produto> produtos = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] valores = line.split(",");
                produtos.add(new Produto(valores[0], Double.parseDouble(valores[1])));
                line = br.readLine();
            }

            Produto p = CalculoService.max(produtos);
            System.out.println("Maior valor: ");
            System.out.println(String.format("%s, %.2f", p.getNome(), p.getPreco()));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }
}

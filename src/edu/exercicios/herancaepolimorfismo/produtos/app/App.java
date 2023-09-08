package edu.exercicios.herancaepolimorfismo.produtos.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import edu.exercicios.herancaepolimorfismo.produtos.model.Produto;
import edu.exercicios.herancaepolimorfismo.produtos.model.ProdutoImportado;
import edu.exercicios.herancaepolimorfismo.produtos.model.ProdutoUsado;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        List<Produto> listProdutos = new ArrayList<>();
        System.out.print("Quantidade de produtos: ");
        Integer qtdProdutos = sc.nextInt();
        for (int i = 0; i < qtdProdutos; i++) {
            sc.nextLine();
            System.out.printf("Dados do %d° poduto:\n", i+1);
            System.out.print("Produto: Novo, Usado, Importado (n/u/i)? ");
            Character opcao = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            Double preco = sc.nextDouble();
            switch (opcao) {
                case 'n':
                    Produto produto = new Produto(nome, preco);
                    listProdutos.add(produto);
                    break;
                case 'u':
                    sc.nextLine();
                    System.out.print("Data de fabricação (DD/MM/AAAA): ");
                    Date dataFabricacao = dataFormatada.parse(sc.nextLine());
                    Produto produto2 = new ProdutoUsado(nome, preco, dataFabricacao);
                    listProdutos.add(produto2);
                    break;
                case 'i':
                    System.out.print("Taxa de importação: ");
                    Double taxaImport = sc.nextDouble();
                    Produto produto3 = new ProdutoImportado(nome, preco, taxaImport);
                    listProdutos.add(produto3);
                    break;
                default:
                    break;
            }
        }
        System.out.println("\nETIQUETAS DE PREÇOS:");
        for (Produto produto : listProdutos) {
            System.out.println(produto.etiquetaDePreco());
        }
        sc.close();
    }
}

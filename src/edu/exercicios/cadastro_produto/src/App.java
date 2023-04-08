package edu.exercicios.cadastro_produto.src;

import java.util.Scanner;

import edu.exercicios.cadastro_produto.src.entities.Produto;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Produto produto1;
        String nomeProduto;
        int quantidadeProduto;
        double precoProduto;
        int opcao = 1;

        System.out.println("=== Cadastre o produto ===");
        System.out.print("Nome do produto......: ");
        nomeProduto = scan.nextLine();
        System.out.print("Preço do produto.....: ");
        precoProduto = scan.nextDouble();
        // Inicializando o objeto produto1
        produto1 = new Produto(nomeProduto, precoProduto);

        while (opcao != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Imprimir dados");
            System.out.println("0 - Sair");
            System.out.print("--> ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("=== Adicionar produto ===");
                    System.out.print("Quantidade do produto: ");
                    quantidadeProduto = scan.nextInt();
                    produto1.addProduto(quantidadeProduto);
                    break;
                case 2:
                    System.out.println("=== Remover produto ===");
                    System.out.print("Quantidade do produto: ");
                    quantidadeProduto = scan.nextInt();
                    produto1.removerProduto(quantidadeProduto);
                    break;
                case 3:
                    System.out.println(produto1.toString()); 
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        scan.close();
    }
}

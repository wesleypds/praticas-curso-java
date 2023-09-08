package edu.exercicios.pedido.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import edu.exercicios.pedido.enums.StatusPedido;
import edu.exercicios.pedido.model.Cliente;
import edu.exercicios.pedido.model.ItemPedido;
import edu.exercicios.pedido.model.Pedido;
import edu.exercicios.pedido.model.Produto;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        Date dataNascimento = dataFormatada.parse(sc.nextLine());
        Cliente cliente = new Cliente(nome, email, dataNascimento);
        System.out.println("Qual a situação do pedido?");
        System.out.println("1 - Pagamento pendente");
        System.out.println("2 - Processando");
        System.out.println("3 - Enviado");
        System.out.println("4 - Entregue");
        System.out.print("--> ");
        Integer opcao = sc.nextInt();
        StatusPedido status = null;
        switch (opcao) {
            case 1:
                status = StatusPedido.PAGAMENTO_PENDENTE;
                break;
            case 2:
                status = StatusPedido.PROCESSANDO;
                break;
            case 3:
                status = StatusPedido.ENVIADO;
                break;
            case 4:
                status = StatusPedido.ENTREGUE;
                break;
            default:
                System.out.println("Opção incorreta!");
                break;
        }
        Pedido pedido = new Pedido(new Date(), status, cliente);
        System.out.print("Quantos itens tem no pedido? ");
        Integer quantidadeItens = sc.nextInt();
        for (int i = 0; i < quantidadeItens; i++) {
            sc.nextLine();
            System.out.printf("Dados do %d° item:\n", (i + 1));
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            Double precoProduto = sc.nextDouble();
            System.out.print("Quantidade: ");
            Integer quantidadeProduto = sc.nextInt();
            Produto produto = new Produto(nomeProduto, precoProduto);
            ItemPedido itemPedido = new ItemPedido(quantidadeProduto, produto.getPreco());
            itemPedido.setProduto(produto);
            pedido.addItem(itemPedido);
        }
        SimpleDateFormat dataFormatadaMomentoPedido = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("\nHISTÓRICO DO PEDIDO");
        System.out.print("Momento do pedido: " + dataFormatadaMomentoPedido.format(pedido.getMomento()));
        System.out.print("\nStatus do pedido: " + pedido.getStatusPedido());
        System.out.print("\nCliente: " + pedido.getCliente());
        System.out.println("\nItens do pedido:");
        List<ItemPedido> listItemPedidos = pedido.getListItemPedidos();
        for (ItemPedido itemPedido : listItemPedidos) {
            System.out.println(itemPedido);
        }
        System.out.println("Preço total: " + String.format("%.2f", pedido.total()));
        sc.close();
    }
}

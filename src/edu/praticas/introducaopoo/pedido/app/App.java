package edu.praticas.introducaopoo.pedido.app;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import edu.praticas.introducaopoo.pedido.enums.StatusPedido;
import edu.praticas.introducaopoo.pedido.model.Cliente;
import edu.praticas.introducaopoo.pedido.model.ItemPedido;
import edu.praticas.introducaopoo.pedido.model.Pedido;
import edu.praticas.introducaopoo.pedido.model.Produto;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dataFormatadaCliente = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dataFormatadaPedido = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/AAAA): ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), dataFormatadaCliente);
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
        Pedido pedido = new Pedido(LocalDateTime.parse(LocalDateTime.now().format(dataFormatadaPedido), dataFormatadaPedido), status, cliente);
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
        System.out.println("\nHISTÓRICO DO PEDIDO");
        System.out.print("Momento do pedido: " + pedido.getMomento());
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

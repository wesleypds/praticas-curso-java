package edu.exercicios.introducaopoo.pedido.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import edu.exercicios.introducaopoo.pedido.enums.StatusPedido;

public class Pedido {
    private LocalDateTime momento;
    private StatusPedido statusPedido;
    private List<ItemPedido> listItemPedidos = new ArrayList<>();
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(LocalDateTime momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItemPedido itemPedido) {
        listItemPedidos.add(itemPedido);
    }

    public void removeItem(ItemPedido itemPedido) {
        listItemPedidos.remove(itemPedido);
    }

    public List<ItemPedido> getListItemPedidos() {
        return listItemPedidos;
    }

    public Double total() {
        Double total = 0.0;
        for (ItemPedido itemPedido : listItemPedidos) {
            total += itemPedido.subTotal();
        }
        return total;
    }
}

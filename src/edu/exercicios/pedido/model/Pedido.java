package edu.exercicios.pedido.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.exercicios.pedido.enums.StatusPedido;

public class Pedido {
    private Date momento;
    private StatusPedido statusPedido;
    private List<ItemPedido> listItemPedidos = new ArrayList<>();
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(Date momento, StatusPedido statusPedido, Cliente cliente) {
        this.momento = momento;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
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

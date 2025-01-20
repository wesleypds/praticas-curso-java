package edu.exercicios.genericssetmap.printservicecomlistapadrao.model;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
    List<Integer> list = new ArrayList<>();

    public void addValor(Integer valor) {
        list.add(valor);
    }

    public Integer primeiro() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void imprimir() {
        System.out.print("[");
        if (!list.isEmpty()) {
            System.out.print(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                System.out.print(", " + list.get(i));
            }
        }
        System.out.println("]");
    }
}

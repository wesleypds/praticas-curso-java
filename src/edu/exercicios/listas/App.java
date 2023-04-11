package edu.exercicios.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        // Usando add para adicionar elementos
        System.out.println("-----------------------------------------------");
        listNames.add("Wesley");
        listNames.add("Camila");
        listNames.add("Cristiano Ronaldo");
        listNames.add("Neusa");
        listNames.add("Edson");
        listNames.add("Marie");
        listNames.add("Maria");
        for (String names : listNames) {
            System.out.println(names);
        }
        // Usando remove para remover elementos
        System.out.println("-----------------------------------------------");
        listNames.remove("Wesley");
        for (String names : listNames) {
            System.out.println(names);
        }
        // Usando size para retornar o tamanho da lista
        System.out.println("-----------------------------------------------");
        System.out.println("Tamanho da lista: " + listNames.size());
        // Usando add(index, elemento) para adicionar um elemento em um index
        System.out.println("-----------------------------------------------");
        listNames.add(2, "Wesley");
        for (String names : listNames) {
            System.out.println(names);
        }
        /* 
         * Usando removeIf(elemento -> elemento.charAt(0) == 'caracter') para 
         * remover elementos com um determinado caracter 
        */
        System.out.println("-----------------------------------------------");
        listNames.removeIf(nome -> nome.charAt(0) == 'M');
        for (String names : listNames) {
            System.out.println(names);
        }
        // Usando indexOf para retornar a posição de um elemento
        System.out.println("-----------------------------------------------");
        System.out.println("Posição de Neusa: " + listNames.indexOf("Neusa"));
        /* 
         * Operação usada para remover todos elementos de uma lista exceto
         * os elementos com um determinado caracter
        */
        System.out.println("-----------------------------------------------");
        List<String> result = listNames.stream().filter(nome -> nome.charAt(0) == 'C').collect(Collectors.toList());
        for (String names : result) {
            System.out.println(names);
        }
        /*
         * Operação para retornar o primeiro elemento de uma lista que tenha um 
         * determinado caracter
         */
        System.out.println("-----------------------------------------------");
        String name = listNames.stream().filter(nome -> nome.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(name);
    }
}

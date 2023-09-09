package edu.exercicios.classesemetodosabstratos.formasdefiguras.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.exercicios.classesemetodosabstratos.formasdefiguras.enums.Cor;
import edu.exercicios.classesemetodosabstratos.formasdefiguras.model.Circulo;
import edu.exercicios.classesemetodosabstratos.formasdefiguras.model.Forma;
import edu.exercicios.classesemetodosabstratos.formasdefiguras.model.Retangulo;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Forma> listFormas = new ArrayList<>();
        System.out.print("Quantidade de formas: ");
        int qtdFormas = sc.nextInt();
        for (int i = 0; i < qtdFormas; i++) {
            System.out.printf("Dados da %d° forma:\n", i + 1);
            System.out.print("Rentângulo ou Circulo (r/c)? ");
            char opForma = sc.next().charAt(0);
            System.out.print("Cor (p - preto/ a - azul/ v - vermelho): ");
            char opCor = sc.next().charAt(0);
            Cor cor = null;
            switch (opCor) {
                case 'p':
                    cor = Cor.PRETO;
                    break;
                case 'a':
                    cor = Cor.AZUL;
                    break;
                case 'v':
                    cor = Cor.VERMELHO;
                    break;
                default:
                    break;
            }
            if (opForma == 'r') {
                System.out.print("Largura: ");
                double largura = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                Forma retangulo = new Retangulo(cor, largura, altura);
                listFormas.add(retangulo);
            } else {
                System.out.print("Raio: ");
                double raio = sc.nextDouble();
                Forma circulo = new Circulo(cor, raio);
                listFormas.add(circulo);
            }
        }
        System.out.println("\nÁREAS DAS FORMAS:");
        for (Forma forma : listFormas) {
            System.out.println(String.format("%.2f", forma.area()));
        }
        sc.close();
    }
}

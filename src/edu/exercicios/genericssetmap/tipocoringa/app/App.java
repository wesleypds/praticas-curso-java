package edu.exercicios.genericssetmap.tipocoringa.app;

import java.util.ArrayList;
import java.util.List;

import edu.exercicios.genericssetmap.tipocoringa.interfaces.Forma;
import edu.exercicios.genericssetmap.tipocoringa.models.Circulo;
import edu.exercicios.genericssetmap.tipocoringa.models.Retangulo;

public class App {
    public static void main(String[] args) {
        
        List<Forma> formas = new ArrayList<>();
        formas.add(new Retangulo(3.0, 2.0));
        formas.add(new Circulo(2.0));

        System.out.println("Área Total: " + String.format("%.2f", areaTotal(formas)));
    }

    public static double areaTotal(List<? extends Forma> formas) {
        double soma = 0.0;
        for (Forma forma : formas) {
            soma += forma.area();
        }
        return soma;
    }
}

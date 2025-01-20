package edu.exercicios.genericssetmap.tipocoringadelimitado.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1, 2, 3, 4);
        List<Double> listDouble = Arrays.asList(3.14, 6.28);
        List<Object> listObject = new ArrayList<>();

        copy(listInt, listObject);
        copy(listDouble, listObject);
        print(listObject);
    }

    public static void copy(List<? extends Number> source, List<? super Object> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }

    public static void print(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
    }
}

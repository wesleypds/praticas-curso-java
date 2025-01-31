package edu.praticas.introducaojava.boxingunboxing;

public class App {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x;
        System.out.println("obj: " + obj);
        int y = (int) obj;
        System.out.println("y: " + y);
    }
}

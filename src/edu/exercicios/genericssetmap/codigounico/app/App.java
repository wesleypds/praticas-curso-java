package edu.exercicios.genericssetmap.codigounico.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import edu.exercicios.genericssetmap.codigounico.Usuario;

public class App {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Set<Usuario> usuarios = new HashSet<>();

        System.out.print("Quantos alunos do curso A: ");
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            usuarios.add(new Usuario(sc.nextInt()));
        }

        System.out.print("Quantos alunos do curso B: ");
        int b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            usuarios.add(new Usuario(sc.nextInt()));
        }

        System.out.print("Quantos alunos do curso C: ");
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            usuarios.add(new Usuario(sc.nextInt()));
        }

        System.err.println();

        System.err.println("Total de alunos: " + usuarios.size());

        sc.close();
    }
}

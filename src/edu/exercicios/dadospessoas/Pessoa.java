package edu.exercicios.dadospessoas;

public class Pessoa {
    private float altura;
    private char sexo;
    
    public Pessoa(float altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public char getSexo() {
        return sexo;
    }
}

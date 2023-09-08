package edu.exercicios.introducaopoo.dadospessoas;

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

    @Override
    public String toString() {
        return "Altura: " + altura + ", Sexo: " + sexo;
    }
}

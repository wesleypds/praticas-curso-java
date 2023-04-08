package edu.exercicios.convertermoeda;

public class CurrecyConverter {
    
    private static final double IOF = 0.06;

    public static double dolarConvertido(double dolarPreco, double dolar){
        return (dolar * IOF + dolar) * dolarPreco;
    }
    
}

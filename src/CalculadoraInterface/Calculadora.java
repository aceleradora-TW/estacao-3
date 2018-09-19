package CalculadoraInterface;

public class Calculadora implements Operacoes{
    public void soma(double n1, double n2){
        System.out.println("Resultado: " + (n1 + n2));
    }

    public void subtracao(double n1, double n2){
        System.out.println("Resultado: " + (n1 - n2));
    }

    public void multiplicacao(double n1, double n2){
        System.out.println("Resultado: " + (n1 * n2));
    }

    public void divisao(double n1, double n2){
        System.out.println("Resultado: " + (n1 / n2));
    }
}
package CalculadoraInterface;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        int opcao;

        menu();
        while((opcao = ler.nextInt()) != 0){
            switch(opcao){
                case 1: System.out.println("Somando...\nDigite dois números:");
                        calc.soma(ler.nextDouble(), ler.nextDouble());
                break;
                case 2: System.out.println("Dividindo...\nDigite dois números:");
                        calc.subtracao(ler.nextDouble(), ler.nextDouble());
                break;
                case 3: System.out.println("Multiplicando...\nDigite dois números:");
                        calc.multiplicacao(ler.nextDouble(), ler.nextDouble());
                break;
                case 4: System.out.println("Dividindo...\nDigite dois números:");
                        calc.divisao(ler.nextDouble(), ler.nextDouble());
                break;
                default: System.out.println("Opcão inválida!");
            }
            menu();
        }
    }

    public static void menu(){
        System.out.println("\nEscolha uma opção:" +
                "\n1- Somar" +
                "\n2- Subtrair" +
                "\n3- Multiplicar" +
                "\n4- Dividir" +
                "\n0- Sair");
    }
}
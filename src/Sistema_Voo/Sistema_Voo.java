package Sistema_Voo;

import java.util.Scanner;

public class Sistema_Voo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        FiltroDeVoos fv = new FiltroDeVoos();
        int opcao;
        msg();
        
        while((opcao = ler.nextInt())!=0){
            switch(opcao){
                case 1: System.out.println("Digite aeroporto de origem:");
                        System.out.println(fv.saindoDe(ler.next()));
                break;
                case 2: System.out.println("Digite aeroporto de destino:");
                        System.out.println(fv.chegandoEm(ler.next()));
                break;
                case 3: System.out.println("Digite o modelo de avião:");
                        System.out.println(fv.chegandoEm(ler.next()));
                break;
                default: System.out.println("Opção inválida!");
            }
            msg();
        }               
    }

    public static void msg(){
        System.out.println("\nDigite sua opção\n"
                + "1- Voos de origem\n"
                + "2- Voos de destino\n"
                + "3- Modelos de aviões\n"
                + "0-sair");
    }
}

package NumeroCartao;

public class TesteValidadorCartaoDeCredito {

    public static void main(String[] args) {

//        if(ValidadorCartaoDeCredito.ehValido("8273 1232 7352 0569")){

        if(ValidadorCartaoDeCredito.ehValido("4539 1488 0343 6467")){
            System.out.println("É VÁLIDO!");
        }else{
            System.out.println("É INVÁLIDO!");
        }
    }
}
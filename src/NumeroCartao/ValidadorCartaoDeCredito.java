package NumeroCartao;

public class ValidadorCartaoDeCredito {

    public static boolean ehValido(String numero) throws Exception {
        int soma = 0;

        numero = numero.replace(" ", "");

        if(numero.matches("[0-9]")){
            throw new Exception("CONTEM STRING");
        }

        for (int i=0; i<numero.length(); i++){

            int valor = Integer.valueOf(numero.substring(i,i+1));

            if(i%2 == 0){
                valor *=  2;

                if(valor > 9){
                    valor-= 9;
                }
            }

            soma += valor;
        }

        if(soma%10 == 0){
            return true;
        }

        return false;
    }
}
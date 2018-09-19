package NumeroCartao;
import java.util.Arrays;
import java.util.Collections;

public class ValidadorCartaoDeCredito {

    public static boolean ehValido(String numero) {
        int soma = 0;

        String tiraEspaco[] = numero.split(" ");
        String juntaSemEspaco = "";

        for(int i=0; i<tiraEspaco.length; i++){
            juntaSemEspaco += tiraEspaco[i];
        }

        String cadaPosicaoArray[] = juntaSemEspaco.split("");
        int arrayIntInvertido[] = new int[cadaPosicaoArray.length];


        for(int i=0; i<cadaPosicaoArray.length; i++){

            try{
                Integer.parseInt(cadaPosicaoArray[i]);
            }
            catch (Exception e){
                System.out.println(cadaPosicaoArray[i] + " -> NÃO É NÚMERO!");
                System.exit(i);
            }
            arrayIntInvertido[i] = Integer.parseInt(cadaPosicaoArray[i]);

        }

        Collections.reverse(Arrays.asList(arrayIntInvertido));

        for (int i = 0; i< arrayIntInvertido.length; i++){
            if(i%2 == 0){
                arrayIntInvertido[i] = arrayIntInvertido[i]*2;
                if(arrayIntInvertido[i]>9){
                    arrayIntInvertido[i] -= 9;
                }
            }
            soma += arrayIntInvertido[i];
        }

        if(soma%10 == 0){
            return true;
        }

        return false;
    }
}
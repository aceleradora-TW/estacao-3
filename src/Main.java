import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Voo> voos;
        voos = new ArrayList<>();
        Voo v = new  Voo("poa", "seila", 80,"rio de janeiro");
        Voo e = new  Voo("natal", "bla", 180,"poa");
        Voo p = new  Voo("PE", "ish", 280,"NY");
        voos.add(v);
        voos.add(e);
        voos.add(p);

        for( int i=0; i<voos.size(); i++){

            Voo umVoo = voos.get(i);
            String origem = umVoo.getOrigem();
            System.out.print(origem +" ");
            String destino = umVoo.getDestino();
            System.out.println(destino);
        }




    }
}

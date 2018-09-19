package Sistema_Voo;

import java.util.ArrayList;
import java.util.List;

public class FiltroDeVoos {
    public List<Voo> saindoDe(String recebe){
        List<Voo> aeroSaida = new ArrayList<>();
        for(Voo v: retornaLista()){
            if(v.getOrigem().equals(recebe)){
                aeroSaida.add(v);
            }
        }
        return aeroSaida;
    }
    
    public List<Voo> chegandoEm(String recebe){
        List<Voo> aeroChegada = new ArrayList<>(); 
        for(Voo v: retornaLista()){
            if(v.getDestino().equals(recebe)){
                aeroChegada.add(v);
            }
        }
        return aeroChegada;
    }
    
    public List<Voo> operadoPor(String recebe){
        List<Voo> operaEqui = new ArrayList<>();
        for(Voo v: retornaLista()){
            if(v.getEquipamento().equals(recebe)){
                operaEqui.add(v);
            }
        }
        return operaEqui;
    }
    
    public List<Voo> retornaLista(){
        List<Voo> voos = new ArrayList<>();
        voos.add(new Voo("rio", "nyk", "A300", 360));
        voos.add(new Voo("poa", "amz", "A315", 89));
        voos.add(new Voo("xin", "poa", "A319", 498));
//        voos.add(new Voo("poa", "bho", "A400M", 63));
//        voos.add(new Voo("spl", "amz", "A300", 360));
        return voos;
    }
}

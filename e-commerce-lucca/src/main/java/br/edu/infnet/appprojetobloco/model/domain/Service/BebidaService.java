package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appprojetobloco.model.domain.Bebida;

@Service
public class BebidaService {

    private Map<Integer, Bebida> mapa = new HashMap<>();

    public void  incluir( Bebida bebida){

        mapa.put(bebida.getCodigoDeBarras(), bebida);
    }

    public Collection<Bebida> obterLista(){
       return  mapa.values();
    }
}

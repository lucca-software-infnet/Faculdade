package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import br.edu.infnet.appprojetobloco.model.domain.Comida;

@Service
public class ComidaService {
    
    private Map<Integer, Comida> mapa = new HashMap<>();

    public void  incluir( Comida bebida){

        mapa.put(bebida.getCodigoDeBarras(), bebida);
    }

    public Collection<Comida> obterLista(){
       return  mapa.values();
    }
}

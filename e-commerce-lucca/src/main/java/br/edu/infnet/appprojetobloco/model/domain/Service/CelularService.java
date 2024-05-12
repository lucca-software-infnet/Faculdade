package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appprojetobloco.model.domain.Celular;


@Service
public class CelularService {
    
    private Map<Integer, Celular> mapa = new HashMap<>();

    public void  incluir( Celular celular){

        mapa.put(celular.getCodigoDeBarras(), celular);
    }

    public Collection<Celular> obterLista(){
       return  mapa.values();
    }

}

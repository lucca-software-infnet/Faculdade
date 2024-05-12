package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appprojetobloco.model.domain.Solicitante;


@Service
public class SolicitanteService {
    

    private Map<String, Solicitante> mapa = new HashMap<String, Solicitante>();

    public  void  incluir( Solicitante solicitante){

        mapa.put(solicitante.getCpf(), solicitante);
    }

    public Collection<Solicitante> obterLista(){
       return  mapa.values();
    }

}

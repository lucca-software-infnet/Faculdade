package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


import br.edu.infnet.appprojetobloco.model.domain.PedidosNoCarrinho;

@Service
public class PedidoService {

    private Map<String, PedidosNoCarrinho> mapa = new HashMap<String, PedidosNoCarrinho>();

    public  void  incluir( PedidosNoCarrinho pedidosNoCarrinho){

        mapa.put(pedidosNoCarrinho.getDescricao(), pedidosNoCarrinho);
    }

    public Collection<PedidosNoCarrinho> obterLista(){
       return  mapa.values();
    }
    
}

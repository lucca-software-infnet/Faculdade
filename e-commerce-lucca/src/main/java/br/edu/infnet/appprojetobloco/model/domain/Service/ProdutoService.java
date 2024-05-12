package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appprojetobloco.model.domain.Produto;

@Service
public class ProdutoService {

    
    
    private Map<Integer, Produto> mapa = new HashMap<Integer, Produto>();

    public  void  incluir( Produto produto){

        mapa.put(produto.getCodigoDeBarras(), produto);
    }

    public Collection<Produto> obterLista(){
       return  mapa.values();
    }
}

package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.edu.infnet.appprojetobloco.model.domain.Cartao;

@Service
public class CartaoService {

    private Map<String, Cartao> mapa = new HashMap<>();

    public void incluir(Cartao cartao) {
        mapa.put(cartao.getNumeroDoCartao(), cartao);
    }

    public Collection<Cartao> obterLista() {
        return mapa.values();
    }
}

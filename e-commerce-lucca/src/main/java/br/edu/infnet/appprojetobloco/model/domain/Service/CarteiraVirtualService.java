package br.edu.infnet.appprojetobloco.model.domain.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.edu.infnet.appprojetobloco.model.domain.CarteiraVirtual;

@Service
public class CarteiraVirtualService {

    private Map<String, CarteiraVirtual> mapa = new HashMap<>();

    public void incluir(CarteiraVirtual carteiraVirtual) {
        mapa.put(carteiraVirtual.getSenha(), carteiraVirtual);
    }

    public Collection<CarteiraVirtual> obterLista() {
        return mapa.values();
    }
}

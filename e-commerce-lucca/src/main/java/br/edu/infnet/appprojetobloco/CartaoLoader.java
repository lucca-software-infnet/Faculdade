package br.edu.infnet.appprojetobloco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appprojetobloco.model.domain.Cartao;
import br.edu.infnet.appprojetobloco.model.domain.Usuario;
import br.edu.infnet.appprojetobloco.model.domain.Service.CartaoService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;

@Order(6)
@Component
public class CartaoLoader implements ApplicationRunner {

    @Autowired
    private CartaoService cartaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/cartoes.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");

            Cartao cartao = new Cartao();
            cartao.setTitular(new Usuario()); // Ajuste para obter o usuário apropriado
            cartao.setBandeira(campos[0]);
            cartao.setNumeroDoCartao(campos[1]);
            cartao.setValidadeDoCartao(LocalDate.parse(campos[2])); // Formatando a data
            cartao.setNomeCompletoTitular(campos[3]);
            cartao.setCodigoDeSeguraca(campos[4]);

            cartaoService.incluir(cartao);

            linha = leitura.readLine();
        }

        for (Cartao cartao : cartaoService.obterLista()) {
            System.out.println("[CARTAO] " + cartao);
        }

        leitura.close();
    }
}

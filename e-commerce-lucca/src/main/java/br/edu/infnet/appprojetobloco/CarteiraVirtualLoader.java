package br.edu.infnet.appprojetobloco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appprojetobloco.model.domain.CarteiraVirtual;
import br.edu.infnet.appprojetobloco.model.domain.Usuario;
import br.edu.infnet.appprojetobloco.model.domain.Service.CarteiraVirtualService;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(7)
@Component
public class CarteiraVirtualLoader implements ApplicationRunner {

    @Autowired
    private CarteiraVirtualService carteiraVirtualService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/cartoes_virtuais.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");

            CarteiraVirtual carteiraVirtual = new CarteiraVirtual();
            carteiraVirtual.setCarteiraVirtualUsuario(new Usuario()); // Ajuste para obter o usuário apropriado
            carteiraVirtual.setSaldo(Double.valueOf(campos[0]));
            carteiraVirtual.setSenha(campos[1]);

            carteiraVirtualService.incluir(carteiraVirtual);

            linha = leitura.readLine();
        }

        for (CarteiraVirtual carteiraVirtual : carteiraVirtualService.obterLista()) {
            System.out.println("[CARTEIRA VIRTUAL] " + carteiraVirtual);
        }

        leitura.close();
    }
}

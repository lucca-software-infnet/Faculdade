package br.edu.infnet.appprojetobloco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appprojetobloco.model.domain.Comida;
import br.edu.infnet.appprojetobloco.model.domain.TipoComida;
import br.edu.infnet.appprojetobloco.model.domain.Service.ComidaService;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(3)
@Component
public class ComidaLoader implements ApplicationRunner {

    @Autowired
    private ComidaService comidaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/comidas.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");

            Comida comida = new Comida(
                campos[0],
                    Integer.valueOf(campos[1]),
                    Double.valueOf(campos[2]),
                    campos[3],
                    campos[4],
                    null,
                    0,
                    campos[5],
                    campos[6],
                    Float.valueOf(campos[7]),
                    TipoComida.valueOf(campos[8])
            );

            comidaService.incluir(comida);

            linha = leitura.readLine();
        }

        for (Comida comida : comidaService.obterLista()) {
            System.out.println("[COMIDA] " + comida);
        }

        leitura.close();
    }
}


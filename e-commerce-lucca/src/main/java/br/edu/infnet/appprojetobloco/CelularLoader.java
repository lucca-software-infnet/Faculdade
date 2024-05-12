package br.edu.infnet.appprojetobloco;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appprojetobloco.model.domain.Celular;
import br.edu.infnet.appprojetobloco.model.domain.Vendedor;
import br.edu.infnet.appprojetobloco.model.domain.Service.CelularService;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(4)
@Component
public class CelularLoader implements ApplicationRunner {

    @Autowired
    private CelularService celularService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/celulares.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");

            Celular celular = new Celular(
                campos[0],
                campos[1],
                campos[2],
                campos[3],
                Integer.valueOf(campos[4]),
                Double.valueOf(campos[5]),
                campos[6],
                campos[7],
                new Vendedor(), // Você pode ajustar para obter o vendedor apropriado
                Integer.valueOf(campos[8])
            );

            celularService.incluir(celular);

            linha = leitura.readLine();
        }

        for (Celular celular : celularService.obterLista()) {
            System.out.println("[CELULAR] " + celular);
        }

        leitura.close();
    }
}

    


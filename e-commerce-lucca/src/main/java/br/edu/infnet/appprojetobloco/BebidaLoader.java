package br.edu.infnet.appprojetobloco;

import java.io.BufferedReader;
import java.io.FileReader;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


import br.edu.infnet.appprojetobloco.model.domain.Bebida;
import br.edu.infnet.appprojetobloco.model.domain.Service.BebidaService;

    

    @Order(2)
    @Component
   

public class BebidaLoader implements ApplicationRunner {

    @Autowired
    private BebidaService bebidaService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        FileReader file = new FileReader("files/bebidas.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {

            campos = linha.split(";");

            Bebida bebida = new Bebida(linha, 0, null, linha, linha, null, 0, linha, linha, false);

            bebida.setNome(campos[0]);
            bebida.setCodigoDeBarras(Integer.valueOf(campos[1]));
            bebida.setValor(Double.valueOf(campos[2]));
            bebida.setTipoDeProduto(campos[3]);
            bebida.setDescricaoDoProduto(campos[4]);
            bebida.setQuantidade(Integer.valueOf (campos[6]));
            bebida.setMarca(campos[7]);
            bebida.setTamanho(campos[8]);
            bebida.setAlcolico(Boolean.valueOf(campos[9]));

           

            bebidaService.incluir(bebida);

            linha = leitura.readLine();
        }

        for (Bebida bebida : bebidaService.obterLista()) {
            System.out.println("[BEBIDA] " + bebida);
        }

        leitura.close();
    }
}

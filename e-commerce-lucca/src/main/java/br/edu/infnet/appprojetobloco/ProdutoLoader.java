package br.edu.infnet.appprojetobloco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import br.edu.infnet.appprojetobloco.model.domain.Produto;
import br.edu.infnet.appprojetobloco.model.domain.ProdutoConcreto;
import br.edu.infnet.appprojetobloco.model.domain.Usuario;
import br.edu.infnet.appprojetobloco.model.domain.Service.ProdutoService;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(5)
@Component
public class ProdutoLoader implements ApplicationRunner {

    @Autowired
    private ProdutoService produtoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/produtos.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        while (linha != null) {
            campos = linha.split(";");

            ProdutoConcreto produto = new ProdutoConcreto(

                campos[0],
                Integer.valueOf(campos[1]),
                Double.valueOf(campos[2]),
                campos[3],
                campos[4],
                new Usuario(), 
                Integer.valueOf(campos[5]), 0
            );

            produtoService.incluir(produto);

            linha = leitura.readLine();
        }

        for (Produto produto : produtoService.obterLista()) {
            System.out.println("[PRODUTO] " + produto);
        }

        leitura.close();
    }
}

package br.edu.infnet.appprojetobloco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appprojetobloco.model.domain.Bebida;
import br.edu.infnet.appprojetobloco.model.domain.PedidosNoCarrinho;
import br.edu.infnet.appprojetobloco.model.domain.Produto;
import br.edu.infnet.appprojetobloco.model.domain.Usuario;
import br.edu.infnet.appprojetobloco.model.domain.Service.PedidoService;

@Order(2)
@Component
public class PedidoLoader implements ApplicationRunner {

    @Autowired
    private PedidoService pedidoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("files/pedidos.txt");
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();
        String[] campos;

        PedidosNoCarrinho pedidoNoCarrinho = null ;

        while (linha != null) {
            campos = linha.split(";");

            switch (campos[0].toLowerCase()){
                case "pedido":
                pedidoNoCarrinho = new PedidosNoCarrinho();

                pedidoNoCarrinho.setDescricao(campos[0]);
                pedidoNoCarrinho.setDataDoPedido(LocalDate.now());
                pedidoNoCarrinho.setDataDeEntrega(LocalDate.now().plusWeeks(7)); // Adiciona uma semana à data atual
                pedidoNoCarrinho.setWeb(Boolean.valueOf(campos[3]) );
                pedidoNoCarrinho.setProdutos(new ArrayList<Produto>());
                
                Usuario usuario = new Usuario();
                usuario.setNomeCompleto(campos[4]); 
                usuario.setCpf(campos[5]); 
                usuario.setEmail(campos[6]); 
                break;

                case "Bebida":

                Bebida bebida = new Bebida(linha, 0, null, linha, linha, null, 0, linha, linha, false);
               
                bebida.setDescricaoDoProduto(campos[0]);
                bebida.setNome(campos[1]);
                bebida.setCodigoDeBarras(Integer.valueOf(campos[2]));
                bebida.setValor(Double.valueOf(campos[3]));
                bebida.setTipoDeProduto(campos[4]);
                bebida.setQuantidade(Integer.valueOf (campos[5]));
                bebida.setMarca(campos[6]);
                bebida.setTamanho(campos[7]);
                bebida.setAlcolico(Boolean.valueOf(campos[8]));

                pedidoNoCarrinho.getProdutos().add(bebida);

                break;


            }

            pedidoService.incluir(pedidoNoCarrinho);

            linha = leitura.readLine();
        }

        for (PedidosNoCarrinho pedidos : pedidoService.obterLista()) {
            System.out.println("[BEBIDA] " + pedidos);
        }

        leitura.close();
    }
}

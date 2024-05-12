package br.edu.infnet.appprojetobloco.model.domain;

public class ProdutoConcreto extends Produto {

    public ProdutoConcreto(String nome, int codigoDeBarras, Double valor, String tipoDeProduto, 
                           String descricaoDoProduto, Usuario usuario, int avaliacao, int quantidade) {
        super(nome, codigoDeBarras, valor, tipoDeProduto, descricaoDoProduto, usuario, avaliacao);
        setQuantidade(quantidade);
    }

    

}

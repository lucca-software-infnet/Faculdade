package br.edu.infnet.appprojetobloco.model.domain;

import java.time.LocalDate;

import java.util.List;



public class PedidosNoCarrinho {
    private Usuario usuarioPedido ;
    private String descricao ;
    private LocalDate dataDoPedido ;
    private LocalDate dataDeEntrega ;
    private Boolean web ;
    private double frete ;
    private List<Produto> produtos ;

    public String toString(){
        return String.format("descricao (%s) - dataPedido(%s) - dataEntrega(%s) - web (%s) - usuario (%s) - produtos (%s) ",
        getDescricao(), getDataDoPedido(),getDataDeEntrega(), getWeb(), getUsuarioPedido(), produtos.size());
    }


    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public double getFrete() {
        return frete;
    }
    public void setFrete(double frete) {
        this.frete = frete;
    }
    public Usuario getUsuarioPedido() {
        return usuarioPedido;
    }
    public void setUsuarioPedido(Usuario usuarioPedido) {
        this.usuarioPedido = usuarioPedido;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDoPedido() {
        return dataDoPedido;
    }
    public void setDataDoPedido(LocalDate localDateTime) {
        this.dataDoPedido = localDateTime;
    }
    public LocalDate getDataDeEntrega() {
        return dataDeEntrega;
    }
    public void setDataDeEntrega(LocalDate localDateTime) {
        this.dataDeEntrega = localDateTime;
    }
    public Boolean getWeb() {
        return web;
    }
    public void setWeb(Boolean web) {
        this.web = web;
    }


    public void setQuantidade(Integer valueOf) {
    }
  
}

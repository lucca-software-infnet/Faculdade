package br.edu.infnet.appprojetobloco.model.domain;



abstract public class Produto {
    private String nome;
    private int codigoDeBarras;
    private Double valor;
    private String tipoDeProduto;
    private String descricaoDoProduto;
    private Usuario usuario ;
    private int quantidade;


    public String toString() {

        return String.format("nome (%s) - valor (%.2f) - tipo (%s) - codigo (%d) - descricao(%s) - quantidade(%d)"
        , getNome(), getValor(), getTipoDeProduto() , getCodigoDeBarras(), getDescricaoDoProduto(), getQuantidade() );

    }
   

    private int avaliacao;

    public Produto(String nome, int codigoDeBarras, Double valor, String tipoDeProduto, String descricaoDoProduto,
            Vendedor vendedor, int avaliacao) {
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.valor = valor;
        this.tipoDeProduto = tipoDeProduto;
        this.descricaoDoProduto = descricaoDoProduto;
      
        this.avaliacao = avaliacao;
    }

 public Produto(String nome2, int codigoDeBarras2, Double valor2, String tipoDeProduto2, String descricaoDoProduto2,
            Usuario usuario2, int avaliacao2) {
    }

public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(int codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }


    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

     public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


}

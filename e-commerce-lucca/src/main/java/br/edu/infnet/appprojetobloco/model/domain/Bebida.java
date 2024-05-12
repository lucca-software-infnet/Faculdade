package br.edu.infnet.appprojetobloco.model.domain;

public class Bebida extends Produto {

    private String marca;
    private String tamanho;
    private boolean alcolico;



    @Override
    public String toString() {
        return String.format("Bebida: %s - Marca: %s - Tamanho: %s - Alcoólica: %s",
                super.toString(), getMarca(), getTamanho(), getAlcolico());
    }


    public Bebida(String nome, int codigoDeBarras, Double valor, String tipoDeProduto, String descricaoDoProduto,
            Vendedor vendedor, int avaliacao, String marca, String tamanho, boolean alcolico) {
        super(nome, codigoDeBarras, valor, tipoDeProduto, descricaoDoProduto, vendedor, avaliacao);
        this.marca = marca;
        this.tamanho = tamanho;
        this.alcolico = alcolico;
    }

    


	public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean getAlcolico() {
        return alcolico;
    }

    public void setAlcolico(boolean alcolico) {
        this.alcolico = alcolico;
    }

    @Override
    public int getAvaliacao() {
        // TODO Auto-generated method stub
        return super.getAvaliacao();
    }

    @Override
    public int getCodigoDeBarras() {
        // TODO Auto-generated method stub
        return super.getCodigoDeBarras();
    }

    @Override
    public String getDescricaoDoProduto() {
        // TODO Auto-generated method stub
        return super.getDescricaoDoProduto();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public String getTipoDeProduto() {
        // TODO Auto-generated method stub
        return super.getTipoDeProduto();
    }

    @Override
    public Double getValor() {
        // TODO Auto-generated method stub
        return super.getValor();
    }

    

    @Override
    public void setAvaliacao(int avaliacao) {
        // TODO Auto-generated method stub
        super.setAvaliacao(avaliacao);
    }

    @Override
    public void setCodigoDeBarras(int codigoDeBarras) {
        // TODO Auto-generated method stub
        super.setCodigoDeBarras(codigoDeBarras);
    }

    @Override
    public void setDescricaoDoProduto(String descricaoDoProduto) {
        // TODO Auto-generated method stub
        super.setDescricaoDoProduto(descricaoDoProduto);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setTipoDeProduto(String tipoDeProduto) {
        // TODO Auto-generated method stub
        super.setTipoDeProduto(tipoDeProduto);
    }

    @Override
    public void setValor(Double valor) {
        // TODO Auto-generated method stub
        super.setValor(valor);
    }

   
}

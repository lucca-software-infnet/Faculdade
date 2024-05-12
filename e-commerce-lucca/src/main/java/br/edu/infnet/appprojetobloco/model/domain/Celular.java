package br.edu.infnet.appprojetobloco.model.domain;

public class Celular extends Produto {

    private String modelo;
    private String marca;
    private String sistema;


    @Override
    public String toString() {
        return String.format("Celular: %s - Modelo: %s - Marca: %s - Sistema: %s",
                super.toString(), getModelo(), getMarca(), getSistema());
    }

    public Celular(String modelo, String marca, String sistema ,String nome, int codigoDeBarras, Double valor, String tipoDeProduto, String descricaoDoProduto,
            Vendedor vendedor, int avaliacao) {
        super(nome, codigoDeBarras, valor, tipoDeProduto, descricaoDoProduto, vendedor, avaliacao);
        // TODO Auto-generated constructor stub
        
        this.modelo = modelo ;
        this.marca = marca ;
        this.sistema = sistema ;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

}

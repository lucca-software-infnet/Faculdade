package br.edu.infnet.appprojetobloco.model.domain;



public enum TipoComida {
    VEGANA("Vegana"),
    NORMAL("Normal"),
    INTEGRAL("Integral");

    private final String descricao;

    TipoComida(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
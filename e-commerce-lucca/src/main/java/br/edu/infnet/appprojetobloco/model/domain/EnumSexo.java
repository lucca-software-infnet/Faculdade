package br.edu.infnet.appprojetobloco.model.domain;

public enum EnumSexo {
    
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private final String sexo;

    EnumSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}

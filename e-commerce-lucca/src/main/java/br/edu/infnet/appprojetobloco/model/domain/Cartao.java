package br.edu.infnet.appprojetobloco.model.domain;

import java.time.LocalDate;



public class Cartao {
    private Usuario titular ;
    private String bandeira ;
    private String numeroDoCartao ;
    private LocalDate validadeDoCartao ;
    private String nomeCompletoTitular;
    private String codigoDeSeguraca ;
    
    public Usuario getTitular() {
        return titular;
    }
    public void setTitular(Usuario titular) {
        this.titular = titular;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }
    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }
    public LocalDate getValidadeDoCartao() {
        return validadeDoCartao;
    }
    public void setValidadeDoCartao(LocalDate validadeDoCartao) {
        this.validadeDoCartao = validadeDoCartao;
    }
    public String getNomeCompletoTitular() {
        return nomeCompletoTitular;
    }
    public void setNomeCompletoTitular(String nomeCompletoTitular) {
        this.nomeCompletoTitular = nomeCompletoTitular;
    }
    public String getCodigoDeSeguraca() {
        return codigoDeSeguraca;
    }
    public void setCodigoDeSeguraca(String codigoDeSeguraca) {
        this.codigoDeSeguraca = codigoDeSeguraca;
    }
}

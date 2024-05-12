package br.edu.infnet.appprojetobloco.model.domain;



public class CarteiraVirtual {
    private Double saldo;
    private String senha;
    private Usuario carteiraVirtualUsuario ;



    public Usuario getCarteiraVirtualUsuario() {
        return carteiraVirtualUsuario;
    }
    public void setCarteiraVirtualUsuario(Usuario carteiraVirtualUsuario) {
        this.carteiraVirtualUsuario = carteiraVirtualUsuario;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}

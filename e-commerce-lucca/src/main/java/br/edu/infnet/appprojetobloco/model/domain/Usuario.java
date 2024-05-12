package br.edu.infnet.appprojetobloco.model.domain;

import java.time.LocalDate;
import java.util.List;



public class Usuario {
    private String nomeCompleto ;
    private String email ;
    private String senha ;
    private String telefone ;
    private LocalDate dataDeNascimento ;
    private EnumSexo sexo ;
    private String endereco ;
    private String cep;
    private String estado ;
    private String cidade ;
    private CarteiraVirtual usuarioCarteiraVirtual ;
    private List<PedidosNoCarrinho> usuarioPedido ;
    private List<Cartao> cartoes ;
    private List<Produto> divulgaProdutos ;
    private String cpf;




   
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public List<Produto> getDivulgaProdutos() {
        return divulgaProdutos;
    }
    public void setDivulgaProdutos(List<Produto> divulgaProdutos) {
        this.divulgaProdutos = divulgaProdutos;
    }
    public List<Cartao> getCartoes() {
        return cartoes;
    }
    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
    public List<PedidosNoCarrinho> getUsuarioPedido() {
        return usuarioPedido;
    }
    public void setUsuarioPedido(List<PedidosNoCarrinho> usuarioPedido) {
        this.usuarioPedido = usuarioPedido;
    }
    public CarteiraVirtual getUsuarioCarteiraVirtual() {
        return usuarioCarteiraVirtual;
    }
    public void setUsuarioCarteiraVirtual(CarteiraVirtual usuarioCarteiraVirtual) {
        this.usuarioCarteiraVirtual = usuarioCarteiraVirtual;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public EnumSexo getSexo() {
        return sexo;
    }
    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}

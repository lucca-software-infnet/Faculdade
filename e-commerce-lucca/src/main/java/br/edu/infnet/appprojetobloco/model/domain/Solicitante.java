package br.edu.infnet.appprojetobloco.model.domain;

public class Solicitante extends Usuario {
    

    public String toString(){
        return String.format("Solicitante(nome: %s, cpf: %s, email: %s)", getNomeCompleto(), getCpf(), getEmail());
    }



    @Override
    public String getNomeCompleto() {
        
        return super.getNomeCompleto();
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        
        super.setNomeCompleto(nomeCompleto);
    }
    
    @Override
    public String getEmail() {
        
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        
        super.setEmail(email);
    }

    

}

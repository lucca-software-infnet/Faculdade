package br.edu.infnet.appprojetobloco.model.domain;

public class Comida extends Produto {

    private String ingredientes;
    private String tipoDeComida;
    private float peso;
    private TipoComida tipocomida;


        @Override
        public String toString() {
            return String.format(" %s - Ingredientes: %s - Tipo de Comida: %s - Peso: %.2f - TipoComida: %s",
                    super.toString(), getIngredientes(), getTipoDeComida(), getPeso(), getTipocomida());
        }

    
    public Comida(String nome, int codigoDeBarras, Double valor, String tipoDeProduto, String descricaoDoProduto,
                  Vendedor vendedor, int avaliacao, String ingredientes, String tipoDeComida, float peso, TipoComida tipocomida) {
        super(nome, codigoDeBarras, valor, tipoDeProduto, descricaoDoProduto, vendedor, avaliacao);
        this.ingredientes = ingredientes;
        this.tipoDeComida = tipoDeComida;
        this.peso = peso;
        this.tipocomida = tipocomida;
    }

    
    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoDeComida() {
        return tipoDeComida;
    }

    public void setTipoDeComida(String tipoDeComida) {
        this.tipoDeComida = tipoDeComida;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public TipoComida getTipocomida() {
        return tipocomida;
    }

    public void setTipocomida(TipoComida tipocomida) {
        this.tipocomida = tipocomida;
    }

    
   
}

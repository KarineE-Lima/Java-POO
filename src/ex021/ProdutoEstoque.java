package ex021;

public class ProdutoEstoque {
    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public ProdutoEstoque(String nome, String codigo, int quantidade, double precoUnitario){
        this.nome = (nome != null) ? nome : "";
        if(codigo == null)
            throw new IllegalArgumentException("O código não pode ser null");
        this.codigo = codigo ;
        this.quantidade = (quantidade > 0)? quantidade : 0;
        this.precoUnitario = (precoUnitario > 0)? precoUnitario : 0;
    }
    public ProdutoEstoque(String codigo){
        this(null, codigo, 0, 0);
    }
    public ProdutoEstoque(String nome, String codigo, double precoUnitario){
        this(nome, codigo, 0, precoUnitario);
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public ProdutoEstoque setNome(String nome) {
        this.nome = (nome != null)? nome : "";
        return this;
    }
    public ProdutoEstoque setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = (precoUnitario > 0)? precoUnitario : 0;
        return this;
    }
    public ProdutoEstoque setQuantidade(int quantidade) {
        this.quantidade = (quantidade > 0)? quantidade : 0;
        return this;
    }
    public String toString() {
        return "[ " + "nome: " + nome + " codigo: " + codigo + " qtd: " + quantidade + " preço un: " + precoUnitario + "]\n";
    }
}

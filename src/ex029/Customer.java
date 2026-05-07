package ex029;

public class Customer {
    private String nome;
    private String cpf;
    private String endereco;
    public Customer(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
}

package ex026;

public class ValidadorCadastro{
    private String nome;
    private String email;
    private String cpf;
    private int idade;
    public void cadastrarParticipante(String nome, String email, String cpf, int idade){
        if(!validaNome(nome)){
            System.err.println("Nome não pode ser vazio!");
            return;
        }
        if(!validaEmail(email)){
            System.err.println("Email não pode ser vazio!");
            return;
        }
        if(!validaCPF(cpf)){
            System.err.println("CPF não pode ser vazio!");
            return;
        }
        if(!validaIdade(idade)){
            System.err.println("Idade mínima para participar é 18!");
            return;
        }
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idade = idade;
    }
    private boolean validaNome(String nome){
        return (nome != null && !(nome.isEmpty()));
    }
    private boolean validaCPF(String cpf){
        return (cpf != null && !(cpf.isEmpty()) && (cpf.length() < 11 && cpf.length() > 15) );
    }
    private boolean validaEmail(String email){
        return (email != null && !(email.isEmpty()));
    }
    private boolean validaIdade(int idade){
        return idade >= 18;
    }

}
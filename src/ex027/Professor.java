package ex027;

public class Professor {
    private String matricula;
    private String nome;
    private int idade;

    public Professor(String matricula, String nome, int idade){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getMatricula() {
        return matricula;
    }
    public String toString(){
        return "Matricula: " + matricula + ", nome: " + nome + ", idade: " + idade;
    }
}

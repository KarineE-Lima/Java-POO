package ex024.model;

public class Aluno {
    private String nome;
    private long matricula;
    private String curso;
    private String cpf;
    private int idade;

    public Aluno(String nome, long matricula, String cpf){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }
    public Aluno(String nome, long matricula, String cpf, String curso, int idade){
        this(nome, matricula, cpf);
        this.curso = curso;
        this.idade = idade;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    private void setMatricula(long matricula) {
        this.matricula = matricula;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public long getMatricula() {
        return matricula;
    }
    public String getCurso() {
        return curso;
    }
    private String getCpf() {
        return cpf;
    }
    private int getIdade() {
        return idade;
    }
    

}

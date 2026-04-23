package ex027;

import java.util.*;

public class Aluno {
    private String nome;
    private String matricula;
    private int idade;
    private Curso curso;
    public Aluno(String nome, String matricula, int idade, Curso curso){
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.curso = curso;
        this.curso.addAluno(this);
    }
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public Curso getCurso() {
        return curso;
    }
    public int getIdade() {
        return idade;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public String toString() {
        return "nome: " + nome + ", matricula: " + matricula + ", idade: " + idade +  ", curso: " + curso;
    }

}

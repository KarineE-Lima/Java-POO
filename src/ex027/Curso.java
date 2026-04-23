package ex027;

import java.util.*;

public class Curso {
    private String codigo;
    private String nome;
    private Professor professor;
    private List<Modulo> modulos = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    
    public Curso(String codigo, String nome, Professor professor, int quantidadeModulos){
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        for(int i = 1; i <= quantidadeModulos; i++)
            modulos.add(new Modulo(i));
    }
    public void addAluno(Aluno aluno){
        alunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }
    public String toString(){
        return "Codigo: " + codigo + ", nome: " + nome + ", Professor: " + professor.getNome() + ", Modulos: " + getModulos() + ", Alunos: " + getAlunos();
    }
    public List<String> getAlunos() {
        List<String> lista = new ArrayList<>();
        for(Aluno a : alunos)
            lista.add(a.getNome());
        return lista;
    }
    public List<Integer> getModulos() {
        List<Integer> lista = new ArrayList<>();
        for (Modulo m : modulos) {
            lista.add(m.getNumero());
        }
        return lista;
    }
}

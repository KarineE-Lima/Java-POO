package ex024.main;

public class Main {
    public static void main(String[] args) {
        ex024.model.Aluno a1 = new ex024.model.Aluno("Maria", 222222, "888.777.124-54");
        a1.setCurso("Engenharia");
        a1.setIdade(18);
        System.out.println("Aluno matricula: " + a1.getMatricula() + "\nNome: " + a1.getNome() + ", Curso: " + a1.getCurso());
    }
    
}

package ex027;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("1111", "Maria", 42);
        Professor p2 = new Professor("2222", "João", 28);
        Curso c1 = new Curso("147", "Lógica de Programação", p2, 4);
        Aluno a1 = new Aluno("Raíssa", "17777", 12, c1);
        Aluno a2 = new Aluno("Clarissa", "18999", 18, c1);
        System.out.println(p2.toString());
        System.out.println(c1.toString());
        //c1 = null;
        System.out.println(p2.toString());
        System.out.println(a1.toString());
    }
}

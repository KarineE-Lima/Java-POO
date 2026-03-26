package ex009;

public class ProjetoPessoa {

    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Pedro");
        p2.setNome("Luiza");
        p2.setSexo("Feminino");
        p2.setIdade(23);
        p2.fazerAniv();
        p3.setNome("Renato");
        p4.setNome("Clara");
        System.out.println(p2.toString());
    }
}

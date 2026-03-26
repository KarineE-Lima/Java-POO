package ex010;

public class Aula011 {
    public static void main(String[] args){
        /*Visitante v1 = new Visitante();
        v1.setNome("Raul");
        v1.setIdade(18);
        v1.setSexo("M");
        v1.fazerAniversario();
        System.out.println(v1.toString());*/

        Aluno a1 = new Aluno();
        a1.setNome("Ramiro");
        a1.setCurso("ADM");
        a1.setIdade(16);
        a1.setMatricula(11111);
        System.out.println(a1.toString() + " curso " + a1.getCurso());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.pagarMensalidade();
    }
}

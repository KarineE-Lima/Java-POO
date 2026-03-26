package ex002;

public class ObjetosClasses {
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Rosa";
        c2.destampar();
        c2.status();
        c2.rabiscar();

        /*Aluno a1 = new Aluno();
        a1.idade = 17;
        a1.sexo = "Feminino";
        a1.nome = "Ana Júlia Santana";
        a1.cpf = "084.874.958-22";
        a1.matricula = 22255;
        a1.listarDados();
        a1.atualizarAluno();
        a1.listarDados();*/

    }
}

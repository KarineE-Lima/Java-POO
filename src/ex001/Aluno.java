package ex001;

import java.util.Scanner;

public class Aluno {
    String nome, sexo, cpf;
    int matricula, idade, qtdDisciplinas;

    void listarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
        System.out.println("Nº de Disciplinas Matriculadas: " + this.qtdDisciplinas);
    }
    void atualizarAluno(){
        System.out.println("Escolha:");
        System.out.println("1- Nome \n2- Matrícula \n3- CPF \n4- Sexo \n5- Idade \n6-Quantidade de Disciplinas");
        Scanner teclado = new Scanner(System.in);
        int op = teclado.nextInt();
        switch (op){
            case 1:
                this.nome = teclado.nextLine();
                break;
            case 2: this.matricula = teclado.nextInt(); break;
            case 3: this.cpf = teclado.nextLine();break;
            case 4: this.sexo = teclado.nextLine();break;
            case 5: this.idade = teclado.nextInt();break;
            case 6: this.qtdDisciplinas = teclado.nextInt();break;
        }
    }
}

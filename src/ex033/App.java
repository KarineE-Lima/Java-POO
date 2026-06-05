package ex033;

import java.lang.reflect.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira o nome da classe que você quer usar: ");
            String nomeClasse = scanner.nextLine();
            System.out.println("Insira o seu nome: ");
            String nomePessoa = scanner.nextLine();
            Constructor construtor = Class.forName(nomeClasse).getConstructor(String.class);
            Pessoa p1 = (Pessoa) construtor.newInstance(nomePessoa);
            System.out.println(p1.getNome());
            Reflexao.imprimirMetodos("ex033.Aluno");

        } catch (NoSuchMethodException e) {
            System.out.println("Método não encontrado: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Erro " + e);
        }
    }
        
}

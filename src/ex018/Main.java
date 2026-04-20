package ex018;

public class Main {
    public static void main(String[] args) {
        Equipe e1 = new Equipe("Os Juniors");
        e1.adicionarDev(new Desenvolvedor("Maria", "Front-end", 5000.00));
        e1.adicionarDev(new Desenvolvedor("João", "Banco de Dados", 18000.00));
        e1.adicionarDev(new Desenvolvedor("Raul", "Back-end", 5500.00));
        e1.exibirDadosEquipe();
    }
}

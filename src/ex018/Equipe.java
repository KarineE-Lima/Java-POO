package ex018;

import java.util.ArrayList;

public class Equipe {
    private String nomeDaEquipe;
    private ArrayList<Desenvolvedor> desenvolvedores = new ArrayList<>();
    public Equipe(String nomeDaEquipe){
        this.nomeDaEquipe = nomeDaEquipe;
    }
    public void adicionarDev(Desenvolvedor desenvolvedor){
        desenvolvedores.add(desenvolvedor);
    }
    public void exibirDadosEquipe(){
        System.out.println("Nome da Equipe: " + nomeDaEquipe);
        System.out.println("Desenvolvedores:");
        for(Desenvolvedor dev: desenvolvedores)
            System.out.println("Nome - " + dev.getNome() + " Tecnologia - " + dev.getTecnologia());
    }
}

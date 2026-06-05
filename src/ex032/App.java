package ex032;

import java.lang.reflect.*;

public class App {
    public static void carregarEfetuarPlugin(String nomeDaClasse){
        try {
            Class<?> classe = Class.forName(nomeDaClasse);
            Constructor<?> constructor = classe.getConstructor();
            Object objeto = constructor.newInstance();
            if(objeto instanceof PluginAudio pluginAudio){
                pluginAudio.aplicarEfeito();
            } else{
                throw new PluginInvalidoException("Efeito não faz parte de PluginAudio");
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try{
            carregarEfetuarPlugin("ex032.EfeitoEco");
            carregarEfetuarPlugin("ex032.EfeitoInexistente");
            carregarEfetuarPlugin("ex032.Batata");
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

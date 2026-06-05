package ex033;

import java.lang.reflect.Method;

public class Reflexao {
    public static void imprimirMetodos(String nomeDaClasse){
        try {
            Method [] methods = Class.forName(nomeDaClasse).getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Nome: " + method.getName());
                System.out.println("Tipo: " + method.getReturnType());
                System.out.println("Quantidade de parâmetros: " + method.getParameterCount());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
        
    }
}

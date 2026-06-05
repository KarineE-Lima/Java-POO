package ex031;

import java.lang.reflect.*;

public class App {
    public static void main(String [] args){
        try{
            Segredo s = new Segredo();
            Field [] fields = s.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field.get(s));
                field.set(s, "Novo segredo");
                System.out.println(field.get(s));
            }
            

        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        
        
        

    }
}

package ex034.q09;

import java.lang.reflect.Field;

public class ObjectInspector {
    public void inspect(Object obj){
        Field [] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            try{
                field.setAccessible(true);
                System.out.println("[" + field.getType().getSimpleName() + "] " 
                + field.getName() + " = " + field.get(obj));
            } catch (IllegalAccessException e){
                System.out.println("Erro: " + e.getMessage());
            }
            
        }
        
    }
}

package ex034.q06;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class ReportRunner {
    public void run(Object obj){
        try {
            Method method = obj.getClass().getMethod("generate");
            method.invoke(obj);
        } catch (NoSuchMethodException e) {
            System.out.println("Método não encontrado: " + e.getMessage());
        } catch (InvocationTargetException e){
            System.out.println("Erro interno: " + e.getCause());
        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

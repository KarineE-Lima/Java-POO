package ex034.q07;

public class PluginLoader {
    public void loadAndRun(String [] names){
        for (String name : names) {
            try{
                Class<?> clazz = Class.forName(name);
                if(!(Plugin.class.isAssignableFrom(clazz))){
                    System.out.println("Classe " + name + " não implementa Plugin");
                    continue;
                }
                Plugin plugin = (Plugin) clazz.getDeclaredConstructor().newInstance();
                plugin.execute();
            } catch (ClassNotFoundException e){
                System.out.println("Classe não encontrada: " + e.getClass());
            } catch(Exception e){
                System.out.println("Exceção: " + e.getMessage());
            }
            
        }
    }
}

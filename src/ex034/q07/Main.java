package ex034.q07;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] classNames = {
            "ex034.q07.HelloPlugin",
            "ex034.q07.GoodbyePlugin",
            "ex034.q07.UnknownClass" // não implementa Plugin
        };
        PluginLoader loader = new PluginLoader();
        loader.loadAndRun(classNames);
    }
}

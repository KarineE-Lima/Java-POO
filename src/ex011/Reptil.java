package ex011;

public class Reptil extends Animal{
    protected String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo folha...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de réptil...");
    }
}

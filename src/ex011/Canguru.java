package ex011;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Meu filhote está na bolsa...");
    }
    @Override
    public void locomover(){
        System.out.println("Saltitando...");
    }
}

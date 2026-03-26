package ex012;

import ex011.Mamifero;

public class Cachorro extends Mamifero {
    public void enterrarOsso(){
        System.out.println("Enterrando Osso...");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au Au...");
    }
    public void reagir(String frase){
        if(frase.equals("Olá") || frase.equals("Toma comida")) {
            this.abanarRabo();
            this.emitirSom();
        }else
            System.out.println("Rosnar");
    }
    public void reagir(int hora, int min){
        if(hora < 12)
            this.abanarRabo();
        else if(hora>= 18)
            System.out.println("Ingnorando...");
        else {
            this.abanarRabo();
            this.emitirSom();
        }
    }
    public void linha(){
        for(int i = 0; i < 20; i++)
            System.out.print("-");
        System.out.println("");
    }
    public void reagir(boolean dono){
        if(dono)
            this.abanarRabo();
        else {
            this.emitirSom();
            System.out.println("Rosnando");
        }
    }
}

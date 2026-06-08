package ex034.q03;

public class Fish extends Animal implements Swimmable{

    public Fish(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming with your fins...");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing with your gills...");
    }
    
}

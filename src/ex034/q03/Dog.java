package ex034.q03;

public class Dog extends Animal implements Swimmable{
    public Dog(String name){
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming with your paws...");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing with your muzzle...");
    }
    
}

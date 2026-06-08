package ex034.q03;

public class Bird extends Animal implements Flyable{
    public Bird(String name){
        super(name);
    }
    @Override
    public void breathe(){
        System.out.println(getName() + " is breathing with your nozzle...");
    }
    @Override
    public void fly(){
        System.out.println(getName() + " is flying with your wings...");
    }
}

package ex034.q03;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {new Dog("Rex"), new Bird("Tweety"), new Fish("Nemo")};
        for(Animal a : animals){
            a.breathe();
            if(a instanceof Flyable f) f.fly();
            if(a instanceof Swimmable s) s.swim(); 
        }
    }
}

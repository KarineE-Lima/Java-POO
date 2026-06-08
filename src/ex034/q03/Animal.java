package ex034.q03;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public abstract void breathe();
}

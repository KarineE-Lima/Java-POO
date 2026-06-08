package ex034.q01;
//import java.math.*;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String name(){
        return "Circle";
    }
    @Override
    public double area(){
        return (Math.pow(radius, 2) * Math.PI);
    }
}

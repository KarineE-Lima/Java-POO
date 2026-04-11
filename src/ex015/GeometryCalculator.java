package ex015;
import java.math.*;

public class GeometryCalculator {
    private int precision;
    public GeometryCalculator(){
        this.precision = 2;
    }
    public GeometryCalculator(int precision){
        this.precision = precision;
    }
    public GeometryCalculator(boolean high){
        this(high ? 6:2);
    }
    public double calculateArea(double radius){
        return formatPrecision(Math.PI * Math.pow(radius, 2));
    }
    public double calculateArea(double base, double height){
        return formatPrecision(base * height);
    }
    public double calculateArea(double side1, double side2, double side3){
        double perimeter = calculatePerimeter(side1, side2, side3) / 2;
        return formatPrecision(Math.sqrt((perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3))));
    }

    public double calculatePerimeter(double... sides){
        double result = 0.0;
        for(double side: sides){
            result += side;
        }
        return formatPrecision(result);
    }
    private double formatPrecision(double value){
        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(precision, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

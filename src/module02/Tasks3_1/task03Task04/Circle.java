package module02.Tasks3_1.task03Task04;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}

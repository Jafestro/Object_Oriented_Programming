package module02.Tasks3_1.task03Task04;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Triangle(3, 4, 5),
                new Circle(5),
                new Rectangle(3, 4)
        };
        // Task4 ----------------------------------------
        shapes[0].setColor("Green");
        shapes[1].setColor("Yellow");
        shapes[2].setColor("Orange");
        //-----------------------------------------------
        System.out.println("Shape Calculator");

        for (Shape shape : shapes) {
            //Task 4(color) could be seen also inside switch
            switch (shape.getClass().getSimpleName()){
                case "Triangle":
                    Triangle triangle = (Triangle) shape;
                    System.out.println(triangle.getColor() + " Triangle area with sides A:" + triangle.getSideA()
                            +", B:" + triangle.getSideB()
                            + ", C:" + triangle.getSideC() + " is: " + triangle.calculateArea());
                    break;
                case "Circle":
                    Circle circle = (Circle) shape;
                    System.out.println(circle.getColor() + " Circle area with radius "
                            + circle.getRadius() + " is: "+ circle.calculateArea());
                    break;
                case "Rectangle":
                    Rectangle rectangle = (Rectangle) shape;
                    System.out.println(rectangle.getColor() + " Rectangle area with width " + rectangle.getWidth()
                            + " and with height " + rectangle.getHeight() + " is: " + rectangle.calculateArea());
                    break;
            }
        }
    }
}

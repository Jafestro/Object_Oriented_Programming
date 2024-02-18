package module04.tasks4_2.task01_02;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        System.out.println(calculator.getValue());
        calculator.reset();
        System.out.println(calculator.getValue());
        calculator.add(-1);
    }
}

package module05.opiskelu5_3;

class Calculator {
    private int a, b;
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a+b;
    }
}
public class Main {
    public static boolean isEven(int number) {
        return ((number % 2) == 0);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println("Number " + n + " is even: " + isEven(n));
    }
}

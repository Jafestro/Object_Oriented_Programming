package module01.Tasks1_3.task01;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, x1, x2;
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a:");
        a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b:");
        b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c:");
        c = Double.parseDouble(scanner.nextLine());

        d = Math.pow(b, 2) - 4 * a * c; //b^2 - 4ac

        if (d > 0) {
            x1 = ((b * -1) + Math.sqrt(d)) / (2 * a); //formula to find the roots (-b + sqrt(d))/2a
            x2 = ((b * -1) - Math.sqrt(d)) / (2 * a); //formula to find the roots (-b - sqrt(d))/2a
            System.out.printf("Two roots %s and %s\n", x1, x2);
        } else if (d == 0) {
            x1 = ((b * -1) + Math.sqrt(d)) / (2 * a);
            x2 = x1;
            System.out.printf("One root %s\n", x1);
        } else {
            System.out.println("Doesn't have real roots");
        }
    }
}

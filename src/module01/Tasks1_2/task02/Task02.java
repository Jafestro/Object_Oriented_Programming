package module01.Tasks1_2.task02;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Write the length of the first leg of the right triangle");
        double leg01 = Double.parseDouble(reader.nextLine());
        System.out.println("Write the length of the second leg of the right triangle");
        double leg02 = Double.parseDouble(reader.nextLine());

        System.out.printf("The hypotenuse of the triangle is %.1f\n",
                Math.sqrt((Math.pow(leg01, 2) + Math.pow(leg02, 2)))); // it is formula c = squareRoot(a^2 + b^2)
    }
}

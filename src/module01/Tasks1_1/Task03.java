package module01.Tasks1_1;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Changed types from int to float, so we can get precise answer in average like this 4.3333335
        System.out.println("Give the first number:");
        float first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the second number:");
        float second = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the third number:");
        float third = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second + third));
        System.out.printf("The product of the numbers is %s\n", (first * second * third));
        System.out.printf("The average of the numbers is %s\n", (first + second + third) / 3);
    }
}

package module01.Tasks1_3.task02;

import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        System.out.println("Enter binary number to convert it to decimal value:");
        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(binaryNumber, 2);

        System.out.printf("Decimal value: %s\n", decimalNumber);
    }
}

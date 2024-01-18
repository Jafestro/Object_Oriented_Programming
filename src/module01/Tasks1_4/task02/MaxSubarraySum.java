package module01.Tasks1_4.task02;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the integers into the array:");

        for (int i = 1; i <= size; i++) {
            System.out.printf("Enter integer %s: ", i);
            int input = Integer.parseInt(scanner.nextLine());
        }
    }
}

package module01.Tasks1_3.task03;

import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning, end, count = 0;

        System.out.println("The program should generate and display all the prime numbers between start and end, inclusive.");
        System.out.println("Enter the beginning number");
        beginning = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the end number");
        end = Integer.parseInt(scanner.nextLine());

        while (beginning <= end) {
            if (beginning > 1) {
                boolean isPrime = true;
                for (int i = 2; i <= beginning; i++) {
                    if (beginning % i == 0 && beginning != i){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.printf("%s is prime number\n", beginning);
                    count++;
                }
            }
            beginning++;
        }
        if (count == 0)
            System.out.println("There are no prime number between");
    }
}

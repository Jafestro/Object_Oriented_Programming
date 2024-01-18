package module01.Tasks1_3.task04;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int first, second;

        System.out.println("**************WELCOME TO MULTIPLICATION EXAM!**************");

        for (int i = 1; i <= 10 ; i++) {
            first = random.nextInt(10) + 1;
            second = random.nextInt(10) + 1;
            System.out.printf("1)  %s * %s = ?\n", first, second);

            Scanner
        }
    }
}

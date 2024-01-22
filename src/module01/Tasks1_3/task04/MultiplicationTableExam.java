package module01.Tasks1_3.task04;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int first, second, answer, rightAnswerCount = 0;

        System.out.println("**************WELCOME TO MULTIPLICATION EXAM!**************");
        while (true) {
            for (int i = 1; i <= 10; i++) {
                first = random.nextInt(10) + 1;
                second = random.nextInt(10) + 1;
                System.out.printf("%s)  %s * %s = ", i, first, second);

                answer = Integer.parseInt(scanner.nextLine());

                if (first * second == answer) {
                    System.out.println("CORRECT!");
                    rightAnswerCount++;
                } else {
                    System.out.println("Not Correct, next time you will get it right:)");
                }
            }
            if (rightAnswerCount >= 10) {
                System.out.printf("Right answers %s from 10\n", rightAnswerCount);
                System.out.println("Congratulations on mastering of Multiplication table!");
                break;
            } else {
                System.out.printf("Right answers %s from 10\n", rightAnswerCount);
                rightAnswerCount = 0;
            }
        }
    }
}
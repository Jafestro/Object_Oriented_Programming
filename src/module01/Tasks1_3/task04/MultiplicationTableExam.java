package module01.Tasks1_3.task04;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableExam {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int first, second, answer;

        System.out.println("**************WELCOME TO MULTIPLICATION EXAM!**************");

        for (int i = 1; i <= 10 ; i++) {
            first = random.nextInt(10) + 1;
            second = random.nextInt(10) + 1;
            System.out.printf("%s)  %s * %s = ", i, first, second);

            answer = Integer.parseInt(scanner.nextLine());

            if (first * second == answer){
                System.out.println("CORRECT!");
            }else {
                System.out.println("Not Correct, next time you will get it right:)");
            }
        }
    }
}

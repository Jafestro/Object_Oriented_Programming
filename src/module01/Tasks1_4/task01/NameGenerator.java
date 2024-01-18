package module01.Tasks1_4.task01;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {

    static final private String[] FIRST_NAMES = {"Emma", "Liam", "Olivia", "Noah", "Ava", "Sophia", "Jackson", "Isabella",
            "Lucas", "Mia", "Aiden", "Harper", "Elijah", "Amelia", "Grayson", "Abigail", "Mason", "Evelyn", "Logan",
            "Ella", "Carter", "Scarlett", "Ethan", "Lily", "Oliver", "Chloe", "Benjamin", "Emily", "Henry", "Grace"
    };

    static final private String[] LAST_NAMES = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
            "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia",
            "Martinez", "Robinson", "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez",
            "King"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("************A NAME GENERATRON T-1000************");
        System.out.println("How many names you want to generate?");
        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < size; i++) {
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];   
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];

            System.out.printf("%s %s\n", firstName, lastName);
        }
    }
}

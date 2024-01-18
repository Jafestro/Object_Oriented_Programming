package module01.Tasks1_2.task03;

import java.util.Scanner;

public class Task03 {

    static final double LUOTI = 13.28;
    static final double NAULA = LUOTI * 32;
    static final double LEIVISKA = NAULA * 20;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double weight = Double.parseDouble(reader.nextLine());

        printInMedievalMeasurements(weight);
    }

    public static void printInMedievalMeasurements(double weight) {
        double luoti;
        int luotiCount, naula_count, leiviskaCount;

        luoti = weight;
        luotiCount = (int) (weight / LUOTI);

        naula_count = luotiCount / 32;

        luoti -= naula_count * NAULA;

        luoti /= LUOTI;

        leiviskaCount = naula_count / 20;

        naula_count -= leiviskaCount * 20;

        System.out.printf("%s grams is %d leiviskä, %d naula, and %.2f luoti.", weight, leiviskaCount, naula_count, luoti);
    }
}

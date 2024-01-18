package module01.Tasks1_2.task01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("*******Task 1: Fahrenheit to Celsius Converter*******");
        Scanner reader = new Scanner(System.in);
        System.out.println("Write degrees in fahrenheit: ");
        float fahrenheit = Float.parseFloat(reader.nextLine());
        float celsius = changeFromFahrenheitToCelsius(fahrenheit);
        System.out.printf("Degrees in celsius is %.1f\n", celsius);
    }


    public static float changeFromFahrenheitToCelsius(Float fahrenheit) {
        return (fahrenheit - 32) * ((float) 5 /9);
    }
}

package module8.module8_1.Task2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        AtomicInteger sum = new AtomicInteger();
        numbers.removeIf(number -> number % 2 == 0);
        numbers.replaceAll(number -> number * 2);
        Consumer<Integer> consumer = number -> sum.addAndGet(number);
        numbers.forEach(consumer);
        System.out.println("Sum of odd numbers multiplied by 2: " + sum);
    }
}

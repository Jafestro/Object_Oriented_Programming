package module8.module8_2.Task2;

import java.util.ArrayList;

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
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);

        System.out.println(numbers.stream().filter(number -> number %2==0)
                .map(number -> number*2)
                .mapToDouble(Integer::doubleValue).sum()
        );
    }
}

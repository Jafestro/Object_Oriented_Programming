package module8.module8_2.Task1;

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

        System.out.println(numbers.stream().mapToDouble(Integer::doubleValue).sum() / numbers.size());
    }
}

package module04.tasks4_2.task01_02;

import java.util.LinkedList;

// class that has the ability to sum positive integers. A negative integer should throw an exception.
public class Calculator {

    private LinkedList<Integer> positiveNumbers = new LinkedList<>();

    //A method that resets the calculator to zero.
    public void reset() {
        positiveNumbers.clear();
    }

    //A method that adds an integer to the calculator.
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        positiveNumbers.add(number);
    }

    //A method that returns the current value of the calculator.
    public int getValue() {
        int sum = 0;
        while (!positiveNumbers.isEmpty()) {
            sum += positiveNumbers.poll();
        }
        return sum;
    }
}

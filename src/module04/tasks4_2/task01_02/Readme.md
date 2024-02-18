Calculator program that sums positive integers and negative numbers throws
an exception.
```java
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
```
This class has a method that sums positive integers and throws an exception 
when a negative number is added. The class has a method that resets
the calculator to zero (<em>which means it just deletes numbers from the list</em>), 
a method that adds an integer to the calculator,
and a method that sums up the positive numbers that are in the 
LinkedList with poll() method, and returns the sum of the numbers(<em>which
also automatically clear up the list</em>).
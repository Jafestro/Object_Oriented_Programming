package module05.Tasks5_1.task02;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class NumberCounter {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        double start;
        int sum;
        try (ForkJoinPool threadPool = new ForkJoinPool(3)) {

            start = System.nanoTime();
            sum = threadPool.submit(() -> Arrays.stream(integerArray)
                            .parallel()
                            .reduce(0, Integer::sum))
                    .join();
        }
        double end = System.nanoTime();
        double timeSpent = end - start;

        System.out.println("Sum of array is: " + sum + " " + timeSpent/10e6 + "ms");
    }
}

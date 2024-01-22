package module01.Tasks1_4.task02;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] array = createAnArray();
        int[] pasila = findMaxSubarray(array);
        System.out.println();
        System.out.printf("Maximum sum: %s\n", pasila[0]);
        System.out.printf("Integers: %s-%s\n", pasila[1], pasila[2]);
    }

    public static int[] createAnArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        System.out.println("Enter the integers into the array:");

        for (int i = 1; i <= size; i++) {
            System.out.printf("Enter integer %s: ", i);
            int input = Integer.parseInt(scanner.nextLine());
            array[i-1] = input;
        }
        return array;
    }

    private static int[] findMaxSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIdx = 0;
        int endIdx = 0;
        int currentStartIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIdx = currentStartIdx;
                endIdx = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                currentStartIdx = i + 1;
            }
        }

        return new int[]{maxSum, startIdx + 1, endIdx + 1};
    }
}

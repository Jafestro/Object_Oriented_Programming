package module01.Tasks1_4.task03;

import module01.Tasks1_4.task02.MaxSubarraySum;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = MaxSubarraySum.createAnArray();
        int[] distinctArray = removeDuplicatesFromArray(array);
        for (int i : distinctArray){
            System.out.println(i);
        }
    }

    public static int[] removeDuplicatesFromArray(int[] arr){
        return Arrays.stream(arr).distinct().toArray();
    }
}

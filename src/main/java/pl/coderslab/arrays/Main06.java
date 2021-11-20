package pl.coderslab.arrays;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7};
        int[] secondNumbers = {3, 4};

        int resultLength = Math.min(numbers.length, secondNumbers.length);
        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; ++i) {
            result[i] = numbers[i] + secondNumbers[i];
        }

        System.out.println(Arrays.toString(result));
    }
}
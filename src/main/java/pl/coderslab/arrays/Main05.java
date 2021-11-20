package pl.coderslab.arrays;

import java.util.Arrays;

public class Main05 {

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 5, 4, 3, 2, 1, 8, 0};

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
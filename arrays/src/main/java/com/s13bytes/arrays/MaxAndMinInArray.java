package com.s13bytes.arrays;

import java.util.Arrays;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 39, 4, 2, 5};

        System.out.print("Array Elements, : ");
        for (int k : arr) System.out.print(k + " ");

        System.out.print("\nMax Element of array : " + getMax(arr));
        System.out.print("\nMin Element of array : " + getMin(arr));

    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
//        return Arrays.stream(arr).max().getAsInt();
    }

    private static int getMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        return min;
//        return Arrays.stream(arr).min().getAsInt();
    }
}

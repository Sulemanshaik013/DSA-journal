package com.s13bytes.arrays;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 39, 4, 2, 5};

        System.out.print("Array Elements, : ");
        for (int k : arr) System.out.print(k + " ");

        System.out.print("\nMin Element of array : " + getMin(arr));
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

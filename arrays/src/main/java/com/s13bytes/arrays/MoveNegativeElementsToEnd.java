package com.s13bytes.arrays;

public class MoveNegativeElementsToEnd {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        System.out.print("Array Elements, before  : ");
        for (int k : arr)
            System.out.print(k + " ");
        segregateElements(arr);
        System.out.print("\nArray Elements, After  : ");
        for (int k : arr)
            System.out.print(k + " ");
    }

    private static void segregateElements(int[] arr) {
        int idx = 0;
        int length = arr.length;
        int[] temp = new int[length];
        for (int val : arr) {
            if (val >= 0) {
                temp[idx++] = val;
            }
        }
        for (int val : arr) {
            if (val < 0) {
                temp[idx++] = val;
            }
        }
        System.arraycopy(temp, 0, arr, 0, length);
    }
}

package com.s13bytes.arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 4, 3, 4, 2, 5};

        System.out.print("Array Elements, before revere : ");
        for (int k : arr)
            System.out.print(k + " ");

        /*
        reverseArrayUsingNativeApproach(arr);

        reverseArrayUsingTemporaryVariable(arr);

        reverseArrayUsingTwoPointers(arr);
        */

        System.out.print("\nArray Elements, after reverse : ");
        for (int j : arr)
            System.out.print(j + " ");
    }

    private static void reverseArrayUsingNativeApproach(int[] arr) {
        int length = arr.length;
        int[] temp = new int[length];
        for (int idx = 0; idx < length; idx++) {
            temp[idx] = arr[length - idx - 1];
        }
        for (int idx = 0; idx < length; idx++) {
            arr[idx] = temp[idx];
        }
//        System.arraycopy(temp, 0, arr, 0, length);
    }

    private static void reverseArrayUsingTemporaryVariable(int[] arr) {
        int length = arr.length;
        for (int idx = 0; idx < length / 2; idx++) {
            int temp = arr[idx];
            arr[idx] = arr[length - idx - 1];
            arr[length - idx - 1] = temp;
        }
    }

    private static void reverseArrayUsingTwoPointers(int[] arr) {
        int length = arr.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
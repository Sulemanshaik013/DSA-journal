package com.s13bytes.arrays;

public class Sort0s1sand2s {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 0, 1, 2};

        System.out.print("Array Elements, before  : ");
        for (int k : arr)
            System.out.print(k + " ");

        int zeroscnt = 0;
        int onescnt = 0;
        int twoscnt = 0;
        for (int val : arr) {
            if (val == 0) {
                zeroscnt++;
            }
            if (val == 1) {
                onescnt++;
            }
            if (val == 2) {
                twoscnt++;
            }
        }
        for (int i = 0; i < zeroscnt; i++) {
            arr[i] = 0;
        }
        for (int i = zeroscnt; i < zeroscnt + onescnt; i++) {
            arr[i] = 1;
        }
        for (int i = zeroscnt + onescnt; i < zeroscnt + onescnt + twoscnt; i++) {
            arr[i] = 2;
        }
        System.out.print("\nArray Elements, after : ");
        for (int k : arr)
            System.out.print(k + " ");
    }

    private static void sort012(int[] arr, int n) {
        int start = 0;
        int mid = 0;
        int end = n - 1;

        while (mid <= end) {
            switch (arr[mid]) {
                case 0: {
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(arr, mid, end);
                    end--;
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int start, int mid) {
        int temp = arr[start];
        arr[start] = arr[mid];
        arr[mid] = temp;
    }
}

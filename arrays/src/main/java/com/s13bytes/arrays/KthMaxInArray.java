package com.s13bytes.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMaxInArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 39, 4, 2, 5};
        int k = 3;

        System.out.print("Array Elements, : ");
        for (int j : arr) System.out.print(j + " ");

        Arrays.sort(arr);
        System.out.print(k + "th largest element is, : " + arr[arr.length - k]);

        int kthMax = getKthMax(arr, k);
        System.out.println(k + "th smallest element is, : " + kthMax);
    }

    private static int getKthMax(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : arr) {
            pq.offer(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

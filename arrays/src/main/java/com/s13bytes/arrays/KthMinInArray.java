package com.s13bytes.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinInArray {
    public static void main(String[] args) {
        int[] arr = {6, 7, 4, 39, 4, 2, 5};
        int k=3;

        System.out.print("Array Elements, : ");
        for (int p : arr) System.out.print(p + " ");

        Arrays.sort(arr);
        System.out.println("\n"+k + "th smallest element is, : " + arr[k-1]);

        int kthMin = getKthMin(arr, k);
        System.out.println(k + "th smallest element is, : " + kthMin);

    }

    private static int getKthMin(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int val: arr){
            pq.offer(val);
            if(pq.size()> k){
                pq.poll();
            }
        }
        return pq.peek();
    }

}

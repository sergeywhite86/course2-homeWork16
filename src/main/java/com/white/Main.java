package com.white;


import com.white.homework.Util;

import java.util.Random;

public class Main {
    private final static int SIZE = 100_000;

    public static void main(String[] args) {
        Random random = new Random();

        Integer[] arr1 = new Integer[SIZE];
        Integer[] arr2 = new Integer[SIZE];
        Integer[] arr3 = new Integer[SIZE];

        for (int i = 0; i < SIZE; i++) {
            int value = random.nextInt();
            arr1[i] = value;
            arr2[i] = value;
            arr3[i] = value;
        }

        long start1 = System.currentTimeMillis();
        Util.sortBubble(arr1);
        System.out.println("Bubble sort : " + (System.currentTimeMillis() - start1)); // 21353

        long start2 = System.currentTimeMillis();
        Util.sortSelection(arr2);
        System.out.println("Selection sort : " + (System.currentTimeMillis() - start2)); // 4175

        long start3 = System.currentTimeMillis();
        Util.sortInsertion(arr3);
        System.out.println("Insertion sort : " + (System.currentTimeMillis() - start3)); // 7061
    }
}
package com.java.sprint3;

import java.util.Arrays;
import java.util.Scanner;

public class GT_24_Becky {
    /*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers in each array to combine them: ");
        int[] a = {sc.nextInt(), sc.nextInt()};
        int[] b = {sc.nextInt(), sc.nextInt()};

        System.out.println(Arrays.toString(GT_24_Becky.plusTwo(a, b)));
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] c = {a[0], a[1], b[0], b[1]};
        return c;
    }
}


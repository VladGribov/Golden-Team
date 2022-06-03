package com.java.sprint3;
/*Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.*/
import java.util.Arrays;
import java.util.Scanner;

public class TW_Sprint3_FrontPiece_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the elements in the Array");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(frontPiece(nums)));
    }
    public static int[] frontPiece(int[] nums) {
        int[] newNums = new int[2];
        if (nums.length >= 2) {
            newNums = new int[]{nums[0], nums[1]};
        } else if (nums.length == 0) {
            newNums = new int[]{};
        } else {
            newNums = new int[]{nums[0]};
        }
        return newNums;
    }
}
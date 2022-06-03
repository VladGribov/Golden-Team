package com.java.sprint3;
/*We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.*/
import java.util.Scanner;

public class TW_Sprint3_Unlucky1_Array {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of the elements in the Array");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the Array elements");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(unlucky1(nums));
    }

    public static boolean unlucky1(int[] nums) {
        if (nums.length < 2) {
            return false;
        } else if ((nums[0] == 1) && (nums[1] == 3) || (nums[1] == 1) && (nums[2] == 3) ||
                (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
            return true;
        } else {
            return false;
        }
    }
}
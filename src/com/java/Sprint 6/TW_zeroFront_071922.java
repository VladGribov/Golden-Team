package com.java.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HW_zeroFront_071922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int length = sc.nextInt();
        int[] nums = new int[length];
        System.out.println("Enter elements of the array one by one:");
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] newNums = new int[nums.length];   // New array consists of zeroes
        int indexOfDigit = newNums.length - 1;    // Last index for non zero digit

        for (int num : nums) {  // Loop for all elements of the Array
            if(num != 0){
                newNums[indexOfDigit] = num;    // Add at the last index of new array element of
                                            // first array, if it's not equals to zero .
                indexOfDigit--;     // Then set index to the next from the right to left prepare
                                    // this index to add there new not zero value.
            }
        }
        System.out.println(Arrays.toString(newNums));
    }
}

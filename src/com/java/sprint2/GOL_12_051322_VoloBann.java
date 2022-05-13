package com.java.sprint2;

import java.util.Arrays;
import java.util.Scanner;

public class GOL_12_051322_VoloBann {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array (2 <= length <= 10^4): ");
        int length = sc.nextInt();
        System.out.println("Enter the number you want to find sum (-109 <= target <= 109): ");
        int target = sc.nextInt();
        System.out.println("Enter the elements of the array (-10^9 <= element <= 10^9): ");
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

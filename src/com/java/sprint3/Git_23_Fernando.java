package com.java.sprint3;

import java.util.Arrays;
import java.util.Scanner;

public class Git_23_Fernando {
    public static void main(String[] args) {

        System.out.println("Given an array of ints of even length, " +
                "return a new array length 2 containing the middle two elements from the original array. " +
                "The original array will be length 2 or more.");
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle()));
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle2()));
        System.out.println();
        System.out.println(Arrays.toString(getMakeMiddle3()));
    }

    public static int[] getMakeMiddle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6 numbers");
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};


        if (nums.length <= 2) {
            return new int[]{nums[0], nums[1]};
        } else if (nums.length == 4) {
            return new int[]{nums[1], nums[2]};
        } else if (nums.length == 6) {
            return new int[]{nums[2], nums[3]};
        } else {
            return nums;
        }

    }

    public static int[] getMakeMiddle2() {

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int[] nums2 = {sc2.nextInt(), sc2.nextInt()};

        if (nums2.length <= 2) {
            return new int[]{nums2[0], nums2[1]};
        } else if (nums2.length == 4) {
            return new int[]{nums2[1], nums2[2]};
        } else if (nums2.length == 6) {
            return new int[]{nums2[2], nums2[3]};
        } else {
            return nums2;
        }

    }

    public static int[] getMakeMiddle3() {

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Enter 4 numbers");
        int[] nums3 = {sc3.nextInt(), sc3.nextInt(), sc3.nextInt(), sc3.nextInt()};

        if (nums3.length <= 2) {
            return new int[]{nums3[0], nums3[1]};
        } else if (nums3.length == 4) {
            return new int[]{nums3[1], nums3[2]};
        } else if (nums3.length == 6) {
            return new int[]{nums3[2], nums3[3]};
        } else {
            return nums3;
        }

    }

}
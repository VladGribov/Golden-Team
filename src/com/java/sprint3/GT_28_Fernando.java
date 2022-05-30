package com.java.sprint3;

import java.util.Arrays;
import java.util.Scanner;

public class GT_28_Fernando {
    public static void main(String[] args) {





        System.out.println(Arrays.toString(getMaxTriple()));
        System.out.println(Arrays.toString(getMaxTriple2()));
        System.out.println(Arrays.toString(getMaxTriple3()));

    }

    public static int[] getMaxTriple() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Given an array of ints of odd length, look at the first, last, and middle values in the array" + "\n"
                + "and return the largest. The array length will be a least 1." + "\n" +
                "===Numbers must be greater than 0===" + "\n" + "\n" + "Enter 7 digits");

        int[] nums = {sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};



        int x = nums.length / 2;
        int a = nums.length - 1;

        for (int i = 0; i < nums[i]; i++) {

            if (nums[i] > nums[x] && nums[i] > nums[a]) {
                return new int[]{nums[i]};
            } else if (nums[x] > nums[i] && nums[x] > nums[a]) {
                return new int[]{nums[x]};
            } else {
                return new int[]{nums[a]};
            }
        }
        return nums;
    }


    public static int[] getMaxTriple2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digits");

        int[] nums2 = {sc.nextInt(), sc.nextInt(),sc.nextInt(), sc.nextInt(), sc.nextInt()};



        int x = nums2.length / 2;
        int a = nums2.length - 1;

        for (int i = 0; i < nums2[i]; i++) {

            if (nums2[i] > nums2[x] && nums2[i] > nums2[a]) {
                return new int[]{nums2[i]};
            } else if (nums2[x] > nums2[i] && nums2[x] > nums2[a]) {
                return new int[]{nums2[x]};
            } else {
                return new int[]{nums2[a]};
            }
        }
        return nums2;
    }

    public static int[] getMaxTriple3() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 digits");

        int[] nums3 = {sc.nextInt(), sc.nextInt(),sc.nextInt()};



        int x = nums3.length / 2;
        int a = nums3.length - 1;

        for (int i = 0; i < nums3[i]; i++) {

            if (nums3[i] > nums3[x] && nums3[i] > nums3[a]) {
                return new int[]{nums3[i]};
            } else if (nums3[x] > nums3[i] && nums3[x] > nums3[a]) {
                return new int[]{nums3[x]};
            } else {
                return new int[]{nums3[a]};
            }
        }
        return nums3;
    }
}

package com.java.utilities;

import java.util.Arrays;
import java.util.Scanner;

public class GetUser {
    public String[] getStrArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        sc.nextLine();
        for(int i = 0; i < arr.length; i++){
            System.out.println("Index " + i + ": ");
            arr[i] = sc.nextLine();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new GetUser().getStrArr()));
    }
}

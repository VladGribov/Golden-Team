package com.java.sprint1;
// Given 2 int values greater than 0,
// return whichever value is nearest to 21 without going over.
// Return 0 if they both go over.
import java.util.Scanner;

public class FernandoGOL20 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two digits");
        System.out.println(max(sc.nextInt(), sc.nextInt()));


    }


    public static int max(int a, int b) {


        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;

        } else if (b > 21) {
            return a;
        }

        int sumA = 21 - a;
        int sumB = 21 - b;

        if (sumA > sumB) {
            return b;
        } else {
            return a;
        }


    }
}
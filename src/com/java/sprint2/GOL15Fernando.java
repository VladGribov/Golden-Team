package com.java.sprint2;

import java.util.Scanner;

public class GOL15Fernando {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = sc.nextLine();
        System.out.println("Enter your separator you'd like to use");
        String sep = sc.nextLine();
        System.out.println("Enter a number");
        int count = sc.nextInt();



        String newWord = "";

        for (int i = 0; i < count; i++) {
            if (i < count - 1) {
                newWord += word + sep;
            } else newWord += word;
        }
        System.out.println(newWord);

    }
}

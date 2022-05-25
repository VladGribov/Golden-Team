package com.java.test;

public class Gol14Test_Becky {

    public static String repeatEnd(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str.substring(str.length() - n);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println (Gol14Test_Becky.repeatEnd("Hello", 3));
        System.out.println (Gol14Test_Becky.repeatEnd("Goodbye", 2));
        System.out.println (Gol14Test_Becky.repeatEnd("Morning", 1));
        System.out.println (Gol14Test_Becky.repeatEnd("@Hi!", 4));
        System.out.println (Gol14Test_Becky.repeatEnd("", 0));

    }
}

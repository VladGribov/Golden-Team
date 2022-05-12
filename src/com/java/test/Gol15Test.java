package com.java.test;

public class Gol15Test {
    public String repeatSeparator(String word, String sep, int count) {
        String newStr = "";
        for(int i = 0; i < count; i ++){
            newStr = newStr + word + sep;
        }
        return newStr.substring(0, newStr.length()-sep.length());
    }

    public static void main(String[] args) {
        System.out.println(new Gol15Test().repeatSeparator("A", "1", 1000000));
    }
}

package com.java.sprint2;

public class GOL_17 {
    public static void main(String[] args) {

        String result = "";
        String str = new String();
        for (int i=0; i<str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        System.out.println(result);;
    }

}

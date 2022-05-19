package com.java.sprint2;

public class GOL_16 {
    public static void main(String[] args) {

        String result = "";
        String str = new String();
        for (int i = 0; i <str.length() ; i++) {
            result = result + str.substring(0, i+1);
        }
        System.out.println(result);
    }
}

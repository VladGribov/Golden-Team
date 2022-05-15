package com.java.sprint2;

import java.util.Locale;

public class AndriyGOL19 {
    public String stringYak(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                temp += str.charAt(i);
            }
        }
        return temp;
    }
}
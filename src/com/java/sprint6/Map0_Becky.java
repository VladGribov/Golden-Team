package com.java.sprint6;

import java.util.HashMap;
import java.util.Map;

public class Map0_Becky {

    public static void main(String[] args) {
        System.out.println(word0(new String[]{"a", "b", "a", "b"}));
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, 0);
        }
        return map;
    }

}

package com.java.sprint4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapAB4_Vladimir {
    public Map<String, String> mapAB4(Map<String, String> map) {
        if(!map.containsKey("a") || !map.containsKey("b")){
            return map;
        }
        if(map.get("a").length() < map.get("b").length()){
            map.put("c", map.get("b"));
        } else if(map.get("a").length() > map.get("b").length()){
            map.put("c", map.get("a"));
        } else if(map.get("a").length() == map.get("b").length()){
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MapAB4_Vladimir m = new MapAB4_Vladimir();
        HashMap<String, String> map = new HashMap<>();
        System.out.println("Map contains \"a\" yes or no?");
        String a = sc.nextLine().toLowerCase();
        if(a.equals("yes")){
            System.out.println("Enter value for \"a\":");
            map.put("a",sc.nextLine());
        }
        System.out.println("Map contains \"b\" yes or no?");
        String b = sc.nextLine().toLowerCase();
        if(b.equals("yes")){
            System.out.println("Enter value for \"b\":");
            map.put("b", sc.nextLine());
        }
        System.out.println("Result:");
        System.out.println(m.mapAB4(map));
    }
}

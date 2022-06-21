package com.java.sprint4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    public class mapAB3 {
        public static void main(String[] args) {

            Map<String, String> map = new HashMap<String, String>();

            Scanner sc = new Scanner(System.in);
            System.out.println("Try entering one of the following bellow.");
            System.out.println("Enter a and then enter aaa");
            System.out.println("Enter b and then enter bbb");
            System.out.println("Enter c and then enter cake");
            map.put(sc.next(), sc.next());
            map.put(sc.next(), sc.next());

            if (!map.containsKey("a") && map.containsKey("b")) {
                map.put("a", map.get("b"));
                map.put("b", map.get("b"));
                System.out.println(map.entrySet());
            } else if (map.containsKey("a") && !map.containsKey("b")) {
                map.put("a", map.get("a"));
                map.put("b", map.get("a"));
                System.out.println(map.entrySet());
            } else {
                System.out.println(map);
            }

        }
}

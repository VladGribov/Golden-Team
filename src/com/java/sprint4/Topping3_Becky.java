package com.java.sprint4;
/*
Given a map of food keys and topping values,
modify and return the map as follows:
if the key "potato" has a value, set that as the value for the key "fries".
If the key "salad" has a value, set that as the value for the key "spinach".
ex:
topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}
 */
import java.util.HashMap;
import java.util.*;

public class Topping3_Becky {
    public static void main(String[] args) {
        Map <String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose key: potato or salad?");
        String strKey = sc.nextLine();

        System.out.println("Choose value: ketchup, butter or oil?");
        String strValue = sc.nextLine();

        map.put(strKey, strValue);
        System.out.println(topping3(map));
    }
    public static Map<String, String> topping3(Map<String, String> map) {
        if(map.containsKey("potato")){
            map.put("fries", map.get("potato"));
        }
        if(map.containsKey("salad")){
            map.put("spinach", map.get("salad"));
        }
        return map;
    }

}

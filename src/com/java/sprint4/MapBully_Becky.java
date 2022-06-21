package com.java.sprint4;
import java.util.*;
/*Modify and return the given map as follows: if the key "a" has a value,
set the key "b" to have that value, and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */

public class MapBully_Becky {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a or b (key):");
        String strKey = sc.nextLine();
        System.out.println("Enter any word(value):");
        String strValue = sc.nextLine();

        map.put(strKey, strValue);

        System.out.println(mapBully(map));
    }

    public static Map<String, String> mapBully(Map<String, String> map) {

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

}

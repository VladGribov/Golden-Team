package com.java.sprint3;

import java.util.*;

public class GT_26_Vlad {
    /*
    Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
    https://leetcode.com/problems/word-pattern/
     */
    //Problem is asking for a 1-1 match between each pair
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, String> map = new HashMap<>();
        String[] p_arr = pattern.split("");
        String[] s_arr = s.split(" ");
        if(p_arr.length != s_arr.length){
            return false;
        }
        for (int i = 0; i < p_arr.length; i++) {
            if(map.containsKey(p_arr[i]) && !map.get(p_arr[i]).equals(s_arr[i]) ){
                return false;
            }
            for(Map.Entry<String, String> value : map.entrySet()){
                if(s_arr[i].equals(value.getValue()) && !p_arr[i].equals(value.getKey())){
                    return false;
                }
            }
            //check double value
            map.put(p_arr[i], s_arr[i]);
        }
        //compare s_arr with map if s_arr[i] does not appear in map return false
        for (Map.Entry<String, String> value : map.entrySet()) {
            boolean match = false;
            for(int i = 0; i < s_arr.length; i++){
                if (value.getValue().equals(s_arr[i]) && value.getKey().equals(p_arr[i])) {
                    match = true;
                }
            }
            if (!match) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        GT_26_Vlad w = new GT_26_Vlad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pattern to check string against: ");
        String p = sc.nextLine();
        System.out.println("Enter String to check: ");
        String s = sc.nextLine();
        System.out.println(w.wordPattern(p,s));
    }
}

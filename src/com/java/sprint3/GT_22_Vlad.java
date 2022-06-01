package com.java.sprint3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GT_22_Vlad {
    //Pascals Triangle
    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
    https://leetcode.com/problems/pascals-triangle/
    */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            if (i == 1) {
                row.add(1);
                list.add(row);
                continue;
            }
            row.add(1);
            if (i != 2) {
                for (int j = 0; j < temp.size() - 1; j++) {
                    row.add(temp.get(j) + temp.get(j + 1));
                }
            }
            row.add(1);
            list.add(row);
            temp = row;
        }
        return list;
    }
    public void display(int numRow){
        System.out.println(generate(numRow));
    }
}
class Main {
    public static void main(String[] args) {
        GT_22_Vlad p = new GT_22_Vlad();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number of rows to generate:");
        int num = sc.nextInt();
        p.display(num);
    }
}

package com.java.sprint2;
/* User Story GOL-14: I as user “ABC”, I want to get  n repetitions
of the last n characters of the string so that I can enter a string
and get result as n repetitions of the last n characters.
 */
import java.util.Scanner;

public class GOL_14_051322_VoloBann {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("Enter a number of repetitions of the last n characters of the string: ");
        int number = sc.nextInt();
        System.out.println(repeatEnd(string, number));
    }

    public static String repeatEnd(String str, int n) {
        String newStr = "";
        for (int i = 0; i < n; i++) {
            newStr += str.substring(str.length() - n);
        }
        return newStr;
    }
}
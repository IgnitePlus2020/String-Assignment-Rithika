//Compare two strings and check if they are the same or no

package com.tgt.igniteplus;

import java.util.Arrays;
import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string 2 : ");
        String str2 = sc.nextLine();
        if (str1.length() != str2.length())
            System.out.println("The strings are not same ");
        else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            if (Arrays.equals(string1, string2) == true) {
                System.out.println("The strings are the same");
            } else {
                System.out.println("The strings are not same ");
            }
        }
    }
}

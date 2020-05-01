//Write a program to remove hyphen (-) from the given string only if it is in b/w digits .
//Review : Test this string : "-134-10/5566 A-block, New Manyata Tech-Park" and fix the code

package com.tgt.igniteplus;

import java.util.Scanner;

public class RemoveHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        char[] string = str.toCharArray();
        char[] newStringArray = new char[str.length()];
        int i, j = 0;
        for (i = 0; i < str.length(); i++) {
            //Added string[i]=='-'
            if ((string[i] == '-') || ((string[i] == '-') && (Character.isDigit(string[i - 1])) &&
                    (Character.isDigit(string[i + 1])))) {
                continue;
            } else {
                newStringArray[j] = string[i];
                j++;
            }
        }
        System.out.print("After removing hyphen : ");
        System.out.print(newStringArray);
    }
}

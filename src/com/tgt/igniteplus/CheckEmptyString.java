//Check if the string is empty
//OUTPUT :
//        Enter the string :          (if you click enter)
//        The string is empty
//
//OUTPUT 2 :
//        Enter the string :
//        ABCD
//        The string is not empty and has the value : ABCD


package com.tgt.igniteplus;

import java.util.Scanner;

public class CheckEmptyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        if (str.equals("")) {
            System.out.println("The string is empty ");
        } else {
            System.out.println("The string is not empty and has the value : " + str);
        }
    }
}

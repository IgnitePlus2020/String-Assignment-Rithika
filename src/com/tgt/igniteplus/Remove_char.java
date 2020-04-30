package com.tgt.igniteplus;

import java.util.Scanner;

public class Remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("t", "");       //used replaceAll
        System.out.println("The modified String is : " + str);
    }
}

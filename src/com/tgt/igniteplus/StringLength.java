//Determine the length of the string

//OUTPUT :
//        Enter the String :
//        Hi my name is rithika
//        The Length of the String : 21


package com.tgt.igniteplus;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("The Length of the String : " + len);
    }
}

//Write a program to check if a string contains only digits

//OUTPUT 1 :
//        Enter the string :
//        &er123
//        String does not contain only digits


//OUTPUT 2 :
//        Enter the string :
//        123456
//        String contains only digits

        package com.tgt.igniteplus;

import java.util.Scanner;

public class StringDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        int i, flag = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0' || (str.charAt(i) == '1') ||(str.charAt(i)) == '2'||
            str.charAt(i) == '3' || str.charAt(i) == '4'|| str.charAt(i) == '5' || str.charAt(i) == '6' ||
                    str.charAt(i) == '7' || str.charAt(i) == '8' || str.charAt(i) == '9')
            {
                flag = 1;   //if digit is encountered
                continue;
            }
            else
            {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("String contains only digits ");
        } else {
            System.out.println("String does not contain only digits ");
        }
    }
}

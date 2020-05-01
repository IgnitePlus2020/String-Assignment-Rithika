//Write a program to demonstrate ways to compare two Strings in Java
//demonstrate : string methods : ==, equals(), compareTo(), equalsIgnoreCase()

package com.tgt.igniteplus;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the string 2 : ");
        String str2 = sc.nextLine();
        do {
            System.out.println("Select the built in string methods : ");
            System.out.println("1. equals()");
            System.out.println("2. ==");
            System.out.println("3. compareTo");
            System.out.println("4. equalsIgnoreCase()");
            System.out.println("5. compareToIgnoreCase");
            System.out.println("Enter choice :");
            choice = sc.nextInt();
        } while (choice < 1 && choice > 5);
        if(str1.length()!=str2.length())
            System.out.println("The strings are not equal");
        else
        {
            switch (choice) {
//******************************************************************************************************************
                case 1:
                    if (str1.equals(str2))
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;
//******************************************************************************************************************
                case 2:
                    char[] string1= str1.toCharArray();
                    char[] string2= str2.toCharArray();
                    for(int i=0;i<string1.length;i++)
                    {
                        if (string1[i] == string2[i])
                            System.out.println("Strings are equal");
                        else
                            System.out.println("Strings are not equal");
                    }
                    break;
//******************************************************************************************************************
                case 3:
                    int y = str1.compareTo(str2);
                    if (y == 0)
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;
//******************************************************************************************************************
                case 4:
                    if (str1.equalsIgnoreCase(str2))
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;
//******************************************************************************************************************
                case 5:
                    y=str1.compareToIgnoreCase(str2);
                    if(y==0)
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;
            }
        }
    }
}
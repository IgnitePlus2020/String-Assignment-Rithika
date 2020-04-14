//Write a program to remove all the occurence of a given character from an input String(remove all T/t's)

//OUTPUT :
//        Enter the string : To test this string
//        After removing t/T's = o es his sring

package com.tgt.igniteplus;

import java.util.Scanner;

public class Remove_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        str= str.toLowerCase();
        int i,j=0;
        char[] str2=new char[str.length()];
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='t')
            {
                continue;
            }
            else
            {
                str2[j]=str.charAt(i);
                j++;
            }
        }
        System.out.print("After removing t/T's :  ");
        for(i=0;i<str2.length;i++)
        {
            System.out.print(str2[i]);
        }

    }
}

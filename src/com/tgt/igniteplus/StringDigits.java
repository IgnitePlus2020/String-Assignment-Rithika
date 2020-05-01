//Review comment : why do you need flag ? use System.out.println() in if-else block itself.

//If a string contains only digits
package com.tgt.igniteplus;

import java.util.Scanner;

public class StringDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();
        if(str.matches("[0-9]+")) //regex function
             System.out.println("String contains only digits ");
        else
            {
                System.out.println("String does not contain only digits ");
            }

        }
    }

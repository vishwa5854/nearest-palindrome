package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = Integer.toString(n);
        StringBuilder b = new StringBuilder();
        for(int i=0;i<a.length()/2;i++){
            b.append(a.charAt(i));
        }
        if(a.length() %2 == 0) {
            String c = b.toString() + b.reverse();
            System.out.println(c + "is the nearest palindrome according to cut method");
            System.out.println(BruteForce.bruteMethod(n) + "is the nearest palindrome according to brute");
        }
        else {
            String c = b.toString() + a.charAt(a.length()/2) + b.reverse();
            System.out.println(c + "is the nearest palindrome");
            System.out.println(BruteForce.bruteMethod(n) + "is the nearest palindrome according to brute");
        }
    }
}
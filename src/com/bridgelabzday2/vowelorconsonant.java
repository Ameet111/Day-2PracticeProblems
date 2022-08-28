package com.bridgelabzday2;

import java.util.Scanner;

public class vowelorconsonant {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
            case 'm':
            case 'i':
            case 't':
            case 'j':
            case 'A':
            case 'M':
            case 'I':
            case 'T':
            case 'J':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is a consonant.");
        }
    }

}

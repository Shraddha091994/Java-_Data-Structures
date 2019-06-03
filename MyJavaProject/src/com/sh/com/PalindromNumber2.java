package com.sh.com;

import java.util.Scanner;

public class PalindromNumber2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();// yaha pe number get kiya
		int rev = 0, rem, temp;
		temp = no;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (no == rev) {
			System.out.println(no + " is palindrome nu");
		} else {
			System.out.println(no + " not palindrome nu");
		}
	}
}

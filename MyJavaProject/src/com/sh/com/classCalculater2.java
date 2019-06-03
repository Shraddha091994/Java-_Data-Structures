package com.sh.com;

import java.util.Scanner;

public class classCalculater2 {
	public static void main(String[] args) {
		String yn;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter fist no");
			int no1 = s.nextInt();
			System.out.println("Enter second no");
			int no2 = s.nextInt();
			System.out.println("Select Symbol (+, -, *, /)");
			String sym = s.next();
			int res;
			switch (sym) {
			case "+":
				res = no1 + no2;
				System.out.println("add is : + "+ res);
				break;
			case "-":
				res = no1 - no2;
				System.out.println("sub is : +" +res);
				break;
			case "*":
				res = no1 * no2;
				System.out.println("mul is : +"+ res);
				break;
			case "/":
				res = no1 / no2;
				System.out.println("div is : +"+ res);
				break;
			default:
				System.out.println("invalid symbol");
				break;
			}
			System.out.println("Do you want to continue (press for yes and n for no)");
			yn = s.next();
		} while (yn.equals("y") || yn.equals("Y"));

	}
}

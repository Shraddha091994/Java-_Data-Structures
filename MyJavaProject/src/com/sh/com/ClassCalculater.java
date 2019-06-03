package com.sh.com;

public class ClassCalculater {
	public static void main(String[] args) {
		int no1 = 10, no2 = 20, res;
		String sum = "+";
		switch (sum) {
		case "+":
			res = no1 + no2;
			res = 10 + 20;
			System.out.println("res");
			break;
		case "-":
			res = no1 - no2;
			res = 10 - 20;
			System.out.println("res");
			break;
		default:
			System.out.println("invalid symbol");
			break;

		}

	}

}

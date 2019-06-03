package com.sh.com;

public class ClassSwapNumber {
	public static void main(String[] args) {
		int a = 45, b = 55;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a:" + a);
		System.out.println("b:" + b);

	}

}

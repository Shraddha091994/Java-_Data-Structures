package com.sh.com;

public class FibonacciSeriesusingRec {
	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.println(a + "" + b);
		FibonacciSeriesusingRec ob = new FibonacciSeriesusingRec();
		ob.printFib(10);
	}

	void printFib(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;
			printFib(i - 1);
		}
	}

}

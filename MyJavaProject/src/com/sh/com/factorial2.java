package com.sh.com;

public class factorial2 {
	static int fact = 1;

	public static void main(String[] args) {
		int no = 7;
		factorial2 ob = new factorial2();
		ob.calcfact(no);
		System.out.println("res" + no + " : " + fact);
	}

	void calcfact(int no) {
		if (no >= 1) {
			fact = fact * no;
			calcfact(no - 1);
		}

	}

}

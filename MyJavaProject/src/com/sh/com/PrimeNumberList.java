package com.sh.com;

public class PrimeNumberList {
	public static void main(String[] args) {
		for (int no = 1; no <= 100; no++) {
			int temp = 0;
			for (int i = 2; i <= 10; i++) {
				if (no % i == 0) {
					temp = temp + 1;
				}
			}
			if (temp == 0) {
				System.out.println(no);
			}
		}
	}
}

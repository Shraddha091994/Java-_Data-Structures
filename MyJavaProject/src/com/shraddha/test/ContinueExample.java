package com.shraddha.test;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			if (i == 8) {
				continue;
			}
			System.out.println(i);
		}
	}

}

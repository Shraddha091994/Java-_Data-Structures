package com.shraddha.test;

public class ContinueExample2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 2 && j == 2) {
					continue;
				}
				System.out.println(i + "  " + j);
			}
		}
	}

}

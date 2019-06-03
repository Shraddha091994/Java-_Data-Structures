package com.shraddha.test;

public class LabeledForExample {
	public static void main(String[] args) {
		aa: for (int i = 4; i <= 4; i++) {
			bb: for (int j = 1; j <= 7; j++) {
				if (i == 4 && j == 3) {
					break aa;
				}
				System.out.println(i + " " + j);
			}
		}
	}

}

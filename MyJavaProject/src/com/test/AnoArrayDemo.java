package com.test;

public class AnoArrayDemo {
	public static void main(String[] args) {
		AnoArrayDemo.Sum(new int[] { 10, 30 });
	}

	static void Sum(int[] no) {
		int total = 0;
		for (int i : no) {
			total = total + i;
		}
		System.out.println("Sum " + total);
	}
}
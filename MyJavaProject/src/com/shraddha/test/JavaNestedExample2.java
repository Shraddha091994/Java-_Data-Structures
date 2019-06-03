package com.shraddha.test;

public class JavaNestedExample2 {
	public static void main(String[] args) {
		int age = 25;
		int weight = 55;
		if (age >= 18) {
			System.out.println("Test");
			if (weight > 50) {
				System.out.println("You are eligble to donet blod");
			} else {
				System.out.println("You are not eligble to donet blod");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}

}

package com.shraddha.test;

public class WrpperInSwitchCaseExample {
	public static void main(String[] args) {
		Integer age = 17;
		switch (age) {
		case (16):
			System.out.println("You are Under 18.");
			break;
		case (18):
			System.out.println("You are eligible for vote.");
			break;
		case (65):
			System.out.println("You are senior citizen.");
			break;
		default:
			System.out.println("Please give the valid age.");
			break;
		}

	}

}

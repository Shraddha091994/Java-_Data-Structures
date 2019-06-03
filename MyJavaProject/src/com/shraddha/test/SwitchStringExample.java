package com.shraddha.test;

public class SwitchStringExample {
	public static void main(String[] args) {
		String levelstring = "Beginner";
		int level = 0;
		switch (levelstring) {
		case "Beginner":
			level = 1;
			break;

		case "Intermed":
			level = 2;
			break;

		case "Expert":
			level = 3;
			break;

		default:
			level = 0;
		}
		System.out.println("Your level is :" + level);
	}
}

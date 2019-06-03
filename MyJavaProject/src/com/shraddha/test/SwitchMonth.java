package com.shraddha.test;

public class SwitchMonth {
	public static void main(String[] args) {
		int month = 2;
		String monthString = "";
		switch (month) {
		case 1:
			monthString = "1 - January";
			break;
		case 2:
			monthString = "2 - February";
			break;
		case 3:
			monthString = "3 - March";
			break;
		case 4:
			monthString = "4 - April";
			break;
		default:
			System.out.println("Invalid month");

		}
		System.out.println(monthString);
	}

}

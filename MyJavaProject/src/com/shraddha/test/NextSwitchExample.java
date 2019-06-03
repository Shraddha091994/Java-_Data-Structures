package com.shraddha.test;

public class NextSwitchExample {
	public static void main(String[] args) {
		{
			char branch = 'M';
			int collageYear = 4;
			switch (collageYear) {
			case 1:
				System.out.println("English,Maths,Science");
				break;
			case 2:
				switch (branch) {
				case 'C':
					System.out.println("Operating System Java Data Structure ");
					break;
				case 'E':
					System.out.println("Micro Processor,Logic Switching theory");
					break;
				case 'M':
					System.out.println("Drawing, Manu facturing Machines");
					break;
				}
				break;
			case 3:
				switch (branch) {
				case 'C':
					System.out.println("Computer Organization , MultiMedia");
					break;
				case 'E':
					System.out.println("Fundamentals of Logic Design , Microelectronics");
					break;
				case 'M':
					System.out.println("Internal Communication Engines , Mechaniced Vibration");
					break;
				}
				break;
			case 4:
				switch (branch) {
				case 'C':
					System.out.println("Data Communication and Network , MultMedia");
					break;
				case 'E':
					System.out.println("Embedded System , Image Processing");
					break;
				case 'M':
					System.out.println("Production Technology , Thermal Engineering");
					break;
				}
			}
		}
	}
}

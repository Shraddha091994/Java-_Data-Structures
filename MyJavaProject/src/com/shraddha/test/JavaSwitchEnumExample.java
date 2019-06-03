package com.shraddha.test;

public class JavaSwitchEnumExample {
	public enum Week {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	}

	public static void main(String[] args) {
		Week[] DayNow = Week.values();
		for (Week Now : DayNow) {
			switch (Now) {
			case Sun:
				System.out.println("Sun");
				break;
			case Mon:
				System.out.println("Mon");
				break;
			case Tue:
				System.out.println("Tue");
				break;
			case Wed:
				System.out.println("Wed");
				break;
			case Thu:
				System.out.println("Thu");
				break;
			case Fri:
				System.out.println("Fri");
				break;
			case Sat:
				System.out.println("Sat");
				break;
			}
		}

	}

}

package com.yedam;

public class Calendar {
	static void showMonth() {
		// Sun Mon Tue Wed Thu Fri Sat
		// ===========================
		// 1 2 3
		// 4 5 6 7 8 9 10
		// 11 12 13 14 15 16 17
		// 18 19 20 21 22 23 24
		// 25 26 27 28 29 30 31

	}// end of showMonth.

	public static void output(String string) {
		System.out.print(string);
	}

	public static boolean isLeapYear(int num1) {
		if (num1 % 4 == 0) {
			if (num1 % 100 != 0) {
				return true;
			} else if (num1 % 400 == 0) {
				return true;
			}
		}
		return false;
	}
}// end of class.

package com.yedam;

import java.util.Scanner;

public class ObjectExe {
static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		Calendar.output("year 입력 >>");
		int num1 = Integer.parseInt(scn.nextLine());
		if(Calendar.isLeapYear(num1)) { //true, false
			Calendar.output("윤년입니다.\n");
		} else {
			Calendar.output("평년입니다.\n");
		}
	}
	
}// end of class

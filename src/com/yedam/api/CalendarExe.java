package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
 * Calendar : 날짜, 시간 관련.
 * Date : 날짜, 시간,
 */
public class CalendarExe {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int year = 0;
		int month = 0;

		while (true) {
			System.out.println("년도를 입력하세요");
			try {
				year = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("다시 입력해주세요");
			}
		}

		while (true) {
			System.out.println("월을 입력하세요");
			try {
				month = Integer.parseInt(scn.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("다시 입력해주세요");
			}
		}

		makeCalendar(year, month);

	}// end of main

	// 달력 만들기

	public static void makeCalendar(int year, int month) {
		System.out.printf("%4d년 %02d월 \n", year, month);
		printShape("=", 28);
		
	}

	public static void printShape(String str, int cnt) {
		String str1 = "";
		for(int i = 0; i < cnt; i++) {
			str1 += str;
		}
		System.out.println(str1);
	}
	
	
	
	
	
	
	
	
	
	
	public static void date() {
		Date today = new Date();
		System.out.println(today.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 생성자의 매개값으로 포맷지정.
		String timeStr = sdf.format(today);
		System.out.println(timeStr);
		// 2025-05-12 13:22:38

		try {
			// 문자열을 날짜형식으로 변환
			today = sdf.parse("2025-08-01 09:00:00");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static void calc() {
		// Calendar 클래스.
		Calendar now = Calendar.getInstance(); // sql의 sysdate

		// 시간변경.
		now.set(2025, 0, 1);
		now.set(Calendar.YEAR, 2024);

		// 요일.
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		switch (dayOfWeek) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		}

		System.out.printf("년도 %d, 월: %d, 날짜: %d \n", now.get(Calendar.YEAR) //
				, now.get(Calendar.MONTH) //
				, now.get(Calendar.DATE) //
				, now.get(Calendar.DAY_OF_WEEK) //
				, now.getActualMaximum(Calendar.DATE)//
		);
	}
}

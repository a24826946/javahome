package com.yedam.exception;

import java.util.Scanner;

public class ExceptionExe2 {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("1. 메뉴 2.종료");
			System.out.print("선택 >>");
			int menu = 0;
			try {
				menu = Integer.parseInt(scn.nextLine());

			} catch (NumberFormatException e) {

			}
			switch (menu) {
			case 1:
				백업();
				break;
		
			case 2:
				run = false;
				scn.close();
				return;
				
			default:
				System.out.println("1또는 2를 입력해주세요");
			}
			
		}

		// NullPointerException
//		String str = null;
//		try {
//			System.out.print(str.toString());
//		} catch (NullPointerException e) {
//			System.out.println("포멧이 비정상.");
//		}

	}// end of main.
}// end of class.

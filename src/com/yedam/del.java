package com.yedam;

import java.util.Scanner;

public class del {
//	public static void main(String[] args) {
//		int cnt = 0;
//		boolean run = true;
//		while (run) {
//			output("모또");
//			cnt++;
//			if (cnt % 5 == 0) output("하");
//			System.out.println();
//			if (cnt == 10) run = false;
//		}
//	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		output("숫자 맞추기 게임\n");
		boolean isRun = true;
		int randomNum = (int) (Math.random() * 100) + 1;
		while (isRun) {
			int input = Integer.parseInt(scn.nextLine());
			if(randomNum == input) {
				output("정답입니다.\n");
				isRun = false;
			} else if (randomNum > input) {
				output("업\n");
			} else {
				output("다운\n");
			}
		}
	}
	public static void output(String msg) {
		System.out.print(msg);
	}
	

	
}

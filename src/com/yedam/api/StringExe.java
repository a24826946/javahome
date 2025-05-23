package com.yedam.api;

import java.util.Scanner;

public class StringExe {
	
	public static void main(String[] args) {
		ssn();
	}// end of main.
	
	public static void ssn() {
		Scanner scn = new Scanner(System.in);
		
		String[] sample = {
				"0011193000000"
				, "891206-2000000"
				, "070811 4234567"
				
		};
		
		for(int i = 0; i < sample.length; i++) {
			String sex = sample[i].substring(sample[i].length() - 7, sample[i].length() - 6);
			switch (sex) {
			case "1":
			case "3":
				System.out.println(sample[i] + "는 남자입니다.");
				break;
				
			case "2":
			case "4":
				System.out.println(sample[i]+ "는 여자입니다.");
				break;
			}	
		}
		
		
//		System.out.println("주민등록번호 앞자리와'-'뒤의 한자리를 입력해주세요>>");
//		String ssn = scn.nextLine();
		
//		char sex = ssn.charAt(7);
	}//end of ssn.
	
	
	
		
	
	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void str() {
		
		String str1 = new String("Hello");
//		str1 = new String(new byte[] {72, 101, 108, 108, 111}); //헬로랑 같음
		
		System.out.println(str1.charAt(1));//"문자열",'문'
		System.out.println(str1.indexOf("o"));//"문자열",'문'
		
	}
	
	
}// end of class.

package com.yedam;
/*
 * 메소드 연습
 * 1) 메소드의 선언.
 * 2) 매개변수.
 * 3) 반환유형.
 */

import com.yedam.member.Member;

public class Calculator {
	// 필드.
	// 생성자.
	// 메소드.
	String printStar(int times, String shape) { // 매개변수 (times)
		String str = "";
		for (int i = 1; i <= times; i++) {
//				System.out.println(shape);
			str += shape + "\n";
		}
		return str;
	}// end of printStar.
	
	
//메소드 오버로딩.
	int add(int num1, int num2) {
		return num1 + num2;
	}

	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	
	//정수배열을 매개값으로 받는 add.반환유형은 double.
	double add(int[] ary) {
		double result = 0;
		
		return result;
	}
	
	
	//배열에서 포인트가 제일 큰 사람을 찾아서 반환
	Member getMaxPoint(Member[] memberAry ) {
		//결과값
		Member max = null; //아이디, 이름, 연락처, 포인트.
		int maxPoint = 0; //포인트를 비교하기위함 변수
		for(int i = 0; i < memberAry.length; i++ ) {
			memberAry [i] .get
		}
			
		return max;
		
	}
	
	
	
	
}//end of nay===max

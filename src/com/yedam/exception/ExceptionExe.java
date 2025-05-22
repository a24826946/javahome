package com.yedam.exception;
/*
 * 
 *  1) 일반예외 - 컴파일러가 에러부분을 파악.
 */
public class ExceptionExe {
	public static void main(String[] args) {
		String numStr = "a";
		int num = 0 ;
		
		try { // 일단 해볼게
			num = Integer.parseInt(numStr); // 정수 데이터 타입 변수 num에 정수로 변환해서 넣어볼게
		} catch (NumberFormatException e) { // 오류 종류 ( 정수형 데이터 타입이 아니라서 오류났어? )			
			// 대체할 코드
			System.out.println("에러 발생!! 비상비상비상 삐용삐용");
		}
		
		System.out.println(num);
		
		
		
		
		
		
		
//		try {
//
//			Class.forName("java.utill.Scanner");
//			
//		}catch(ClassNotFoundException e) {
//			
//			System.out.println("일반예외발생.");
//			
//		}
		System.out.println("end of prog");
	}
}

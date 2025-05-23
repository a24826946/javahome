package com.yedam.api;

public class SystemExe {
	public static void main(String[] args) {
		//
		long now = System.currentTimeMillis();
		System.out.println(now);
		int day = (int)(now /86400);//1747964906/60/60/24;
		System.out.println(day);
		int hour = (int) ((now - (day * 86400))/3600);
		System.out.println(hour);
		int min = (int) (now - ((day * 86400)+(hour * 3600))/60);
		System.out.println(min);

		
	}// end of main.

	public static void exe() {
		
		long start = System.nanoTime(); // System.currentTimeMillis();
		int sum = 0;
		
		for (int i = 0; i < 100000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();
		System.out.printf("합계 : %d 소요시간 : %d", sum, ( end - start ));
		
	}
	
	
	
	
	
}// end of class.

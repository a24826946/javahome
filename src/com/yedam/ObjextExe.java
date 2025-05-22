package com.yedam;

public class ObjextExe {
	public static void main(String[] args) {
		//호출.
		Calendar.showMonth();
		output("Sun Mon Tue Wed Thu Fri Sat");
		output(line("=", 30));
		
	}//end of main
	
	static void output(String msg) {
		System.out.println(msg);
	}
	
	static String line(String str, int cnt) {
		String fmt = "";
		for(int i = 0; i < cnt; i++) {
			fmt += str;
		}
		return fmt;
	}

}//end of class










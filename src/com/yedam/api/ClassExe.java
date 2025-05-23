package com.yedam.api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExe {

	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("com.yedam.api.Member");
			System.out.println(cls.getName());
			Member member = new Member();
			
			System.out.println(cls.getName());
			//선언된 필드.
			Field[] fieldAry = cls.getDeclaredFields();
			for (Field field : fieldAry) {
				System.out.println(field.getName());// 필드명.
			}
			//메소드.
			Method[] methodAry = cls.getDeclaredMethods();
			for (Method method : methodAry) {
				
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}//end of main.
	
	
	
	
	
}//end of class.

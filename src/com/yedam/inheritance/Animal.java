package com.yedam.inheritance;

/*
 *  추상클래스 (Animal): 인스턴스 생성X
 *  				 추상 메소드\
 *  자식클래스 : Bird, Fish.
 */
public abstract class Animal {
	String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

//추상 메소드: 자식클래스에 반드시 재정의 해야함.
	public abstract void sound();

}// end of class.

package com.yedam.inheritance;

public class PhoneExe {
public static void main(String[] args) {
	//부모클래스
	CellPhone phone1 = new CellPhone();
	phone1.model = "IT203";
	phone1.color = "red";
	phone1.powerOn();
	phone1.powerOff();
	
	//자식클래스.
	SmartPhone phone2 = new SmartPhone();
	phone2.model = "S21";
	phone2.color = "white";
	phone2.powerOn();
	phone2.powerOff();
	
	SmartPhone phone3 = null;;
	if (phone2 instanceof SmartPhone) {
		phone3 = 
	}
}
}

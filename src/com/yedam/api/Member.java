package com.yedam.api;

public class Member extends Object {
	public String memberName;
	public int age;

	public Member() {
	}

	public Member(String memberName, int age) {
		this.memberName = memberName;
		this.age = age;
	}
	
	

	// 이름, 점수 => 같으면 논리적으로 동등한지.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 매개값의 유형이 Member임.
			Member member = (Member) obj;
			return this.memberName == member.memberName
					&& this.age == member.age;
		}
		return false;
	}

	





}


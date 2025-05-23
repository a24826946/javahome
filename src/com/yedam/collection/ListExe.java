package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import com.yedam.api.Member;

/*
 *  인덱스를 사용해서 객체를 관리.
 *  순서를 가지고 중복된 값 가능.
 */
class Student {
	private int studentNo; // 1001, 1002, 1003...1010;
	private int score;

	public Student(int studentNo, int score) {
		this.studentNo = studentNo;
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
}

public class ListExe {
	public static void main(String[] args) {

		// 10~100점 점수를 임의의 값으로 생성. 정수 10개 생성.
//		List<??> numbers = new ??? <>();
		// 10개의 점수의 합, 평균 출력.
		List<Student> numbers = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int score = (int) ((Math.random() * 91) + 10);
			numbers.add(new Student(1000 + i, score));
		}
		System.out.println(numbers);

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += numbers.get(i).getScore();
		}
		System.out.println("합계는 " + sum);

		double avg = (double) sum / numbers.size();
		System.out.println("평균은 " + avg);

	}

	public static void exe2() {

		List<Member> members = new ArrayList<>();
//		int[] ary = {10, 20, 30.4};
		// 인터페이스 -구현클래스
		List<String> list = new ArrayList<String>();
		list.add("10");
		list.add(new String("Hello"));

		list.add(1, "20"); // 위치지정
		list.add("김홍동");

		// 삭제
//		list.remove(0);

		String search = "김홍동";
		for (int i = 0; i < members.size(); i++) {
			if (members.get(i).memberName.equals(search)) {
				members.remove(i);
			}
		}
		// 목록 출력.
		for (int i = 0; i < members.size(); i++) {
			System.out.println(members.get(i).toString());
		}

		for (Object item : list) {
			String result = (String) item;
			System.out.println(result);

		}
	}
}

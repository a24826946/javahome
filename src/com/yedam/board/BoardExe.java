package com.yedam.board;

import java.util.Scanner;

/*
 * 추가(addBoard)
 *  /수정(modifyBoard) - 글번호, 바뀔내용, 바뀔제목
 *  /삭제(removeBoard) - 글번호
 *  /목록(boardList) - 상세화면 조회
 *  /조회기능(getBoard) - 글번호 - > 글반환
 *  /순번부여(nextSequence)
 */

public class BoardExe {
	// 필드.
	private Board[] boards; // 데이터 저장.
	Scanner scn = new Scanner(System.in);
	private int bno = 2; // 배열인덱스를 2지정.

	// 생성자.
	public BoardExe() {
		boards = new Board[100];
		boards[0] = new Board(10, "날씨가 좋습니다.", "오늘기온이30도를 넘어요", "은경");
		boards[1] = new Board(11, "자바가 힘들어요.", "자바는 힘들지않아요", "대환");
	}

	// 메소드.
	void execute() {
		boolean run = true;
		System.out.print("아이디를 입력하세요 >> ");
		String userId = scn.nextLine();
		System.out.print("비밀번호를를 입력하세요 >> ");
		String passwd = scn.nextLine();
		//아이디 입력.
		//비밀번호 입력
		if(!UserExe.login(userId, passwd)) {
			return;//true, false
		}
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.추가 2.수정 3.삭제 4.목록 5종료");
			System.out.println("---------------------------");
			System.out.print("선택>>");
			int selectNo = 0;
			try {
				selectNo = Integer.parseInt(scn.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("다시 입력 ㄱㄱ");
			}
			
			switch (selectNo) {
			case 1: // 추가
				addBoard();
				break;
			case 2: // 수정
				modifyBoard();
				break;
			case 3: // 삭제
			case 4: // 목록
				boardList();
				break;
			case 5: // 종료
			default:
				System.out.println("메뉴를 다시 선택하세요.");
			}// end of switch.
		} // end of while.
	} // end of execute.

	// 기능.
	// "글번호를 입력하세요>> "1
	// "제목을 입력하세요>> " 오늘은 덥네요.
	// "내용을 입력하세요>> " 오늘 기온이 30도가 넘습니다.
	// "작성자를 입력하세요>> " 홍길동
	// "추가 성공"/"추가실패" 메세지 출력.
	void addBoard() {

		int no = nextSequence();

		String title = userMessage("제목을 입력하세요>>");

		String content = userMessage("내용을 입력하세요>>");

		String writer = userMessage("작성자를 입력하세요>>");
		// Board인스턴스 선언하고 값을 지정.
		Board board = new Board(no, title, content, writer);
		// 배열에 저장.
		boards[bno++] = board;
		System.out.println("추가성공");

	} // end of addBoard.

	/* 기능 */
	// 글번호 제목 작성자
	// ==============================
	// 1 날씨가 좋아요 홍길동
	// 2 클래스 멋짐! 김민규
	// 3 자바어려움!!! 박석민
	// 4 그래도 열심히! 김민규
	// -------------------------------
	// 상세보기: 글번호입력, 메뉴로 이동(q)
	// -------------------------------

	// ** 등록된 글이 없습니다 **
	void boardList() {
		//sort();
		int page = 1;
		//while반복문
		int start = (page - 1) * 5;
		int end = start + 5;
		System.out.println("글번호 제목            작성자");
		System.out.println("==============================");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				boards[i].showInfo();
			}
		}
		// 상세보기
		System.out.println("-------------------------------");
		System.out.println("상세보기: 글번호입력, 메뉴로 이동(q)");
		System.out.println("-------------------------------");
		String str = scn.nextLine();
		// 메뉴,상세
		if (str.equals("q")) {
			return;
		} else {
			int no = Integer.parseInt(str);
			getBoard(no).showAllInfo(); // boards[i]
		}
		System.out.println();
	}

	// 수정.
	void modifyBoard() {
		int bno = userMenu("수정할 글번호 입력");
		String title = userMessage("수정할 제목 입력");
		String content = userMessage("수정할 내용 입력");
		//
		Board result = getBoard(bno);
		result.setContent(content);
		result.setTitle(title);
		System.out.println("수정완료.");

	}// end of modifyBoard.

	// 삭제.
	void removeBoard() {
		int bno = userMenu("삭제할 글번호 입력");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == bno)
				boards[i] = null;
			System.out.println("삭제완료");
		}
	}

//단건조회(getBoard)
	// 글번호를 활용해서 배열에서 조회하고 Board반환
	Board getBoard(int boardNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == boardNo) {
				return boards[i];
			} // end of getBoard.

		}
		return null;
	}
//sort 정렬.
	void sort() {
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			for (int i = 0; i < boards.length - 1; i++) {
				if (boards[i + 1] == null) {
					continue;
				}
				if (boards[i] == null) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
					continue;
				}
				if (boards[i].getBoardNo() < boards[i + 1].getBoardNo()) {
					temp = boards[i];
					boards[i] = boards[i + 1];
					boards[i + 1] = temp;
				}
			}
		}
	} // end of sort.

	// 사용자의 입력값을 반환.
	String userMessage(String msg) {
		System.out.println(msg); // userMessage(여기 있는 내용 출력 [msg])
		return scn.nextLine(); // 사용자로부터 입력받은 내용 반환
	}

	int userMenu(String msg) {
		System.out.print(msg + ">> ");
		return Integer.parseInt(scn.nextLine());
	}
	
	//순번생성
	int nextSequence() {
		int max = 0;
		// boards[] = { 0, 1, 2 .... 100 };
		// boards[0].getBoardNo();
		// boards[1].getBoardNo();
		// boards[3]에는 null 값
		for (int i = 0; i< boards.length; i++) {
			if (boards[i] != null && max < boards[i].getBoardNo()) {
				max = boards[i].getBoardNo();
			}
		}
		return max + 1;
	}

}// end of class
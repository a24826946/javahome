package com.yedam.board;

class User {
	private String userId;
	private String passwd;
	private String userName;

	public User(String userId, String passwd, String userName) {
		super();
		this.userId = userId;
		this.passwd = passwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}

public class UserExe {

	static User[] users = { //
			new User("holy", "1111", "김영광")//
			, new User("cutie", "2222", "홍예쁨")//
			, new User("guest", "3333", "밤손님")
//
	};

	// 아이디, 비밀번호 =>
	static boolean login(String uname, String passwd) {
		for (int i = 0; i < users.length; i++ ) {
			if (users[i].getUserId().equals(uname) && users[i].getPasswd().equals(passwd)) {
				return true;
			}
		}

		return false;

	}
}

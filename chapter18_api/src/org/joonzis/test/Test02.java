package org.joonzis.test;

class User{
	String id, password;

	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "아이디 : " + id + "비밀번호 : " + password;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			User another = (User)obj;
			return id.equals(another.id) && password.equals(another.password);
		}else {
			return false;
		}
	}
}

public class Test02 {

	public static void main(String[] args) {
		
		User user1 = new User("rudalsfive", "dec");
		User user2 = new User("rudalsfive", "de");
		
		if(user1.equals(user2)) {
			System.out.println("아이디 비밀번호 일치");
		}else {
			System.out.println("아이디 비밀번호 불일치");
		}
	}

}

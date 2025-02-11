package org.joonzis.test;

class Phone{
	String owner;
	public Phone() {}
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void sendCall() {
		System.out.println(owner + "가 전화를 겁니다");
	}
	
	public void receiveCall() {
		System.out.println(owner + "가 전화를 받습니다");
		
	}
}

interface Computable{
	public void connectInternet();
	public void playApp();
}

class SmartPhone extends Phone implements Computable{
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	@Override
	public void connectInternet() {
		System.out.println("인터넷에 연결되었습니다");
	}
	
	@Override
	public void playApp() {
		System.out.println("앱을 실행합니다");
	}
}
public class Test01 {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone("경민");
		
		phone.sendCall();
		phone.receiveCall();
		
		phone.connectInternet();
		phone.playApp();
	}

}

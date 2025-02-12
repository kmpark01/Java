//Q4. Test04.java
//interface Car					메소드 : info();
//class Bus implements Car
//class CityTourBus extends Bus
//class SeoulBus extends Bus
//class Taxi implements Car
//class Bicycle
//class Test04					메소드 : static <T extends Car> void onlyCar(T car) 
// - CityTourBus, SeoulBus, Taxi 정보 출력

package org.joonzis.test;

interface Car{
	public void info();
}

class Bus implements Car{

	@Override
	public void info() {
		//System.out.println("버스입니다.");
	}
}

class CityTourBus extends Bus{

	@Override
	public void info() {
		System.out.println("시티 투어 버스");
	}
	
}

class SeoulBus extends Bus{
	@Override
	public void info() {
		System.out.println("서울 버스");
	}
}

class Taxi implements Car{

	@Override
	public void info() {
		System.out.println("택시입니다");
	}
}

class Bicycle{
	public void info() {
		System.out.println("자전거입니다");
	}
}

public class Test04 {
	
	public static<T extends Car> void onlyCar(T car) {
		car.info();
	}

	public static void main(String[] args) {
		CityTourBus cityTourBus = new  CityTourBus();
		SeoulBus seoulBus = new SeoulBus();
		Taxi taxi = new Taxi();
		Bicycle bicycle = new Bicycle();
		
		onlyCar(cityTourBus);
		onlyCar(seoulBus);
		onlyCar(taxi);
		//onlyCar(bicycle);
		// TODO 자동 생성된 메소드 스텁

	}

}

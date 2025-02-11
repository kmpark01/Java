package org.joonzis.test;

interface Providable{
	public void sightseeing();
	public void leisure();
	public void food();
}

class KoreaTour implements Providable{
	
	@Override
	public void food() {
		System.out.println("한식을 먹습니다");
	}
	
	@Override
	public void leisure() {
		System.out.println("레저 스포츠를 합니다");
	}
	
	@Override
	public void sightseeing() {
		System.out.println("산책을 갑니다");
	}
	
}

class GuamTour implements Providable{
	
	@Override
	public void food() {
		System.out.println("양식을 먹습니다");
	}
	
	@Override
	public void leisure() {
		System.out.println("레저 스포츠를 합니다");
	}
	
	@Override
	public void sightseeing() {
		System.out.println("산책을 갑니다");
	}
}

class TourGuide{
	private Providable tour;
	
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	
	public void leisure() {
		tour.leisure();
	}
	
	public void food() {
		tour.food();
	}
	
}

public class Test02 {
	public static void main(String[] args) {
		
		Providable koreatour = new KoreaTour();
		Providable guamtour = new GuamTour();
				
		System.out.println("한국관광");
		koreatour.food();
		koreatour.sightseeing();
		koreatour.leisure();
		
		System.out.println("괌관광");
		guamtour.food();
		guamtour.sightseeing();
		guamtour.leisure();
	}
}



package org.joonzis.test;

public class Song {
	
	String title, country;

	public Song(String title, String country) {
		super();
		this.title = title;
		this.country = country;
	}
	
	void output() {
		System.out.println("제목 : " + title + "," + " 국가 : " + country);
	}
}

package org.joonzis.test;

public class Singer {
	
	String name;
	
	Song song;
	
	public Singer(String name) {
		super();
		this.name = name;
	}

	void setSong(Song song) {	
		this.song = song;
	}
	
	void output() {
		song.output();
		System.out.println("가수 :" + name);
	} 

}

package org.joonzis.test;

public class Singer {
	String name;
	int idx = 0;
	Song[] songList;

	public Singer(String name, int size) {
		super();
		this.name = name;
		this.songList = new Song[size];
	}
	
	void setSong(Song song) {
		if(idx < songList.length) {
			songList[idx] = song;
			idx++;
		}
	}
	
	void output() {
		System.out.println("이름 : " + name);
		for(int i = 0; i < idx; i++) {
			songList[i].output();
		}
	}
}

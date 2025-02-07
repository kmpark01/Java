package org.joonzis.test;

public class SingerSongMain {

	public static void main(String[] args) {
		
		Singer singer = new Singer("이창섭", 5);
		
		Song song1 = new Song("천상연", "한국");
		Song song2 = new Song("죽을만큼 아파서", "한국");
		
		singer.setSong(song1);
		singer.setSong(song2);
		
		singer.output();
	}
}

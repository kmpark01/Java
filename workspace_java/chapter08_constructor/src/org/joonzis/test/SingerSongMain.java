package org.joonzis.test;

public class SingerSongMain {

	public static void main(String[] args) {
		
		Song song = new Song("천상연", "한국");
		Singer singer = new Singer("이창섭");
		singer.setSong(song);
		singer.output();

	}

}

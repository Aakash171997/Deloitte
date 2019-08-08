package com.interfaces;

interface Radio{
	static int FREQUENCY = 100;
	void play();
}

interface MusicPlayer{
	void songsList();
}

interface ModernMusicPlayer{
	void playFromCloud();
}

class Mobile implements Radio, MusicPlayer, ModernMusicPlayer{

	@Override
	public void songsList() {
		System.out.println("Music List");
	}

	@Override
	public void play() {
		System.out.println("Play on phone");
	}

	@Override
	public void playFromCloud() {
		System.out.println("Play from Spotify");	
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.play();
		mobile.songsList();
		mobile.playFromCloud();
		System.out.println(Radio.FREQUENCY);
	}
}

package com.innerDemo;

interface Radio{
	void play();
	void pause();
}

public class Demo3 {
	
	public static void main(String[] args) {
		Radio r = new Radio() {//Anonymous Inner Class

			@Override
			public void play() {
				System.out.println("Play");
				
			}

			@Override
			public void pause() {
				System.out.println("Pause");
				
			}
			
		};
		
		r.play();
		r.pause();
	}

}

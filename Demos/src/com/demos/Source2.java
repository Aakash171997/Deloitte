package com.demos;

public class Source2 {
	
	int i;//gets initialized automatically
	
	public void display() {
		int j=0;//does not get initialized automatically
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		Source2 d = new Source2();
		d.display();

	}

}

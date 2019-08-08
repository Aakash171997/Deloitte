package com.innerDemo;

class AA {
	int i;
	static class BB {
		int j;
		
		public void display() {
			System.out.println("BB display called");
			j = 200;
		}
	}
}

public class Demo2 {
	
	public void display() {
		class DD{
			
		}
	}
	
	public static void main(String[] args) {
		AA.BB b = new AA.BB();
		b.display();
	}

}

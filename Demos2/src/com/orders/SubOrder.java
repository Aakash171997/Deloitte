package com.orders;

class Order{
	int i;
	static {
		System.out.println("order static");
	}
	Order(){
		i = 10;
		System.out.println("i= "+i);
	}
	{
		System.out.println("instance i ="+i);
	}
}

public class SubOrder extends Order {
	int j = 9;
	static {
		System.out.println("suborder static");
	}
	public SubOrder() {
		System.out.println("j= "+j);
	}
	{
		System.out.println("inst j="+j);
	}
}

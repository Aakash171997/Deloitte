import java.util.*;
public class StackTest{
	public static void main(String[] args){
		GenStack<String> gs = new GenStack<String>();
		System.out.println("Pushing Apple, Orange, Guava and Pineapple into the stack...");
		gs.push("Apple");
		gs.push("Orange");
		gs.push("Guava");
		gs.push("Pineapple");
		System.out.println("...Done...\n");
		System.out.println("There are now " + gs.size() + " items in the stack and the top item is " + gs.peek() + ".\n");
		System.out.println("When the " + gs.size() + " items in the stack are Popped, they are displayed as: ");
		while (gs.hasItems())
			System.out.println(gs.pop());
		System.out.println("\nNow there are " + gs.size() + " item(s) in the stack and the top item is " + gs.peek() + ".\n");
	}
}
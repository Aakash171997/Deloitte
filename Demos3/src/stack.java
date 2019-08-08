import java.util.*;
class stack
{
public static void main(String args[])
{
Stack<Integer> stack1 = new Stack<Integer>();
try {
stack1.push(new Integer(0));
stack1.push(new Integer(1));
stack1.push(new Integer(2));
stack1.push(new Integer(3));
stack1.push(new Integer(4));
stack1.push(new Integer(5));
stack1.push(new Integer(6));
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
System.out.println((Integer) stack1.pop());
}
catch (EmptyStackException e) {}
}
}

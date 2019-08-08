import java.util.*;
class arraylist
{
public static void main(String args[])
{
ArrayList<String> arraylist = new ArrayList<String>();
arraylist.add("Item 0");
arraylist.add("Item 2");
arraylist.add("Item 3");
arraylist.add("Item 4");
arraylist.add("Item 5");
arraylist.add("Item 6");
arraylist.add(1, "Item 1");

System.out.println("\nUsing the add method");
System.out.println(arraylist);
arraylist.remove("Item 5");
System.out.println(arraylist);

System.out.println("\nUsing the Iterator interface");
String s;
Iterator e = arraylist.iterator();
while (e.hasNext())
{
	s = (String)e.next();
	System.out.println(s);
}
}
}

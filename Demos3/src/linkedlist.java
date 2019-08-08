import java.util.*;
class linkedlist
{
public static void main(String args[])
{
LinkedList<String> linkedlist1 = new LinkedList<String>();
linkedlist1.add("Item 2");
linkedlist1.add("Item 3");
linkedlist1.add("Item 4");
linkedlist1.add("Item 5");
linkedlist1.addFirst("Item 0");
linkedlist1.addLast("Item 6");
linkedlist1.add(1, "Item 1");
System.out.println(linkedlist1);
linkedlist1.remove("Item 6");
System.out.println(linkedlist1);
linkedlist1.removeLast();
System.out.println(linkedlist1);

System.out.println("\nUpdating linked list items");
linkedlist1.set(0, "Red");
linkedlist1.set(1, "Blue");
linkedlist1.set(2, "Green");
linkedlist1.set(3, "Yellow");
linkedlist1.set(4, "Purple");
System.out.println(linkedlist1);

}
}

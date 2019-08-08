import java.util.*;
class listiterator
{
public static void main(String args[])
{
LinkedList<String> linkedlist = new LinkedList<String>();
linkedlist.add("Item 0");
linkedlist.add("Item 1");
linkedlist.add("Item 2");
linkedlist.add("Item 3");
linkedlist.add("Item 4");
linkedlist.add("Item 5");
linkedlist.add("Item 6");
ListIterator<String> listiterator = linkedlist.listIterator();
while(listiterator.hasNext()) {
listiterator.set("This is " + listiterator.next());
}
while(listiterator.hasPrevious()) {
System.out.println(listiterator.previous());
}
}
}

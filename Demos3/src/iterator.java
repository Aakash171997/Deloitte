import java.util.*;
class iterator
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
Iterator<String> iterator = linkedlist.iterator();
while(iterator.hasNext()) {
System.out.println(iterator.next());
}
}
}

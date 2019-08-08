import java.util.*;
class comparator
{
	public static void main(String args[])
	{
		TreeSet<String> treeset = new TreeSet<String>(new NewComparator());
		treeset.add("Item 0");
		treeset.add("Item 1");
		treeset.add("Item 2");
		treeset.add("Item 3");
		treeset.add("Item 4");
		treeset.add("Item 5");
		treeset.add("Item 6");
		Iterator<String> iterator = treeset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
class NewComparator implements Comparator<Object>
{
	public int compare(Object obj1, Object obj2)
	{
		if (((String) obj1).equals("Item 3")) return -1;
		return ((String) obj1).compareTo((String) obj2);
	}
}

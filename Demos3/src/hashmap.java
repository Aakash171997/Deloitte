import java.util.*;
class hashmap
{
	public static void main(String args[])
	{
		HashMap<String, String> hashmap1 = new HashMap<String, String>();
		hashmap1.put("Item 0", "Value 0");
		hashmap1.put("Item 1", "Value 1");
		hashmap1.put("Item 2", "Value 2");
		hashmap1.put("Item 3", "Value 3");
		hashmap1.put("Item 4", "Value 4");
		hashmap1.put("Item 5", "Value 5");
		hashmap1.put("Item 6", "Value 6");
		Set<?> set = hashmap1.entrySet();
		Iterator<?> iterator = set.iterator();
		while(iterator.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry mapentry = (Map.Entry) iterator.next();
			System.out.println(mapentry.getKey() + "/" +
					mapentry.getValue());
		}
	}
}

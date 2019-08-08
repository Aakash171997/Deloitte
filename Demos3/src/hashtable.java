import java.util.*;
class hashtable
{
public static void main(String args[])
{
Hashtable<String, String> hashtable1 = new Hashtable<String, String>();
hashtable1.put("Item 0", "Value 0");
hashtable1.put("Item 1", "Value 1");
hashtable1.put("Item 2", "Value 2");
hashtable1.put("Item 3", "Value 3");
hashtable1.put("Item 4", "Value 4");
hashtable1.put("Item 5", "Value 5");
hashtable1.put("Item 6", "Value 6");
Enumeration keys = hashtable1.keys();
while(keys.hasMoreElements()) {
String key = (String) keys.nextElement();
System.out.println(key + "/" + hashtable1.get(key));
}
}
}

import java.util.*;
class properties
{
	public static void main(String args[])
	{
		Properties properties1 = new Properties();
		Set states;
		String outString;
		properties1.setProperty("Property 0", "Value 0");
		properties1.setProperty("Property 1", "Value 1");
		properties1.setProperty("Property 2", "Value 2");
		properties1.setProperty("Property 3", "Value 3");
		properties1.setProperty("Property 4", "Value 4");
		properties1.setProperty("Property 5", "Value 5");
		properties1.setProperty("Property 6", "Value 6");
		outString = properties1.getProperty("Property 3", "Missing");
		System.out.println(outString);
		outString = properties1.getProperty("Property 7", "Missing");
		System.out.println(outString);
	}
}

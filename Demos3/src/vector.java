import java.util.*;
class vector
{
public static void main(String args[])
{
Vector vector = new Vector(5);
System.out.println("Capacity: " + vector.capacity());
vector.addElement(new Integer(0));
vector.addElement(new Integer(1));
vector.addElement(new Integer(2));
vector.addElement(new Integer(3));
vector.addElement(new Integer(4));
vector.addElement(new Integer(5));
vector.addElement(new Integer(6));
vector.addElement(new Double(3.14159));
vector.addElement(new Float(3.14159));
System.out.println("Capacity: " + vector.capacity());
System.out.println("Size: " + vector.size());
System.out.println("First item: " + (Integer)
vector.firstElement());
System.out.println("Last item: " + (Float) vector.lastElement());
if(vector.contains(new Integer(3)))
System.out.println("Found a 3.");
}
}

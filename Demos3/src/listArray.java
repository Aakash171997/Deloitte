import java.util.*; 
class listArray { 
  public static void main(String args[]) { 
    ArrayList<String> arr = new ArrayList<String>(); 
    arr.add("Item 1"); 
    arr.add("Item 2"); 
    arr.add("Item 3"); 
    arr.add("Item 4"); 
    arr.add("Item 5"); 
    arr.add("Item 6"); 
 
    System.out.print("The contents of arr:\n"); 
    Iterator<String> iter = arr.iterator(); 
    while(iter.hasNext()) { 
      String itrTxt = iter.next(); 
      System.out.print(itrTxt + " "); 
    } 
    System.out.println(); 
 
    ListIterator<String> litarr = arr.listIterator();  
    while(litarr.hasNext()) { 
      String itrTxt = litarr.next(); 
      litarr.set(itrTxt + " |_|"); 
    } 
 
    System.out.print("\nContents of arr modified:\n"); 
    iter = arr.iterator();  
    while(iter.hasNext()) { 
      String itrTxt = iter.next(); 
      System.out.print(itrTxt + " "); 
    } 
    System.out.println(); 
 
    System.out.print("\nContents listed backwards:\n"); 
    while(litarr.hasPrevious()) { 
      String itrTxt = litarr.previous(); 
      System.out.print(itrTxt + " "); 
    } 
    System.out.println(); 
  } 
}
# String Class

"String" is a class in ```java.lang``` package and represents an array of characters.

### Common Functions

**concat(String strB)** concatenates the string strB at the end of the string object calling the function

**str1 + str2** the ```+``` operator can be used in place of concat() as well

**substring(int startIndex, int lastIndex)** returns the substring between start and last indices

**charAt(int index)** returns the character at the index

**indexOf(char ch)** returns the int index of the first instance of the ch occuring in the string

> Also exists with indexOf(char ch, int fromIndex), indexOf(String str) and indexOf(String str, int fromIndex)

**toLowerCase()** changes the string to lower case

**toUpperCase()** changes the string to upper case

All the above create temporary objects which must be assigned to a ```new``` object of String class without which, they'll be eligible for garbage collection

**compareTo(String anotherString)** returns 0 if equal, +ve if another string is less than the string invoking it and -ve if otherwise

**equalsIgnoreCase(String anotherString)** return true if the contents of the anotherString are same as the string object invoking it, ignoring the case of the characters in it

**length()** returns the length of the string

### Immutability of a String object

String object is immutable, thus, the ```append(String str)``` is not available. In order to use a string in such a manner, an object of StringBuffer class is needed.

#### StringBuffer class

Can be used the same way as String object, with the addition of ```append()``` set of functions to modify the current string and ```capacity()``` to return the available capacity for the object.
For better efficiency, we can use StringBuilder class as it is non-synchronous.
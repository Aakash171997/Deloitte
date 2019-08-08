package com.exercise;

import java.util.StringTokenizer;

public class Source1 {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";
		
		System.out.println("12th index on string "+str.charAt(11));
		System.out.println("Check if the string contains the word \"is\":-");
		
		StringTokenizer tokenizer = new StringTokenizer(str," ");
		
		boolean yes = false;
		while(tokenizer.hasMoreTokens()) {
			if(tokenizer.nextToken().equals("is")) {
				yes = true;
			}
		}
		
		if(yes) {
			System.out.println("The string contains the word \"is\"");
		}
		
		System.out.println("Concat \"and killed it\" to the end of the string");
		System.out.println(str+" and killed it");
		
		System.out.println("Check if te string ends with \"dog\" - "+str.endsWith("dogs"));
		
		System.out.println("Check if the string is equal to \"The quick brown Fox jumps over the lazy Dog\" - "+str.equals("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.println("Check if the string is equal to \"THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\" - "+str.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		
		System.out.println("Length of the string = "+str.length());
		
		System.out.println("Check if the string matches to \"The quick brown Fox jumps over the lazy Dog\" - "+str.matches("The quick brown Fox jumps over the lazy Dog"));
		
		System.out.println("Replacing \"The\" with \"A\"");
		
		tokenizer = new StringTokenizer(str, " ");
		
		String[] words = new String[tokenizer.countTokens()];
		int i=0;
		
		String newStr = "";
		
		while(tokenizer.hasMoreElements()) {
			words[i] = tokenizer.nextToken();
			i++;
		}
		
		for(String word:words) {
			if(word.equalsIgnoreCase("The")) {
				word = "A";
			}
			newStr+=word+" ";
		}
		
		System.out.println(newStr);
		
		System.out.println("Splitting at \"jumps\"");
		
		for(String splitter: str.split("jumps")) {
			System.out.println(splitter);
		}
		
		System.out.println("Animal Names");
		
		for(String word: words) {
			if(word.equalsIgnoreCase("Fox") || word.equalsIgnoreCase("Dog")) {
				System.out.println(word);
			}
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println("Index of \"a\" "+str.indexOf('a'));
		System.out.println("Last Index of \"e\" "+str.lastIndexOf('e'));
	}

}

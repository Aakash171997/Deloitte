package com.stringDemo;

import java.util.StringTokenizer;

public class Demo3 {

	public static void main(String[] args) {
		String quote = "One small step for man, giant leap for mankind!";
		
		StringTokenizer tokenizer = new StringTokenizer(quote, ",");
		
		String[] quotes = new String[tokenizer.countTokens()];
		int i = 0;
		
		while(tokenizer.hasMoreTokens()) {
			quotes[i] = tokenizer.nextToken();
			i++;
		}
		
		while(i-- > 0) {
			System.out.println(quotes[i]);
		}

	}

}

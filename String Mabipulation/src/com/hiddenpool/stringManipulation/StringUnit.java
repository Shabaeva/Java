package com.hiddenpool.stringManipulation;

public class StringUnit {

	public static void main(String[] args) {
		
		String source = "Hello world!";
		
		String[] words = source.split(" ");
		char[] symbols = words[0].toCharArray();
		char[] symbols2 = words[1].toCharArray();
		
		
		
		System.out.println(words.length);
		System.out.println(words[0]);
		System.out.println(words[1]);
		System.out.println(symbols.length);
		System.out.println(symbols2.length);

	}

}

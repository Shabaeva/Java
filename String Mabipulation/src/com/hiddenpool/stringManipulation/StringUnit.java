package com.hiddenpool.stringManipulation;

public class StringUnit {

	public static void main(String[] args) {
		
		String source = "Hello beautiful green world!";
		
		String[] words = source.split(" ");
		
		for (int i = 0; i< words.length;i++) {
		
		char[] symbols = words[i].toCharArray();
		System.out.println(symbols);
		System.out.println(symbols.length);
		

		}
	}
}

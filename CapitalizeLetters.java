package com.Class.org;
public class CapitalizeLetters {

	public static void main(String[] args) {
		
		String str="The Quick Brown Fox Jumps Over The Lazy Dog.";
		String[] word = str.split(" ");
		for (String s : word) {
		System.out.print(Character.toLowerCase(s.charAt(0)) + s.substring(1, s.length()) + " ");		
	}
}
}
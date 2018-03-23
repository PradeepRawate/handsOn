package com.hcl.programs;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Pradeep";
		String str2 = "PradarP";
		System.out.println("Palindrome function");
		isPalindrome(str);
		isPalindrome(str2);
		System.out.println("Palindrome using Recursion...");
		isPalindromeUsingRecursion(str2);
		isPalindromeUsingRecursion(str);
	}

	private static void isPalindromeUsingRecursion(String str) {
		
		int len = str.length();
		if(len == 0 || len == 1) {
			System.out.println("String is Palindrome");
			return;
		}
		if(str.charAt(0) == str.charAt(len-1)) {
			isPalindromeUsingRecursion(str.substring(1, len-1));
			return;
		}
		System.out.println("String is Not a Palindrome");
	}

	private static void isPalindrome(String str) {
		boolean flag = true;
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt((str.length()-1)-i))
					flag = false;
					break;
		}
		if(flag)	System.out.println("String is Palindrome");
		else System.out.println("String is Not a Palindrome");
	}

}

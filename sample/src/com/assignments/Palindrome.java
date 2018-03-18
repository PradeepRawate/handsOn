package com.assignments;

public class Palindrome {

	public static void main(String[] args) {
		
		String str = new String("pradarp");
		//1st Approach
		if(isPalindrome1(str)) System.out.println(str + " is Palindrome");
		else System.out.println(str + " is NOT Panlindrome");   
		
		//2nd Approach RECURSION
		if(isPalindrome2(str)) System.out.println(str + " is Palindrome");
		else System.out.println(str + " is NOT Panlindrome"); 
	}

	private static boolean isPalindrome2(String str) {
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		if(str.charAt(0) == str.charAt(str.length()-1))
			return isPalindrome2(str.substring(1, str.length()-1));
		return false;
	}

	private static boolean isPalindrome1(String str) {
		boolean flag = true;
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt((str.length()-1)-i)) flag=false;
		}
		return flag;
	}
}

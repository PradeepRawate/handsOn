package com.hcl.programs;

public class StringRecursiveReversal {
	static String str = "Pradeep";
	static String rev = "";
	public static void main(String[] args) {
		System.out.println(reverse(str));
	}
	private static String reverse(String str2) {
		if(str2.length() ==1) {
			System.out.println("if : "+str2);
			return str2;
		} else {
			rev += str2.charAt(str2.length()-1) 
					+ reverse(str2.substring(0, str2.length()-1));
			System.out.println("else :" +rev);
			return rev;
		}
	}
	
	private static String reverse2(String str2, String rev2) {
		if(str2.length() ==1) {
			System.out.println("if : "+str2);
			return str2;
		} else {
			rev += str2.charAt(str2.length()-1) 
					+ reverse2(str2.substring(0, str2.length()-1), str2);
			System.out.println("else :" +rev);
			return rev;
		}
	}
}

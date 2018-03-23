package com.hcl.programs;

import java.util.Scanner;


public class StringManipulations {

	public static void main(String[] args) {
		
		StringManipulations strUtil = new StringManipulations();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		strUtil.removeVowels(str);
		scanner.close();
	}
	
	void removeVowels(String str) {
		System.out.println(str.replaceAll("[AEIOUaeiou]", ""));
	}

}

package com.hcl.assignments;

public class ReverseString {
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.err.println("My name is Pradeep");
		demo.reverseSentence("My name is Pradeep");
		demo.reverse("My name is Pradeep");
		demo.reverseAll("My name is Pradeep");
	}

}

class Demo {

	public void reverseSentence(String str) {
		System.out.println("Reverse sentence ...");
		String arr[] = str.split(" ");
		StringBuilder newStr = new StringBuilder();
		for (int i = arr.length-1; i >= 0; i--) {
			newStr.append(arr[i] + " ");
		}
		System.out.println(newStr);
	}
	
	public void reverse(String str) {
		System.out.println("Reverse words in a sentence ...");
		String arr[] = str.split(" ");
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i <= arr.length-1; i++) {
			String word = arr[i];
			String reverse = "";
			for (int j = word.length()-1; j >= 0 ; j--) {
				reverse += word.charAt(j);
			}
			newStr.append(reverse + " ");
		}
		System.out.println(newStr);
	}
	
	public void reverseAll(String str) {
		System.out.println("Reverse everything ...");
		StringBuilder newStr = new StringBuilder();
		for (int i = str.length()-1; i >= 0 ; i--) {
			newStr.append(str.charAt(i));
		}
		System.out.println(newStr);
	}

}


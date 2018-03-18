package com.assignments;

import java.util.stream.IntStream;

public class BinaryDistance {

	public static void main(String[] args) {
		System.out.println("hello");
		String input = "0100100001";
		IntStream counts = input.chars();
		char[] input2 = input.toCharArray();
		int count = 0;
		int count2 = 0;
		boolean first = false;
		for (char c : input2) {
			if (c == '1') {
				first = true;
				if (count2 < count) {
					count2 = count;
					count = 0;
				}
			} else {
				if (first)
					count++;
			}
		}
		System.out.println(count2);
	}
}

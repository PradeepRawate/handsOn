package com.psr.arrays;


public class Sorting {
	
	private static int[] numbers= {555, 234, 432, 122, 643, 213, 321, 345};
	public static void main(String[] args) {
		getLargest(numbers);
		display(numbers);
	}

	private static void display(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	private static void getLargest(int[] num) {
		int temp = 0;
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
}

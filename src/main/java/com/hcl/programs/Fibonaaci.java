package com.hcl.programs;
public class Fibonaaci {

	static int n1 = 0;
	static int n2 = 1;
	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		fibonacci(10);
		fibonacciRecursive(10);
	}

	private static void fibonacci(int n) {
		while(n > 2) {
			int sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			n--;
		}
	}
	
	private static void fibonacciRecursive(int n) {
		if(n > 2) {
			int sum = n1 + n2;
			System.out.println(sum);
			n1 = n2;
			n2 = sum;
			fibonacciRecursive(n-1);
		}
	}

}

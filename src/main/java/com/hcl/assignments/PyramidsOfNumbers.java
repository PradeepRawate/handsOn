package com.hcl.assignments;

public class PyramidsOfNumbers {

	public static void main(String[] args) {
		display1();
		display2();
//		display3();
//		display4();
	}

	private static void display1() {
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				++num;
			}
			System.out.println();
		}
	}
	private static void display2() {
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4-i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				++num;
			}
			System.out.println();
		}
	}
}

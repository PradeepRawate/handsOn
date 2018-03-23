package com.hcl.assignments;

public class PyramidsOfStars {

	public static void main(String[] args) {
		display1();
		display2();
		display3();
		display4();
	}

	private static void display1() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	private static void display2() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 9-i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	private static void display3() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 9-i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	private static void display4() {
		for (int i = 9; i >= 0; i--) {
			for (int j = 9-i; j > 0; j--) {
				System.out.print(' ');
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

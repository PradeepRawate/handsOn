package com.hcl.programs;
import java.util.Scanner;

class Demo {
	public void pattern1() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0 ; k < rowCount; k++) {
				System.out.print(rowCount + " ");
			}
			rowCount++;
			System.out.println();
		}
		sc.close();
	}
	
	public void pattern2() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k < rowCount; k++) {
				System.out.print(k + " ");
			}
			rowCount++;
			System.out.println();
		}
		sc.close();
	}
	
	public void pattern3() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k < rowCount; k++) {
				System.out.print("* ");
			}
			rowCount++;
			System.out.println();
		}
		sc.close();
	}
	
	public void pattern4() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 0; j < i+i; j++) {
				System.out.print(" ");
			}
			for (int k = 1 ; k < rowCount; k++) {
				System.out.print(k + " ");
			}
			for (int k = rowCount - 2 ; k > 0 ; k--) {
				System.out.print(k + " ");
			}
			rowCount++;
			System.out.println();
		}
		sc.close();
	}
	
	public void pattern5() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = noOfRows;
		for (int i = 1; i < noOfRows; i++) {
			for (int k = 1 ; k <= rowCount; k++) {
				System.out.print(k + " ");
			}
			for (int k = rowCount - 1 ; k > 0 ; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
			for (int j = 0; j < i*2; j++) {
				System.out.print(" ");
			}
			rowCount--;
		}
		sc.close();
	}
	
	public void pattern6() {
		System.out.println("Enter No of Rows to Print :");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		int rowCount = noOfRows;
		for (int i = noOfRows; i > 0; i--) {
			for (int j = 0; j < i+i; j++) {
				System.out.print(" ");
			}
			for (int k = i ; k <= noOfRows; k++) {
				System.out.print(k + " ");
			}
			for (int k = noOfRows - 1 ; k >= i ; k--) {
				System.out.print(k + " ");
			}
			rowCount--;
			System.out.println();
		}
		sc.close();
	}
}


public class Patterns {
	
	public static void main(String[] args) {
		String s = new String("Pradeep");
		s.concat("Rawate");
		System.out.println(s);
//		Demo d = new Demo();
//		d.pattern1();
//		d.pattern2();
//		d.pattern3();
//		d.pattern4();
//		d.pattern5();
//		d.pattern6();
	}
}

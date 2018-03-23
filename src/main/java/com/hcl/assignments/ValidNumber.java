package com.hcl.assignments;
import java.util.Scanner;


public class ValidNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility util = new Utility();
		String input = scanner.next();
		if(util.isValidMobileNo(input) && (input.length() == 10)) System.out.println("Given Input is Valid Mobile Number");
		else System.out.println("Sorry, you entered invalid mobile number");
		scanner.close();
	}
}

class Utility {
	public Boolean isValidMobileNo(String input) {
		try {
			Long.parseLong(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}

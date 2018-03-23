package com.hcl.assignments;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {
public int findDuplicateNumber(List<Integer> numbers){
		int highestNumber = numbers.size() - 1;
		System.out.println(highestNumber);
		int total = getSum(numbers);
		int duplicate = total - (highestNumber*(highestNumber+1)/2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers){
		int sum = 0;
		for(int num:numbers){
		sum += num;
		}
		System.out.println(sum);
		return sum;
	}
	public static void main(String a[]){
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=5;i++){
		numbers.add(i);
		}
		numbers.add(3);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	}
}
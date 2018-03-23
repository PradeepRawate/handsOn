package com.hcl.assignments;
public class DuplicateDemo {

	public static void main(String[] args) {
		DuplicateStrings demo = new DuplicateStrings();
		String[] arr = {"abc","xyz","def","xyz","pqr","def"};
		demo.removeDuplicates(arr);

	}
	
	

}

class DuplicateStrings {
	public void removeDuplicates(String[] arr) {
		String[] nonDuplicates = new String[arr.length];
		for(int i=0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) System.out.println("Duplicate Items : "+arr[i]);
			}
		}
	}
}

package com.hcl.programs;

public class InsertionSort {
	public static void main(String[] args) {
		Sort sort = new Sort();
		sort.insertionSort(new int[]{4,7,2,9,6,1});
	}

}

class Sort {
	void insertionSort(int[] arr) {
		
		for(int i=0; i < arr.length; i++) {
			int j = i-1;
			int key = arr[i];
			while(j >= 0 && key < arr[j] ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			printArray(arr);
			System.out.println("\n");
		}
		printArray(arr);
	}
	
	void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}


//4,7,2,9,6,1
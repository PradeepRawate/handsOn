package com.hcl.programs;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ListDemo {

	public static void main(String[] args) throws IndexOutOfBoundsException {
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		for (Integer integer : list) {
			System.out.println(integer);
		}
		list.add(11);
		System.out.println("..");
//		try {
//			System.out.println(list.get(20));
//		} catch (IndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
//		System.out.println("after exception...");
	}

}

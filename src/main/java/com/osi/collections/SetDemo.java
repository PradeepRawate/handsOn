package com.osi.collections;
import java.util.HashSet;
import java.util.Set;


public class SetDemo {

	public static void main(String[] args) {
		
		Set<Object> set = new HashSet<Object>();
		set.add(1);
		set.add(null);
		set.add("1");
		set.add(null);
		set.add(1.0);
		System.out.println(set);
		for (Object object : set) {
			System.out.println(object);
		}

	}

}

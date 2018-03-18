package com.osi.collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapDemos {

	public static void main(String[] args) {
//		HashMap<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> hashMap = new TreeMap<String, Integer>();
		hashMap.put("4",1);
		hashMap.put("2",4);
		hashMap.put("1",3);
		hashMap.put("5",2);
		for (Entry<String, Integer> obj : hashMap.entrySet()) {
			System.out.println("Key : "+obj.getKey() + " | Value : "+obj.getValue());
		}
		System.out.println("...\n");
		
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(hashMap.entrySet());
		for (Entry<String, Integer> entry : list) {
			System.out.println("Key : "+entry.getKey() + " | Value : "+entry.getValue());
		}
		System.out.println("...\n");
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> arg0,
					Entry<String, Integer> arg1) {
				if(arg0.getValue() > arg1.getValue()) return 1;
				if(arg0.getValue() < arg1.getValue()) return -1;
				else return 0;
			}
		});
		for (Entry<String, Integer> entry : list) {
			System.out.println("Key : "+entry.getKey() + " | Value : "+entry.getValue());
		}
		
		
	}

}

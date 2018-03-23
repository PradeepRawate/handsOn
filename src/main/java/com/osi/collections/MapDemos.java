package com.osi.collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class MapDemos {

	public static void main(String[] args) {
//		HashMap<String, Integer> hashMap = new HashMap<>();
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Rahul",3);
		hashMap.put("Pradeep",4);
		hashMap.put("Suraj",1);
		hashMap.put("Ajay",2);
		for (Entry<String, Integer> obj : hashMap.entrySet()) {
			System.out.println("Key : "+obj.getKey() + " | Value : "+obj.getValue());
		}
		System.out.println("...\n");
		Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
		System.out.println("Sorted by Key");
		for (Entry<String, Integer> obj : treeMap.entrySet()) {
			System.out.println("Key : "+obj.getKey() + " | Value : "+obj.getValue());
		}
		System.out.println("...\n");
		
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(hashMap.entrySet());
/*		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
				if(arg0.getValue() > arg1.getValue()) return 1;
				if(arg0.getValue() < arg1.getValue()) return -1;
				else return 0;
			}
		});*/
		
		//Java 8 Lambda expressions
		list.sort((Entry<String, Integer> arg0, Entry<String, Integer> arg1)->{
				if(arg0.getValue() > arg1.getValue()) return 1;
				if(arg0.getValue() < arg1.getValue()) return -1;
				else return 0;
			});
		System.out.println("Sorted by Value");
		for (Entry<String, Integer> entry : list) {
			System.out.println("Key : "+entry.getKey() + " | Value : "+entry.getValue());
		}
		
		
	}

}

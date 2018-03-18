package com.osi.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortingDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("D", "Pradeep");
		map.put("C", "Abhi");
		map.put("A", "Raaj");
		System.out.println("Sorted Map by Key");
		displayMap(sortByKey(map));
		System.out.println("Sorted Map by Value");
		displayMap(getSortedMapByValue(map));
		/*Map<Employee, String> map = new HashMap();
		Employee e1 = new Employee(2, "Pradeep");
		Employee e2 = new Employee(1, "Pradeep");
		Employee e3 = new Employee(3, "Pradeep");
		map.put(e1, "Pradeep");
		map.put(e2, "Pradeep");
		map.put(e3, "Pradeep");
		Map<Employee, String> sortedMap = new TreeMap<Employee, String>(map);
		sortedMap.forEach((k,v)->{
			System.out.println("KEY : " + k + " VALUE : " + v);});*/
	}

	private static void displayMap(Map<String, String> sortByValue) {
		for (Map.Entry<String, String> entry: sortByValue.entrySet() ) {
			System.out.println(entry);
		}
	}

	private static Map<String, String> sortByKey(Map<String, String> map) {
		Map<String, String> sortedMap = new TreeMap<String, String>(map);
		return sortedMap;
	}

	private static Map<String, String> getSortedMapByValue(
			Map<String, String> map) {
		List<Map.Entry<String, String>> list = new ArrayList(map.entrySet());
		Collections.sort(list, (Comparator<Map.Entry<String, String>>)(e1,e2)-> e1.getValue().compareTo(e2.getValue()));
		Map<String, String> map2 = new LinkedHashMap<String, String>();
		for (Entry<String, String> entry : list) {
			map2.put(entry.getKey(), entry.getValue());
		}
		return map2;
	}
}

class Employee implements Comparable<Employee> {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	Integer id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(Employee arg0) {
		return arg0.id.compareTo(this.id);
			
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}*/
}

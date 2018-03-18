package com.osi.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparator {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(3, "Zayed", 78));
		list.add(new Student(1, "Pradeep", 85));
		list.add(new Student(2, "Anthony", 57));
		Collections.sort(list);
		System.out.println("Sorting by Id (Comparable)");
		Collections.reverse(list);
		for (Student student : list) {
			System.out.println(student);
		}
		
		
		NameSorting nameSorting = new NameSorting();
		Collections.sort(list, nameSorting);
		System.out.println("Sorting by Name (Comparator)");
		for (Student student : list) {
			System.out.println(student);
		}
		
		MarksSorting marksSorting = new MarksSorting();
		Collections.sort(list, marksSorting);
		System.out.println("Sorting by Marks (Comparator)");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}

class Student implements Comparable<Student> {
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int compareTo(Student stud) {
		return this.id - stud.id;
	}
	
	@Override
	public String toString() {
		return "Id: "+this.id +"Name: "+ this.name +"Marks: "+ this.marks;
	}
}


class NameSorting implements Comparator<Student> {
	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.name.compareTo(stud2.name);
	}
}

class MarksSorting implements Comparator<Student> {
	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.marks - stud2.marks;
		/*if(stud1.marks > stud2.marks) return 1;
		else if(stud1.marks < stud2.marks) return -1;
		else return 0;*/
	}
}
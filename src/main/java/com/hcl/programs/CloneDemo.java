package com.hcl.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class User implements Cloneable {
	Integer id;
	String name;
	Map<Integer,String> marks;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, String> getMarks() {
		return marks;
	}
	public void setMarks(Map<Integer, String> marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Id: "+this.id+" Name: "+this.name+" Marks:");
		for (Entry<Integer, String> entry : this.marks.entrySet()) {
			str.append(" "+entry.getValue());
		}
		return str.toString();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		User newUser = (User) super.clone();
		newUser.setMarks(null);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (Entry<Integer, String> entry : this.marks.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
		}
		newUser.setMarks(map);
		return newUser;
	}
}

public class CloneDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		User user = new User();
		user.setId(1);
		user.setName("Pradeep");
		Map<Integer,String> marks = new HashMap<Integer,String>();
		marks.put(1, "80%");
		marks.put(2, "75%");
		user.setMarks(marks);
		
		User userClone = (User) user.clone();
		user.setName("Pravin");
		System.out.println(user);
		System.out.println(userClone);
		System.out.println("user == userCopy: "+ (user == userClone));
		System.out.println("marks = "+(user.getMarks() == userClone.getMarks()));

		User userCopy = user;
		user.setName("Raj");
		System.out.println(user);
		System.out.println(userCopy);
		System.out.println("user == userCopy: "+ (user == userCopy));
		System.out.println("marks = "+(user.getMarks() == userCopy.getMarks()));
	}

}

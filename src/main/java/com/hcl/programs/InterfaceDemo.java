package com.hcl.programs;
public class InterfaceDemo {

	public static void main(String[] args) {
		A obj = new C();
		obj.display();

	}

}

interface A {
	void display();
}

interface B {
	void display();
}

class C implements A,B {

	@Override
	public void display() {
		System.out.println("Display from C");
	}
	
}
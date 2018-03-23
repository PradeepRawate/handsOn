package com.hcl.programs;

class Outer {
	static int staticInt = 10;
	int nonStaticInt = 20;
	
	class InnerClass {
		void display() {
			System.out.println("InnerClass ...staticInt : "+staticInt+" nonStatic : "+nonStaticInt);
		}
	}
	
	static class StaticInnerClass {
		int i = 50;
		void display() {
			System.out.println("InnerClass ...staticInt : "+staticInt+" nonStatic : "+i);
		}
	}
	
}



public class StaticDemo {
	public static void main(String[] args) {
		Outer.InnerClass inner = new Outer().new InnerClass();
		inner.display();
		
		Outer.StaticInnerClass staticInner = new Outer.StaticInnerClass();
		Outer.StaticInnerClass staticInner2 = new Outer.StaticInnerClass();
		staticInner2.i = 60;
		staticInner.display();
		staticInner2.display();
	}
}

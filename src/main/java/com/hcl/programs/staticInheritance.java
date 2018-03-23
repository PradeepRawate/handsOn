package com.hcl.programs;

class staticInheritance {  
   public static void main(String args[])
   {
	   Bb b = new Bb();
	   Bb.display();
   }
}

class Aa {
	static int i =10 ;
	static void display() {
		System.out.println("Static Method of A");
		System.out.println("i : "+ i);
	}
	
}

class Bb extends Aa {
	Bb() {
		++i;
	}
	
//	static int i =20 ;
	static void display() {
		System.out.println("Static Method of B");
		System.out.println("i : "+ (++i + 4));
	}
	
}
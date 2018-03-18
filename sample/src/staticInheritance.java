
class staticInheritance {  
   public static void main(String args[])
   {
	   B b = new B();
	   B.display();
   }
}

class A {
	static int i =10 ;
	static void display() {
		System.out.println("Static Method of A");
		System.out.println("i : "+ i);
	}
	
}

class B extends A {
	B() {
		++i;
	}
	
//	static int i =20 ;
	static void display() {
		System.out.println("Static Method of B");
		System.out.println("i : "+ (++i + 4));
	}
	
}
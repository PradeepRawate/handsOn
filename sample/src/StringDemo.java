
public class StringDemo {

	public static void main(String[] args) {
		StringDemo demo = new StringDemo();
		String str = "Hello";
		String str2 = new String("Hello");
		System.out.println(str == str2);
		System.out.println(str2.concat("JAVA"));
//		String str = "Hello";
//		demo.display(str);
		str = str + "Pradeep";
		System.out.println(str);
		int i = (byte) + (char) - (int) + (long) - 1;
		 
        System.out.println(i);

	}
	
	void display(String str) {
		str = str + "Pradeep";
	}

}

public class FinalDemo {
	final int i;
	public FinalDemo(int num) {
		i = num;
	}
	public static final void main(String[] args) {
		Example ex= new Example(100);
		ex.display();
	}
	
	final void display() {
		System.out.println("Parent : "+i);
	}
	
	final void display(int i) {
		System.err.println(i);
	}
}

final class Example extends FinalDemo {

	public Example(int num) {
		super(num);
	}
}


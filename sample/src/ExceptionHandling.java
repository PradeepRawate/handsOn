import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ExceptionHandling {

	public static void main(String[] args) {
		/*Sample a = new Sample();
		try {
			a.getResult(5);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getSuppressed());
		}*/
		Demo2 demo2 = new Demo2();
		demo2.writeList();
	}

}

class Sample {
	void getResult(int num) throws Exception {
		Integer sum = num +10;
		sum = sum + getResult2(sum);
		System.out.println("getResult : "+sum);
	}
	
	Integer getResult2(int num) throws Exception {
		Integer sum = num + 20;
		sum = sum + getResult3(sum);
		System.out.println("getResult2 : "+sum);
		return sum;
	}
	
	@SuppressWarnings("finally")
	Integer getResult3(int num) throws Exception {
		Integer sum = null;
		try {
			sum = num / 0;
			System.out.println("getResult3 : "+sum);
			return sum;
		} catch (ArithmeticException e) {
			throw new Exception("Exception in getResult3");
		}
		finally {
			throw new Exception("Exception from Finally");
		}
	}
}

class Demo2 {
	public void writeList() {
	    PrintWriter out = null;
	    List<String> list = new ArrayList<String>();
	    list.add("Pradeep");

	    try {
	        System.out.println("Entering" + " try statement");

	        out = new PrintWriter(new FileWriter("OutFile.txt"));
	        for (int i = 0; i < list.size(); i++) {
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.err.println("Caught IndexOutOfBoundsException: "
	                           +  e.getMessage());
	                                 
	    } catch (IOException e) {
	        System.err.println("Caught IOException: " +  e.getMessage());
	                                 
	    } finally {
	        if (out != null) {
	            System.out.println("Closing PrintWriter");
	            out.close();
	        } 
	        else {
	            System.out.println("PrintWriter not open");
	        }
	    }
	}
}




import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class demoCollect {
	
	public static void main(String[] args) {
		Map<Integer, String> mapd = new HashMap<Integer, String>();
		mapd.put(1, "Pradeeep");
		mapd.put(2, "Pradeeep");
		mapd.put(3, "Pradeeep");
		
		
		long startTime = System.nanoTime();
		Iterator<Entry<Integer, String>> iterable = mapd.entrySet().iterator();
		while (iterable.hasNext()) {
			System.out.println(iterable.next());
		}
		long stopTime = System.nanoTime();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime);
		
		long startTime1 = System.nanoTime();
		for (Entry<Integer, String> entry : mapd.entrySet()) {
			System.out.println(entry);
		}
		long stopTime1 = System.nanoTime();
		long elapsedTime1 = stopTime1 - startTime1;
		System.out.println(elapsedTime1);
		
		long startTime2 = System.nanoTime();
		for (Integer key : mapd.keySet()) {
			System.out.println(mapd.get(key));
		}
		long stopTime2 = System.nanoTime();
		long elapsedTime2 = stopTime2 - startTime2;
		System.out.println(elapsedTime2);
		
	}

}



package maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMaps implements Runnable {
	
	Map<Integer, Integer> map = new ConcurrentHashMap<>();
	
	public void run() {
		for(int i=0; i<10; i++) {
				((ConcurrentHashMap<Integer, Integer>) map).putIfAbsent(i, i);	
		}
		Set<Entry<Integer,Integer>> set = map.entrySet();
		System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new ConcurrentMaps());
		t.start();
	}

}

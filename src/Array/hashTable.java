package Array;

import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		
		
		Hashtable h= new Hashtable();
		
		h.put(10, 100);
		h.put("name", "vishnu");
		h.put('a', 'k');
		h.put(1, 12.22);
		
		System.out.println(h.get(1));
		for(int l=0; l<h.size(); l++) {
			
			System.out.println(h.get(l));
		}
		
		Hashtable<Integer, Integer> h1= new Hashtable<Integer, Integer>();
		h1.put(1, 100);
		h1.put(2, 200);
		
		Hashtable<Integer, String> h3= new Hashtable<Integer, String>();
		h3.put(4, "vishnu");
		
		
		
		
		
		
		
		

	}

}

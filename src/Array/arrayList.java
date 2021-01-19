package Array;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		
		ArrayList ar= new ArrayList();
		
		ar.add(100);
		ar.add("vishnu");
		ar.add(12.33);
		ar.add(true);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		
		for(int k=0; k<ar.size(); k++) {
			System.out.println(k);
		}
		System.out.println("*************************");
		
		ArrayList<Integer> ar1= new ArrayList();
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		ar1.add(400);
		System.out.println(0);
		
		for(int m=0; m<ar1.size(); m++) {
			
			System.out.println(ar.get(m));
		}
		
		
		
		
		
	}

}

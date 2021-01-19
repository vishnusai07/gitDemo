package OverLoading;

public class childClassforOverloading extends overLoading {

	public void car() {
		System.out.println("child class method");
	}
	
	
	public static void main(String[] args) {

		childClassforOverloading ch_ol= new childClassforOverloading();
		ch_ol.car();
		ch_ol.a();
		
		String n=ch_ol.name();
		
		System.out.println(n);
		
		childClassforOverloading.k();
		childClassforOverloading.Bank();
		
		
		double d= childClassforOverloading.m();
		System.out.println(d);
		
		System.out.println("***********************************");
		
		overLoading ol= new childClassforOverloading();
		ol.a();
		String g=ol.name();
		System.out.println(g);
		overLoading.k();
		
		
		
		
		
	}

}

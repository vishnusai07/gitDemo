package OverLoading;

public class subChildclass extends childClassforOverloading {

	public static void main(String[] args) {
		
		subChildclass sc= new subChildclass();
		sc.car();
		sc.a();
		sc.parent();
		
		
		System.out.println("*******************");
		overLoading ol1=new subChildclass();
		ol1.name();

	}

}

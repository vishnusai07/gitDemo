package core_Java;

public class Variables {
	
	//instance variables
	int a=10;
	String Moviename= "vishnu";
	
	//static variables
	static String Producer="alluaravind";
	
	
	//non-static method
	public void Hero() {
		
		//local variables
		int a=100;
		boolean b= true;		
		System.out.println("Pawan Kalyan");
		System.out.println(a);
		System.out.println(b);
	}

	//static method
	public static String Heroin() {
		
		return "Nitya menon";
	}
	
	public static void main(String[] args) {
	
		Variables Var= new Variables();//object created 
		Var.Hero();//not static method called by object name
		System.out.println(Variables.Heroin()); //static method called by class name
		Variables.Heroin();//static method called directly by  call name
		Heroin();//static methods can call by method name
		
		System.out.println(Var.Moviename); // Instance variables called by object referece
		System.out.println(Var.a);
		
		
		

	}

}

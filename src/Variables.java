
public class Variables {

	
	int a=100;
	static int b=200;
	int k;
	
	public void number() {
		
		int num1=4791;
		int num2=5207;
		
		System.out.println(num1 + num2);
	}
	
	public static String name() {
		String firstName="Sai";
		
		System.out.println(firstName);
		return "vishnu";
	}
	public static void main(String[] args) {
		
		Variables v= new Variables();
		v.number();
		name();
		System.out.println(v.a);
		System.out.println(b);
		
		
		
		


		
		
		
		

	}

}

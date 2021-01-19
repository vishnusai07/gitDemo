package Interface;

public class absa implements bankInterface {

	public void login() {
		
		System.out.println("absa login functionality");
	}

	
	public void viewBalanc() {
		//
		System.out.println("absa view balance functionality");
	}
	
	public void loan() {
		System.out.println("loan functionality");
	}
	public String userDetails() {
		
		
		return "userDetails";
		
	}
	
	

}

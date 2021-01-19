package core_Java;

public class OverRiding {
	
	
	public void sum() {
		System.out.println("0 arg method");
	}
	public void sum(int a) {
		System.out.println("1 arg method");
	}
	public void sum(int k, int d) {
		System.out.println("2 arg method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	OverRiding or = new OverRiding();
			or.sum();
	        or.sum(100);
	        or.sum(200, 500);
		
	}

}

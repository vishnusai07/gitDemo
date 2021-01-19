package Abstract;

public abstract class main {
	
	int a;
	String name;
	
	public abstract void first();// abstarct method 
	
	
	public int third(int k) {
		this.a=k;
		return k;
	}
	public void main() //==> we can define constrctors in abstract class
	{
		System.out.println("abstract class constructor");
	}
	
	/*note:
		1.abstraction can be achieved with either abstract class or interface
		2. abstract is a non static modifier 
		3. abstract class/method must be declared with abstract keyword
		4. abstract class can have abstract and non-abstract methods
		5.abstract class contains constructors and static methods
		6.abstract method declared with abstract keyword and does not have implementations is known as abstract method
		*/
		
	
	

}

package Array;

public class single_Dimensional {

	public static void main(String[] args) {

		System.out.println("******** int **********");
		int i[]= new int[2];
		i[0]= 10;
		i[1]= 20;
		
		System.out.println(i[1]);
		//System.out.println(i[2]);  ArrayIndexOutOfBoundsException
		System.out.println(i.length + "array length");
		
		for(int a=0; a<i.length; a++) {
			System.out.println(i[a]);
			}
		
		System.out.println("******** String **********");
		
		String name[]= new String[3];
		name[0]="vishnu";
		name[1]="sai";
		name[2]="kode";
		
		System.out.println(name.length);
		System.out.println(name[0] + name[2]);
		
		

	}

}

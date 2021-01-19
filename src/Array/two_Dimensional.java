package Array;

public class two_Dimensional {

	public static void main(String[] args) {
		
		String i[][]= new String[3][3];
		
		 i[0][0]= "S.no";
		 i[0][1]= "Name";
		 i[0][2]= "Sur name";
		 i[1][0]= "1";
		 i[1][1]= "vishnu";
		 i[1][2]= "Kode";
		 
		 System.out.println(i.length);
		 
		 for(int r=0; r<i.length; r++) {
			 for(int c=0; c<i[0].length; c++) {
				 
				 System.out.println(i[r][c]);
				 
			 }
			
			 
			 
		 }
		 
		 
		 
		
		
		
		

	}

}

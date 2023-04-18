package Array;

public class Class_Assignment {

	public static void main(String[] args) {
		
		String[][] S1 = new String[2][3];
		S1[0][0] = "Java";
		S1[0][1] = "Java1";
		S1[0][2]="Java2";
		
		S1[1][0] = "Python";
		S1[1][1]="Python1";
		S1[1][2]="Python2";
		
		for(int i=0; i<S1.length;i++) {
			for(int j=0;j<S1[i].length;j++) {
			System.out.println(S1[i][j] +"");
			
		}
		System.out.println();
		}
		System.out.println("--------------------------------------------");
		System.out.println("**********************************************");
		
		
		String[][]S2= {{"Java","Java1","Java2"},
				
				{"Python","Python1","Python2"}};

		for(int i=0; i<S2.length;i++) {
			for(int j=0;j<S2[i].length;j++) {
			System.out.println(S2[i][j] +"");
			
	
	
	}
}
	}
}

	




		
				
		      
		
		
		
	

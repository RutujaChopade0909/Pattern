package pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=6;
		char a='F';
			      for (int i = 1; i <=s; i++) {
			    	  char  b=a;
			       for (int j = 1; j <=i ; j++) {
			           System.out.print(b--);


			       }
			
			       System.out.println();

			   }
	}

}


//F
//FE
//FED
//FEDC
//FEDCB
//FEDCBA

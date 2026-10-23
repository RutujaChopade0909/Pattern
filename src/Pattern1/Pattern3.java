package Pattern1;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=5;
		 char a='F';
		      for (int i = 1; i <=s; i++) {
		    	  char b=a;
		       for (int j = i; j <=s ; j++) {
		           System.out.print(b--);


		       }
		       System.out.println();

		   }
	}

}

//FEDCB
//FEDC
//FED
//FE
//F
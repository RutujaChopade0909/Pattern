package Pattern5;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=5; 
        char a='A';
	     for (int i = 1; i <=size; i++) { 
	    	 char b=a;
	         for (int j= i+1; j <=size ; j++) { 
	             System.out.print(" "); 

	         } 
	         for (int j = 1; j<=i ; j++) { 
	             System.out.print(b+++" "); 
	         } 
	         System.out.println(); 
	     }
		
	}

}


//    A 
//   A B 
//  A B C 
// A B C D 
//A B C D E 
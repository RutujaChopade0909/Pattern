package Pattern5;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
            int size=5; 
     for (int i = 1; i <=size; i++) { 
         for (int j= i+1; j <=size ; j++) { 
             System.out.print(" "); 

         } 
         for (int j = 1; j<=i ; j++) { 
             System.out.print("*"); 
         } 
         System.out.println(); 
     }

	}

}

//    * 
//   ** 
//  *** 
// **** 
//***** 
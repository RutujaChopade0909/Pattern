package Pattern1;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        int s=5;
 char a='A';
      for (int i = 1; i <=s; i++) {
    	  char b=a;
       for (int j = i; j <=s ; j++) {
           System.out.print(b++);


       }
       System.out.println();

   }

	}

}


//ABCDE
//ABCD
//ABC
//AB
//A
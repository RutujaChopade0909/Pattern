package Pattern4;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 5; 
		int a=1;
        for (int i = 1; i <= size; i++) { 
         
        	int b=a;

            for (int j = i; j <= size; j++) { 
                System.out.print(b++); 

            } 
          
            System.out.println(); 

        } 
        for (int i = 2; i <= size; i++) { 
        	int b=a;
            for (int j = 1; j <= i; j++) { 
                System.out.print(b++); 

            } 
          
            System.out.println(); 
        }

	}

}

//12345
//1234
//123
//12
//1
//12
//123
//1234
//12345
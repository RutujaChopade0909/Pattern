package Pattern4;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = 6; 
		char  a='F';
        for (int i = 1; i <= size; i++) { 
         
        	char b=a;

            for (int j = i; j <= size; j++) { 
                System.out.print(b--); 

            } 
          
            System.out.println(); 

        } 
        for (int i = 2; i <= size; i++) { 
        	char b=a;
            for (int j = 1; j <= i; j++) { 
                System.out.print(b--); 

            } 
          
            System.out.println(); 
        }
	}

}

//FEDCBA
//FEDCB
//FEDC
//FED
//FE
//F
//FE
//FED
//FEDC
//FEDCB
//FEDCBA
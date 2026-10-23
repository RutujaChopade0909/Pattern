package Pattern4;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; 
		int a=1;
        for (int i = 1; i <= size; i++) { 
         
        	int b=a;

            for (int j = i; j <= size; j++) { 
                System.out.print(b); 

            } 
            a++;
            System.out.println(); 

        } 
        for (int i = 2; i <= size; i++) { 
        	int b=a;
            for (int j = 1; j <= i; j++) { 
                System.out.print(b); 

            } 
            a++;
            System.out.println(); 
        }

	}

}

//11111
//2222
//333
//44
//5
//66
//777
//8888
//99999


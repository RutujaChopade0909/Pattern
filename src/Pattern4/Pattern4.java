package Pattern4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5; 
		char a='A';
        for (int i = 1; i <= size; i++) { 
         
        	char b=a;

            for (int j = i; j <= size; j++) { 
                System.out.print(b); 

            } 
            a++;
            System.out.println(); 

        } 
        for (int i = 2; i <= size; i++) { 
        	char b=a;
            for (int j = 1; j <= i; j++) { 
                System.out.print(b); 

            } 
            a++;
            System.out.println(); 
        }

	}

}


//AAAAA
//BBBB
//CCC
//DD
//E
//FF
//GGG
//HHHH
//IIIII

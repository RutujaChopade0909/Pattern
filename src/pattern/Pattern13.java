package pattern;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=5;
		
		int c=5;
		for(int i=0;i<a;i++) {
			int d=c;
			for(int j=0;j<a;j++) {
				if(j<=i) {
					System.out.print(d++);
				
				}
				else {
					System.out.print("5");
				}
			}
			System.out.println();
		
			c--;
		}
	}

}
//
//55555
//45555
//34555
//23455
//12345
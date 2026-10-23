package Pattern2;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int irange=9;
		int jrange=5;
		int start=1;
		int a=1;
		for(int i=0;i<irange;i++) {
			int b=a;
			for(int j=0;j<jrange;j++) {
				if(j<start)
				{
					System.out.print(b++);
					}
				
			}
			System.out.println();
			if(i<4) {
				start++;
			}
			else {
				start--;
			}
		}
	}

}

//1
//12
//123
//1234
//12345
//1234
//123
//12
//1

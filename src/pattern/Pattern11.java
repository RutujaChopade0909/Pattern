package pattern;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=5;
		for(int i=0;i<a;i++) {
			for(int j=0;j<=i;j++) {
				if(j%2==0) {
				System.out.print("1");
			}
			else {
				System.out.print("0");
			}
			}
			System.out.println();
			
		}
	}

}
//1
//10
//101
//1010
//10101

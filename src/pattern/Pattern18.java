package pattern;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int start=8;
		for(int i=0;i<a;i=i+2) {
			for(int j=0;j<a;j++) {
				if(j>=start) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
			start=start-2;
			//start--;
		}

	}

}

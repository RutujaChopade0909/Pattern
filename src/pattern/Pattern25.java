package pattern;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int irange=9;
		int jrange=9;
		int start=1;
		for(int i=1;i<=irange;i++) {
			for(int j=1;j<=jrange;j++) {
				if(j>=start && j<=jrange) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			if(i<5) {
				start++;
				jrange--;
			}
			else {
				start--;
				jrange++;
			}
			System.out.println();
		}

	}

}

//*********
// *******
//  *****
//   ***
//    *
//   ***
//  *****
// *******
//*********
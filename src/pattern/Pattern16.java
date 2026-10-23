package pattern;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int irange=5;
		int jrange=10;
		for(int i=0;i<irange;i++) {
			for(int j=0;j<jrange;j++) {
				if((i+j==5)|| (i+j==9)||
						(i==0) && (j==5 || j==6||j==7||j==8||j==9) ||
						(i==4) && ( j==1 || j==2||j==3||j==4||j==5)
						) {
					System.out.print("*");
					
					
				}
				else {
				System.out.print(" ");
			}
		}
			System.out.println();
	}

}
}

//
//    *****
//   *   * 
//  *   *  
// *   *   
//*****    

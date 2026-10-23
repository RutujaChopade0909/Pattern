package pattern;

public class Pattern19 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int a=9;
	int start=1;int end=1;
		for(int i=0;i<a;i=i+2) {
			for(int j=0;j<=a;j++) {
				if(j>=start && j<=end) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			start++;end--;
		

	}

}
}


//		   *
//	      ***
//	     *****
//	    *******
//	   *********
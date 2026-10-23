package pattern;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=5;
 int b=9;
 
 int start=5;int end=5;
 int mid=(start+end)/2;
 int c=1;
 for(int i=1;i<=a;i++) {
	 int d=c;
	 for(int j=1;j<=b;j++) {
		 if(j>=start && j<=end) {
			 if(j<mid) {
			 System.out.print(d++);
		 }
			 else {
				 System.out.print(d--);
			 }
		 }
		 else {
			 System.out.print(" ");
		 }
		 
	 }
	 end++;start--;
	 System.out.println();
 }
	}

}
